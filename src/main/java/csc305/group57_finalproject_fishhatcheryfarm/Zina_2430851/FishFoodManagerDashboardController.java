package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class FishFoodManagerDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignMed(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/assignMedication.fxml",
                "Assign Medication Section" );
    }

    @javafx.fxml.FXML
    public void updateFoodIntake(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/recordFeedSessions.fxml",
                "Record Feeding sessions");
    }

    @javafx.fxml.FXML
    public void createFeedSchedule(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/createFeedingSchedule.fxml",
                "Create Feed Schedule Section");
    }

    @javafx.fxml.FXML
    public void updateFoodStockAndQuantity(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/updateFoodStockAndQuantityView.fxml",
                "Update Food Stock & Quantity Section");
    }

    @javafx.fxml.FXML
    public void recordFoodConsumption(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/recordFoodConsumption.fxml",
                "Record Food Consumption Section");
    }

    @javafx.fxml.FXML
    public void submitRestockReq(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/submitRestockReq.fxml",
                "Submit Restock Requests Section");
    }

    @javafx.fxml.FXML
    public void removeExpiredFood(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/recordExpiredFoodQuantity.fxml",
                "Record Expired Food Quantity Section");
    }

    @javafx.fxml.FXML
    public void recordWastedFood(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/recordWastedFood.fxml",
                "Record Wasted Food Section");
    }

    @javafx.fxml.FXML
    public void homePageOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }
}