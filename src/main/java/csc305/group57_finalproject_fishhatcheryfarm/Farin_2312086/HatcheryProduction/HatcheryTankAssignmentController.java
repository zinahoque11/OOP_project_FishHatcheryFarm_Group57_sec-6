package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class HatcheryTankAssignmentController
{
    @javafx.fxml.FXML
    private TableColumn<HatcheryTankAssignment, String> batchIDtableColumn;
    @javafx.fxml.FXML
    private TableColumn<HatcheryTankAssignment, String> assignedTankTablecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> batchIDCombobox;
    @javafx.fxml.FXML
    private TextField eggsizeTextField;
    @javafx.fxml.FXML
    private TableColumn<HatcheryTankAssignment, String> tankIDTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<HatcheryTankAssignment, String> SpeciesTablecolumn;
    @javafx.fxml.FXML
    private TableView<HatcheryTankAssignment> tableview;
    @javafx.fxml.FXML
    private TextField TankIdTextfield;
    @javafx.fxml.FXML
    private TableColumn<HatcheryTankAssignment, Double> eggsizetablecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> speciesCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> filterComboBox;
    @javafx.fxml.FXML
    private TextField AssignedTankTextfield;
    @javafx.fxml.FXML
    private TableColumn<HatcheryTankAssignment, String> StstusTablecolumn;
    ArrayList<HatcheryTankAssignment> List = new ArrayList<>();
    HatcheryTankAssignment hatcheryTankAssignment;

    @javafx.fxml.FXML
    public void initialize() {
        batchIDCombobox.getItems().addAll("b-101", "b-102");
        speciesCombobox.getItems().addAll("Tilapia", "Rui");
        filterComboBox.getItems().addAll("All", "Assigned");
        batchIDtableColumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        tankIDTablecolumn.setCellValueFactory(new PropertyValueFactory<>("tankId"));
        SpeciesTablecolumn.setCellValueFactory(new PropertyValueFactory<>("species"));
        eggsizetablecolumn.setCellValueFactory(new PropertyValueFactory<>("eggSize"));
        assignedTankTablecolumn.setCellValueFactory(new PropertyValueFactory<>("assignedTank"));
        StstusTablecolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void assigntankButton(ActionEvent actionEvent) {
        String status = "Active";
        hatcheryTankAssignment= new HatcheryTankAssignment(batchIDCombobox.getValue(),TankIdTextfield.getText(),speciesCombobox.getValue()
                ,AssignedTankTextfield.getText(), Double.parseDouble(eggsizeTextField.getText()),status);

        List.add(hatcheryTankAssignment);
        tableview.getItems().addAll(List);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("AssignedHatchery.bin", true));
            writer.write(hatcheryTankAssignment.getBatchId() + "," + hatcheryTankAssignment.getAssignedTank() + "," + hatcheryTankAssignment.getSpecies() +
                    "," + hatcheryTankAssignment.getStatus() + "," + hatcheryTankAssignment.getTankId() + "," + hatcheryTankAssignment.getEggSize() + "\n");
            writer.close();

        } catch (Exception e) {
        }
    }

    @javafx.fxml.FXML
    public void clearbutton(ActionEvent actionEvent) {
        tableview.getItems().clear();
        tableview.getItems().addAll(List);
    }

    @javafx.fxml.FXML
    public void filterButton(ActionEvent actionEvent) {
        tableview.getItems().clear();
        String selectedFilter = filterComboBox.getValue();

        if (selectedFilter == null || selectedFilter.equals("All")) {
            tableview.getItems().addAll(List);
            return;
        }

        for (HatcheryTankAssignment item : List) {
            if (item.getStatus().equalsIgnoreCase(selectedFilter)) {
                tableview.getItems().add(item);
            }
        }
    }
}