package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArchivedHatchBatchController {

    @javafx.fxml.FXML
    private TableColumn<ArchivedHatchBatch, LocalDate> CompletionDateTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ArchivedHatchBatch, String> StatusTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ArchivedHatchBatch, String> SpeciesTablecolumn;
    @javafx.fxml.FXML
    private TableView<ArchivedHatchBatch> Tableview;
    @javafx.fxml.FXML
    private TableColumn<ArchivedHatchBatch, String> BatchIDTablecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> batchIDCombobox;


    ArrayList<ArchivedHatchBatch> list = new ArrayList<>();
    ArchivedHatchBatch archivedHatchBatch;

    @javafx.fxml.FXML
    public void initialize() {
        batchIDCombobox.getItems().addAll("b-101", "b-102");

        // PropertyValueFactory-এর সাথে Model Class-এর Getter মেথডের নাম মিলিয়ে নেবেন
        BatchIDTablecolumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        SpeciesTablecolumn.setCellValueFactory(new PropertyValueFactory<>("species"));
        StatusTablecolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        CompletionDateTablecolumn.setCellValueFactory(new PropertyValueFactory<>("completionDate"));
    }

    @FXML
    public void deleteButton(ActionEvent actionEvent) {
        ArchivedHatchBatch selectedBatch = Tableview.getSelectionModel().getSelectedItem();
        if (selectedBatch != null) {
            list.remove(selectedBatch);
            Tableview.getItems().remove(selectedBatch);
        }
    }

    @FXML
    public void reloadButton(ActionEvent actionEvent) {
        Tableview.getItems().clear();
        Tableview.getItems().addAll(list);
    }
}