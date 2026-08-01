package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class addEquipmentSupplyController
{
    @javafx.fxml.FXML
    private TableColumn<equipment, Float> quantityColumn;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TableView<equipment> equipmentTV;
    @javafx.fxml.FXML
    private ComboBox<String> equipmentTypeCB;
    @javafx.fxml.FXML
    private TextField warrantyPeriodTF;
    @javafx.fxml.FXML
    private TextField unitPriceTF;
    @javafx.fxml.FXML
    private ComboBox<String> conditionCB;
    @javafx.fxml.FXML
    private TableColumn<equipment, String> warrantyColumn;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private TableColumn<equipment, String> typeColumn;
    @javafx.fxml.FXML
    private TableColumn<equipment, Float> priceColumn;
    @javafx.fxml.FXML
    private TableColumn<equipment, String> conditionColumn;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        equipmentTypeCB.getItems().addAll("Nets", "Water Pumps","Water Filters", "Oxygen Cylinders", "Aerators");
        conditionCB.getItems().addAll("New", "Refurbished");
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("equipmentType"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        warrantyColumn.setCellValueFactory(new PropertyValueFactory<>("warrantyPeriod"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        conditionColumn.setCellValueFactory(new PropertyValueFactory<>("condition"));

    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addEquipmentButton(ActionEvent actionEvent) {
    }
}