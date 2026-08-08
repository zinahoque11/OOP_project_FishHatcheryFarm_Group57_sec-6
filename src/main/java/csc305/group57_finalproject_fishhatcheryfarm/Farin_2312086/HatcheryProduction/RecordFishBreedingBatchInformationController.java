package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class RecordFishBreedingBatchInformationController {

    @javafx.fxml.FXML
    private TextField parentIDTextfield;
    @javafx.fxml.FXML
    private DatePicker SwapingdateDatepicker;
    @javafx.fxml.FXML
    private TableColumn<BreedingBatch, String> fertilizationMethodColumn;
    @javafx.fxml.FXML
    private ComboBox<String> fertilizationMethodCombobox;
    @javafx.fxml.FXML
    private TableView<BreedingBatch> Tableview;
    @javafx.fxml.FXML
    private TextField SpeciesTextField;
    @javafx.fxml.FXML
    private TableColumn<BreedingBatch, String> parentidTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<BreedingBatch, String> batchidtablecolumn;
    @javafx.fxml.FXML
    private TableColumn<BreedingBatch, LocalDate> datetablecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> breedingmethodCombobox;
    @javafx.fxml.FXML
    private TableColumn<BreedingBatch, String> speciestablecolumn;
    @javafx.fxml.FXML
    private TextField searchtextfield;
    @javafx.fxml.FXML
    private TextField BatchIDTextfield;
    @javafx.fxml.FXML
    private TableColumn<BreedingBatch, String> breedingmethodTablecolumn;
    ArrayList<BreedingBatch> List=new ArrayList<>();
    BreedingBatch breedingBatch;

    @javafx.fxml.FXML
    public void initialize() {
        // 1. Dropdown (ComboBox) Option Population
        breedingmethodCombobox.getItems().addAll("Natural", "Artificial", "Induced");
        fertilizationMethodCombobox.getItems().addAll("Dry Method", "Wet Method");

        // 2. Map TableView Columns with Model Class Properties
        batchidtablecolumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        speciestablecolumn.setCellValueFactory(new PropertyValueFactory<>("fishSpecies"));
        parentidTablecolumn.setCellValueFactory(new PropertyValueFactory<>("parentStockId"));
        breedingmethodTablecolumn.setCellValueFactory(new PropertyValueFactory<>("breedingMethod"));
        fertilizationMethodColumn.setCellValueFactory(new PropertyValueFactory<>("fertilizationMethod"));
        datetablecolumn.setCellValueFactory(new PropertyValueFactory<>("spawningDate"));
    }

    @javafx.fxml.FXML
    public void Addbreedingbatchbutton(ActionEvent actionEvent) {
        String batchId = BatchIDTextfield.getText();
        String species = SpeciesTextField.getText();
        String parentId = parentIDTextfield.getText();
        String breedingMethod = breedingmethodCombobox.getValue();
        String fertilizationMethod = fertilizationMethodCombobox.getValue();
        LocalDate spawningDate = SwapingdateDatepicker.getValue();

        // Create Model Instance
        breedingBatch = new BreedingBatch(
                batchId,
                species,
                parentId,
                breedingMethod,
                fertilizationMethod,
                spawningDate
        );

        // Add item directly to TableView
        Tableview.getItems().add(breedingBatch);

        // Save data to text file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("BreedingBatch.txt", true));
            writer.write(
                    breedingBatch.getBatchId() + "," +
                            breedingBatch.getFishSpecies() + "," +
                            breedingBatch.getParentStockId() + "," +
                            breedingBatch.getBreedingMethod() + "," +
                            breedingBatch.getFertilizationMethod() + "," +
                            breedingBatch.getSpawningDate() + "\n"
            );
            writer.close();
        } catch (Exception e) {

        }
    }

    @FXML
    public void clearbutton(ActionEvent actionEvent) {
        BatchIDTextfield.clear();
        SpeciesTextField.clear();
        parentIDTextfield.clear();
        searchtextfield.clear();
        breedingmethodCombobox.setValue(null);
        fertilizationMethodCombobox.setValue(null);
        SwapingdateDatepicker.setValue(null);
    }

    @FXML
    public void searchbutton(ActionEvent actionEvent) {
        String searchText = searchtextfield.getText().trim();

        if (searchText.isEmpty()) {
            return;
        }

        for (BreedingBatch batch : Tableview.getItems()) {
            if (batch.getBatchId().equalsIgnoreCase(searchText)) {
                Tableview.getSelectionModel().select(batch);
                break;
            }
        }
    }
}