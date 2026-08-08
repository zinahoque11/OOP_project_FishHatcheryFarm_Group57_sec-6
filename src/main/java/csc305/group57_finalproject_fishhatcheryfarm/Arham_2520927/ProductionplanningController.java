package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ProductionplanningController {

    @FXML private TextField targetfishquantitytext;
    @FXML private TextField fishtypetext;
    @FXML
    private DatePicker deadlinedatepicker;

    @FXML private TableView<productionplanning> productiontplanningtable;
    @FXML private TableColumn<productionplanning, Integer> targetfishquantitytabcol;
    @FXML private TableColumn<productionplanning, String> fishtypetabcol;
    @FXML private TableColumn<productionplanning, LocalDate> deadlinetabcol;
    @FXML private TableColumn<productionplanning, String> statustabcol;

    private ObservableList<productionplanning> planningData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        // Bind table columns to model properties
        targetfishquantitytabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getTargetFishQuantity()));
        fishtypetabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getFishType()));
        deadlinetabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getDeadline()));
        statustabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getStatus()));

        productiontplanningtable.setItems(planningData);
    }

    @FXML
    private void updatebutton(ActionEvent event) {
        try {
            int targetQuantity = Integer.parseInt(targetfishquantitytext.getText());
            String fishType = fishtypetext.getText();
            LocalDate deadline = deadlinedatepicker.getValue();
            String status = "Planned"; // default status

            productionplanning newPlan = new productionplanning(targetQuantity, fishType, deadline, status);
            planningData.add(newPlan);

            showSuccessAlert("Production plan updated successfully!");
        } catch (Exception e) {
            showErrorAlert("Invalid input. Please check your entries.");
        }
    }

    @FXML
    private void Backbutton(ActionEvent event) {
        // Logic to go back to previous screen
        System.out.println("Back button clicked.");
    }

    private void showSuccessAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showErrorAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}