package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
        if(approvalCB.getValue() == null){
            AlertUtil.errorAlert("Please select approval.");
            return;
        }

        if(reqQuantityTF.getText().isEmpty() || productNameTF.getText().isEmpty()){
            AlertUtil.errorAlert("EMPTY FIELD.");
            return;
        }

        AlertUtil.infoAlert("Approval Submitted Successfully!");

    }


    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {
         //Back to supplier's dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/supplierDashboard.fxml",
                "Supplier Dashboard");
    }
}