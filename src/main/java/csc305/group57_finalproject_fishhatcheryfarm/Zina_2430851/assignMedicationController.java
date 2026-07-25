package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class assignMedicationController
{
    @javafx.fxml.FXML
    private TableColumn<Medication, String> medNameColumn;
    @javafx.fxml.FXML
    private TextField durationTF;
    @javafx.fxml.FXML
    private ComboBox<String> fishspeciesCB;
    @javafx.fxml.FXML
    private TextField medNameTF;
    @javafx.fxml.FXML
    private TextField tankIdTF;
    @javafx.fxml.FXML
    private TableColumn<Medication, String> tankIDcolumn;
    @javafx.fxml.FXML
    private TextField medDosageTF;
    @javafx.fxml.FXML
    private TableColumn<Medication, Float> medDosageColumn;
    @javafx.fxml.FXML
    private TableColumn<Medication, String> speciesColumn;
    @javafx.fxml.FXML
    private TableView<Medication> medTableView;
    @javafx.fxml.FXML
    private TableColumn<Medication, Integer> durationColumn;

    @javafx.fxml.FXML
    public void initialize() {
        fishspeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        tankIDcolumn.setCellValueFactory(new PropertyValueFactory<>("tankID"));
        speciesColumn.setCellValueFactory(new PropertyValueFactory<>("fishSpecies"));
        medNameColumn.setCellValueFactory(new PropertyValueFactory<>("medType"));
        medDosageColumn.setCellValueFactory(new PropertyValueFactory<>("dosage"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("medDurationDays"));

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignMedButton(ActionEvent actionEvent) {
    }
}