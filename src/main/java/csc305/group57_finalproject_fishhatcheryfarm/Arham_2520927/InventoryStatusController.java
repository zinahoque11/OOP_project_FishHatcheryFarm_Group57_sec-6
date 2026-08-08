package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class InventoryStatusController {

    @FXML private TextField searchitemstext;
    @FXML private ComboBox<String> categorycombo;
    @FXML private DatePicker lastupdatedatepicker;
    @FXML private TextArea remarkstext;

    @FXML private TableView<inventorystatus> inventorystatustable;
    @FXML private TableColumn<inventorystatus, String> categorytabcol;
    @FXML private TableColumn<inventorystatus, String> itemnametabcol;
    @FXML private TableColumn<inventorystatus, Integer> quantitytabcol;
    @FXML private TableColumn<inventorystatus, String> statustabcol;
    @FXML private TableColumn<inventorystatus, LocalDate> lastupdatedtabcol;

    private ObservableList<inventorystatus> inventoryData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        // Bind table columns to model properties
        categorytabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCategory()));
        itemnametabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getItemName()));
        quantitytabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getQuantity()));
        statustabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getStatus()));
        lastupdatedtabcol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getLastUpdated()));

        inventorystatustable.setItems(inventoryData);

        // Populate category options
        categorycombo.setItems(FXCollections.observableArrayList("Feed", "Equipment", "Medicine", "Supplies"));
    }

    @FXML
    private void updatebutton(ActionEvent event) {
        try {
            String category = categorycombo.getValue();
            String itemName = searchitemstext.getText();
            int quantity = (int) (Math.random() * 100); // placeholder, can be linked to another input
            String status = (quantity < 10) ? "Low Stock" : "In Stock";
            LocalDate lastUpdated = lastupdatedatepicker.getValue();
            String remarks = remarkstext.getText();

            inventorystatus newItem = new inventorystatus(category, itemName, quantity, status, lastUpdated, remarks);
            inventoryData.add(newItem);

            showSuccessAlert("Inventory updated successfully!");
        } catch (Exception e) {
            showErrorAlert("Invalid input. Please check your entries.");
        }
    }

    @FXML
    private void backbutton(ActionEvent event) {
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