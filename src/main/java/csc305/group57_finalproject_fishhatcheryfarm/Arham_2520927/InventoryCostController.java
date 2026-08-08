package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryCostController {
    @javafx.fxml.FXML
    private TableColumn<inventoryCost, Integer> quantitytabcol;
    @javafx.fxml.FXML
    private DatePicker costperioddatepicker;
    @javafx.fxml.FXML
    private TableColumn<inventoryCost, String> categorytabcol;
    @javafx.fxml.FXML
    private TextField itemnametext;
    @javafx.fxml.FXML
    private TableColumn<inventoryCost, Float> unitpricetabcol;
    @javafx.fxml.FXML
    private TableColumn<inventoryCost, Float> totalpricetabcol;
    @javafx.fxml.FXML
    private ComboBox<String> categorycombo;
    @javafx.fxml.FXML
    private TableView<inventoryCost> inventorycosttable;
    @javafx.fxml.FXML
    private TableColumn<inventoryCost, String> statustabcol;
    @javafx.fxml.FXML
    private TextArea remarkstext;
    @javafx.fxml.FXML
    private TableColumn<inventoryCost, String> itemnametabcol;

    private ObservableList<inventoryCost> inventoryData = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private TextField itemidtext;
    @javafx.fxml.FXML
    private TextField unitcosttext;
    @javafx.fxml.FXML
    private TextField quantitytext;

    @javafx.fxml.FXML
    public void initialize() {
        categorycombo.getItems().addAll("Raw Materials",
                "Equipment", "Supplies");
        itemnametabcol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        totalpricetabcol.setCellValueFactory(new PropertyValueFactory<>("totalCost"));
        unitpricetabcol.setCellValueFactory(new PropertyValueFactory<>("unitCost"));
        categorytabcol.setCellValueFactory(new PropertyValueFactory<>("category"));
        statustabcol.setCellValueFactory((new PropertyValueFactory<>("status")));
        quantitytabcol.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        inventorycosttable.setItems(inventoryData);

    }

    @javafx.fxml.FXML
    public void updatebutton(ActionEvent actionEvent) {
        try {
            String itemId = itemidtext.getText();
            String itemName = itemnametext.getText();
            String category = categorycombo.getValue();
            int quantity = Integer.parseInt(quantitytext.getText());
            float unitCost = Float.parseFloat(unitcosttext.getText());
            String status = "Updated";
            String lastUpdated = costperioddatepicker.getValue().toString();

            inventoryCost newCost = new inventoryCost(itemId, itemName, category, quantity, unitCost, status, lastUpdated);
            inventoryData.add(newCost);

            showSuccessAlert("Cost Updated Successfully!");
        } catch (Exception e) {
            showErrorAlert("Invalid input. Please check your entries.");
        }
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


    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }

}
