package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class reportSupplyShortageController
{
    @javafx.fxml.FXML
    private ComboBox<String> supplyCategoryCB;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TextArea reasonsForShortageTA;
    @javafx.fxml.FXML
    private TextField availableQuantityTF;
    @javafx.fxml.FXML
    private TextField requestedQuantityTF;
    @javafx.fxml.FXML
    private DatePicker restockDateDP;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        supplyCategoryCB.getItems().addAll("Fish Feed","Medication","Equipment");
    }


    @javafx.fxml.FXML
    public void submitReportButton(ActionEvent actionEvent) {

        if(supplyCategoryCB.getValue() == null){
            AlertUtil.errorAlert("Please select supply category.");
            return;
        }
        if(requestedQuantityTF.getText().isEmpty() || availableQuantityTF.getText().isEmpty()){
            AlertUtil.errorAlert("Please fill up necessary fields.");
            return;
        }
        if(deliveryDateDP.getValue() == null || restockDateDP.getValue() == null){
            AlertUtil.errorAlert("Please select the dates.");
            return;
        }

        AlertUtil.infoAlert("Report Submitted Successfully!");

    }

    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }
}