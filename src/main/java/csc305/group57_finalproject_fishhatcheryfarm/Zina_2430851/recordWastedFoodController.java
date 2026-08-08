package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class recordWastedFoodController
{
    @javafx.fxml.FXML
    private Label wastedFoodOutputLabel;
    @javafx.fxml.FXML
    private TextField foodDistributedTF;
    @javafx.fxml.FXML
    private TextField tankIdTF;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField foodIntakeTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private ComboBox<String> growthStageCB;

    @javafx.fxml.FXML
    public void initialize() {

        growthStageCB.getItems().addAll("Newborn","Juvenile","Adult");
        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");

    }


    @javafx.fxml.FXML
    public void saveUpdateButtonOA(ActionEvent actionEvent) {


        float foodIntake = Float.parseFloat(foodIntakeTF.getText());
        float foodGiven = Float.parseFloat(foodDistributedTF.getText());


        if(foodGiven < foodIntake){
            AlertUtil.errorAlert("Invalid Input: Food distributed must be greater than or equal to food intake.");
            return;
        }

        if(foodGiven < 0|| foodIntake < 0){
            AlertUtil.errorAlert("Negative values are not accepted!");
            return;
        }

        float wastedFood = foodGiven - foodIntake;


        wastedFoodOutputLabel.setText("Wasted Food Quantity:" + wastedFood + "kg");
        AlertUtil.infoAlert("Quantity Recorded Successfully!");


    }

    @javafx.fxml.FXML
    public void homePageButtonOA(ActionEvent actionEvent) {

        //Back to Manager's Dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/FishFoodManagerDashboard.fxml",
                "Fish Food Manager Dashboard");



    }
}