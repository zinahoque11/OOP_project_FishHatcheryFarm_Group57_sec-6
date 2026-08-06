package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class updateContractDetailsController
{
    @javafx.fxml.FXML
    private CheckBox outstandingPaymentsCheckBox;
    @javafx.fxml.FXML
    private DatePicker contractEndDP;
    @javafx.fxml.FXML
    private DatePicker contractStartDP;
    @javafx.fxml.FXML
    private TextField companyNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> contractStatusCB;
    @javafx.fxml.FXML
    private TextArea termsAndConditionsTA;
    @javafx.fxml.FXML
    private TextField contractIdTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        contractStatusCB.getItems().addAll("Active","Expired","Renewed");
    }

    @javafx.fxml.FXML
    public void updateDetailsButton(ActionEvent actionEvent) {

        if(contractIdTF.getText().isEmpty() || companyNameTF.getText().isEmpty()){
            AlertUtil.errorAlert("Please fill up necessary fields!");
            return;
        }

        if(contractEndDP.getValue() == null || contractStartDP.getValue() == null){
            AlertUtil.errorAlert("Please select the dates!");
            return;
        }
        if(contractStatusCB.getValue() == null){
            AlertUtil.errorAlert("Please select contract status!");
            return;
        }

        AlertUtil.infoAlert("Contract Details Updated Successfully!");

    }


    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }
}