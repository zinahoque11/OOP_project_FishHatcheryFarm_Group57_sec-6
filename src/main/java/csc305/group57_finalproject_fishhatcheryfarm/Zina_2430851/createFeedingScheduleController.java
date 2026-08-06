package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class createFeedingScheduleController
{
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private TextField foodDistributedTF;
    @javafx.fxml.FXML
    private DatePicker feedDateDP;
    @javafx.fxml.FXML
    private TextField tankIdTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> assignedSecCB;
    @javafx.fxml.FXML
    private ComboBox<String> dayOfFeedingCB;
    @javafx.fxml.FXML
    private TextArea showScheduleTA;

    ArrayList<feedingSchedule> fs = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        assignedSecCB.getItems().addAll("Unit-1","Unit-2","Unit-3","Unit-4","Unit-5","Unit-6");
        dayOfFeedingCB.getItems().addAll("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
    }



    @javafx.fxml.FXML
    public void createScheduleButtonOA(ActionEvent actionEvent) {

        feedingSchedule feedSched = new feedingSchedule(
                fishSpeciesCB.getValue(),
                dayOfFeedingCB.getValue(),
                assignedSecCB.getValue(),
                feedDateDP.getValue(),
                Float.parseFloat(foodDistributedTF.getText()),
                Integer.parseInt(tankIdTF.getText())
        );

        fs.add(feedSched);

        AlertUtil.infoAlert("Feeding Schedule Created Successfully!");


    }

    @javafx.fxml.FXML
    public void showScheduleOA(ActionEvent actionEvent) {


        showScheduleTA.clear();

        for(feedingSchedule f : fs){
            showScheduleTA.appendText(f.toString());
        }

    }

    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");

    }
}