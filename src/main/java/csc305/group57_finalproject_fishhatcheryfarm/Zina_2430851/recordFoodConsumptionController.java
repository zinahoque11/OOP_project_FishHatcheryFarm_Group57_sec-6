package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class recordFoodConsumptionController
{
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private TextField foodQuantityTF;
    @javafx.fxml.FXML
    private TextArea additionalinfoTA;
    @javafx.fxml.FXML
    private TextField foodConsumedTF;
    @javafx.fxml.FXML
    private ComboBox<String> growthStageCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        growthStageCB.getItems().addAll("Newborn","Juvenile","Adult");
    }



    @javafx.fxml.FXML
    public void recordConsumptionButtonOA(ActionEvent actionEvent) {

        if(fishSpeciesCB.getValue() == null){
            AlertUtil.errorAlert("Please select a fish species.");
            return;
        }

        if(growthStageCB.getValue() == null){
            AlertUtil.errorAlert("Please select growth stage.");
            return;
        }

        if(foodConsumedTF.getText().isEmpty() || foodQuantityTF.getText().isEmpty()){
            AlertUtil.errorAlert("Please Fill up the necessary fileds.");
            return;
        }

        float foodConsumed = Float.parseFloat(foodConsumedTF.getText());
        float foodQuantity = Float.parseFloat(foodQuantityTF.getText());


        if(foodQuantity < 0 || foodConsumed < 0 ){
            AlertUtil.errorAlert("Quantity cannot be negative!");
            return;
        }


        AlertUtil.infoAlert("Food Consumption Recorded Successfully!");


    }

    @javafx.fxml.FXML
    public void HomePageOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }
}