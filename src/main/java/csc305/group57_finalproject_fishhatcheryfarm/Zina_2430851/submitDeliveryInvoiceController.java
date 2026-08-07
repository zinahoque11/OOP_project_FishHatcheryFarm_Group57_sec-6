package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    public void submitInvoiceButton(ActionEvent actionEvent) {

        if(productNameTF.getText().isEmpty() || quantityDeliveredTF.getText().isEmpty() ||
            totalAmountTF.getText().isEmpty() || invoiceIDTF.getText().isEmpty()){
            AlertUtil.errorAlert("Empty Field!");
            return;
        }

        if(deliveryDateDP.getValue() == null || paymentStatusCB.getValue() == null ||
                productTypeCB.getValue().isEmpty()){

            AlertUtil.errorAlert("Please select empty fields.");
            return;

        }

        AlertUtil.infoAlert("Invoice Submitted Successfully!");
    }

    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {

        //Back to supplier's dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/supplierDashboard.fxml",
                "Supplier Dashboard");
    }
}