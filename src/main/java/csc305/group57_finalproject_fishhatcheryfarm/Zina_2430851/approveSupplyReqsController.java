package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class approveSupplyReqsController
{
    @javafx.fxml.FXML
    private ComboBox<String> productTypeCB;
    @javafx.fxml.FXML
    private TextArea remarksTA;
    @javafx.fxml.FXML
    private ComboBox<String> approvalCB;
    @javafx.fxml.FXML
    private DatePicker reqDateTF;
    @javafx.fxml.FXML
    private TextField unitPriceTF;
    @javafx.fxml.FXML
    private TextField reqQuantityTF;
    @javafx.fxml.FXML
    private TextField productNameTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        productTypeCB.getItems().addAll("Food","Medication");
        approvalCB.getItems().addAll("Accepted","Rejected");

    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}