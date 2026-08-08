package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class TaxManagementController
{
    @javafx.fxml.FXML
    private TableView<taxmanagement> taxmanagementtable;
    @javafx.fxml.FXML
    private TableColumn<taxmanagement, LocalDate> duedatetabcol;
    @javafx.fxml.FXML
    private TableColumn<taxmanagement, String> taxtypetabcol;
    @javafx.fxml.FXML
    private TextField totaltaxduetext;
    @javafx.fxml.FXML
    private DatePicker duedatedatepicker;
    @javafx.fxml.FXML
    private TextField payamounttext;
    @javafx.fxml.FXML
    private TableColumn<taxmanagement, String> expensetitletabcol;
    @javafx.fxml.FXML
    private ComboBox<String> paymentmethodcombo;
    @javafx.fxml.FXML
    private TableColumn<taxmanagement, Float> paymenttabcol;
    @javafx.fxml.FXML
    private DatePicker paydatedatepicker;
    @javafx.fxml.FXML
    private TableColumn<taxmanagement, String > statustabcol;
    @javafx.fxml.FXML
    private TextField taxidtext;
    @javafx.fxml.FXML
    private ComboBox<String> taxtypecombo;

    private ObservableList<taxmanagement> taxData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        paymentmethodcombo.getItems().addAll("bkash",
                "creditcard","nagad");
        paymenttabcol.setCellValueFactory(new PropertyValueFactory<>("paymentamount"));
        taxtypecombo.getItems().addAll("Income tax","Sales tax","Property tax");
        taxtypetabcol.setCellValueFactory(new PropertyValueFactory<>("taxtype"));
        duedatetabcol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        taxmanagementtable.setItems(taxData);
    }

    @javafx.fxml.FXML
    public void Backbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }

    @javafx.fxml.FXML
    public void confirmpaaymentbutton(ActionEvent actionEvent) {
        try {
            String taxID = taxidtext.getText();
            String taxtype = taxtypecombo.getValue();
            String paymentmethod = paymentmethodcombo.getValue();
            LocalDate dueDate = duedatedatepicker.getValue();
            LocalDate paymentDate = paydatedatepicker.getValue();
            float paymentamount = Float.parseFloat(payamounttext.getText());
            float dueamount = Float.parseFloat(totaltaxduetext.getText());

            taxmanagement newTax = new taxmanagement(taxID, taxtype, paymentmethod, dueDate, paymentDate, paymentamount, dueamount);
            taxData.add(newTax);

            showSuccessAlert("Payment recorded successfully!");
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
}

