package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class replaceEquipmentsController
{
    @javafx.fxml.FXML
    private TextField quantityReplacedTF;
    @javafx.fxml.FXML
    private ComboBox<String> replacementStatusCB;
    @javafx.fxml.FXML
    private TextField replacementIdTF;
    @javafx.fxml.FXML
    private CheckBox warrantyCheckBox;
    @javafx.fxml.FXML
    private TextArea additionalInfoTA;
    @javafx.fxml.FXML
    private ComboBox<String> equipTypeCB;
    @javafx.fxml.FXML
    private DatePicker replacementDateDP;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        equipTypeCB.getItems().addAll("Nets", "Water Pumps","Water Filters", "Oxygen Cylinders", "Aerators");
        replacementStatusCB.getItems().addAll("Pending","Approved","Replaced","Cancelled");
    }


    @javafx.fxml.FXML
    public void updateButtonOA(ActionEvent actionEvent) {

        if(replacementIdTF.getText().isEmpty() || quantityReplacedTF.getText().isEmpty()){
            AlertUtil.errorAlert("Empty fields!");
            return;
        }

        if(equipTypeCB.getValue() == null || replacementStatusCB.getValue() == null){
            AlertUtil.errorAlert("Please select necessary fields!");
            return;
        }

        if(replacementDateDP.getValue() == null){
            AlertUtil.errorAlert("Please select replacement date!");
            return;
        }

        AlertUtil.infoAlert("Replacement recorded Successfully!");
    }

    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }
}