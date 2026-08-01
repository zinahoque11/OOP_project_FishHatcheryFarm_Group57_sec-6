package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class submitDeliveryInvoiceController
{
    @javafx.fxml.FXML
    private ComboBox<String> productTypeCB;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TextField invoiceIDTF;
    @javafx.fxml.FXML
    private TextField totalAmountTF;
    @javafx.fxml.FXML
    private TextField productNameTF;
    @javafx.fxml.FXML
    private TextField quantityDeliveredTF;
    @javafx.fxml.FXML
    private ComboBox<String> paymentStatusCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        paymentStatusCB.getItems().addAll("Pending","Paid");
        productTypeCB.getItems().addAll("Food","Medication");
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitInvoiceButton(ActionEvent actionEvent) {
    }
}