package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class supplyMedController
{
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TableColumn<Medication, LocalDate> deliveryDateColumn;
    @javafx.fxml.FXML
    private TextField medTypeTF;
    @javafx.fxml.FXML
    private TextField quantitySuppliedTF;
    @javafx.fxml.FXML
    private TableColumn<Medication, LocalDate> expiryDateColumn;
    @javafx.fxml.FXML
    private DatePicker expiryDateDP;
    @javafx.fxml.FXML
    private TableView<Medication> medSuppliesTV;
    @javafx.fxml.FXML
    private TableColumn<Medication, Float> quantitySuppliedColumn;
    @javafx.fxml.FXML
    private TableColumn<Medication, String> medTypeColumn;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        medTypeColumn.setCellValueFactory(new PropertyValueFactory<>("medType"));
        deliveryDateColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        quantitySuppliedColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        expiryDateColumn.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addMedSuppliesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewListButton(ActionEvent actionEvent) {
    }
}