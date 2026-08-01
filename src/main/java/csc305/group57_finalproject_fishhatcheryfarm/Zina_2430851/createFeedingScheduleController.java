package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class createFeedingScheduleController
{
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private Label scheduleLabel;
    @javafx.fxml.FXML
    private TextField dayOfFeedingTF;
    @javafx.fxml.FXML
    private TextField foodDistributedTF;
    @javafx.fxml.FXML
    private DatePicker feedDateDP;
    @javafx.fxml.FXML
    private TextField tankIdTF;
    @javafx.fxml.FXML
    private TextField assignedSectionTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createScheduleButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showScheduleOA(ActionEvent actionEvent) {
    }
}