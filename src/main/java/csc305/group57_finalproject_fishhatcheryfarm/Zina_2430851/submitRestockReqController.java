package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class submitRestockReqController
{
    @javafx.fxml.FXML
    private ComboBox<String> productTypeCB;
    @javafx.fxml.FXML
    private TextField productNameTf;
    @javafx.fxml.FXML
    private TextField requestedQuantityTF;
    @javafx.fxml.FXML
    private TextArea additionalInfoTA;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        productTypeCB.getItems().addAll("Food","Medication");
    }

    @javafx.fxml.FXML
    public void submitReqButtonOA(ActionEvent actionEvent) {

        if(productNameTf.getText().isEmpty()){
            AlertUtil.errorAlert("Please give product name.");
            return;
        }

        if(requestedQuantityTF.getText().isEmpty()){

            AlertUtil.errorAlert("Please give requested quantity.");
            return;

        }

        if(productTypeCB.getValue() == null){
            AlertUtil.errorAlert("Please select product type.");
            return;
        }

        AlertUtil.infoAlert("Restock Request Submitted Successfully!");

    }



    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {
        //Back to Manager's Dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/FishFoodManagerDashboard.fxml",
                "Fish Food Manager Dashboard");
    }
}