package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;

public class ManagingDirectorDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void financialreportsbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/Financialreport.fxml",
                "Financial Report Section");
    }

    @javafx.fxml.FXML
    public void inventorystatusbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/InventoryStatus.fxml",
                "Inventory Status Section");
    }

    @javafx.fxml.FXML
    public void futureplanningbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/Futureplanning.fxml",
                "Future Planning Section");

    }

    @javafx.fxml.FXML
    public void productionplanning(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/Productionplanning.fxml",
                "Production planning Section");
    }

    @javafx.fxml.FXML
    public void monitorfarmbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/MD_MonitorFarm.fxml",
                "Monitor Farm Section");
    }

    @javafx.fxml.FXML
    public void taskassignmentbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/TaskAssignment.fxml",
                "Task Assignment Section");
    }
}