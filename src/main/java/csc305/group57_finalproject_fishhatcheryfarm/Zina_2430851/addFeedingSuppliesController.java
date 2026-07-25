package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class addFeedingSuppliesController
{
    @javafx.fxml.FXML
    private TableColumn<supplyFood, String> feedTypeColumn;
    @javafx.fxml.FXML
    private TextField quantitySuppliedTF;
    @javafx.fxml.FXML
    private ComboBox<String> filterFeedTypeCB;
    @javafx.fxml.FXML
    private TextField unitPriceTF;
    @javafx.fxml.FXML
    private ComboBox<String> feedTypeCB;
    @javafx.fxml.FXML
    private TableColumn<supplyFood, Float> quantitySuppliedColumn;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TextField productNameTF;
    @javafx.fxml.FXML
    private TableView<supplyFood> supplyFoodTV;
    @javafx.fxml.FXML
    private TextField filterUnitPriceTF;
    @javafx.fxml.FXML
    private TableColumn<supplyFood, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<supplyFood,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<supplyFood, Float> priceColumn;

    @javafx.fxml.FXML
    public void initialize() {
        feedTypeCB.getItems().addAll("Pellet","Crumble","Powder");
        filterFeedTypeCB.getItems().addAll("Pellet","Crumble","Powder");
        productColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        quantitySuppliedColumn.setCellValueFactory(new PropertyValueFactory<>("quantitySupplied"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        feedTypeColumn.setCellValueFactory(new PropertyValueFactory<>("feedType"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));

    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addSuppliesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
    }
}