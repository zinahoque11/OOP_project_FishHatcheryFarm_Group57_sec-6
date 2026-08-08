package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;

public class AccountantDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void salarymanagementDBbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/SalaryManagement.fxml",
                "Salary Management Section");
    }

    @javafx.fxml.FXML
    public void addexpenseDBDbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/ExpenseManagement.fxml",
                "Expense Management Section");
    }

    @javafx.fxml.FXML
    public void bugetplanningDBbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/BudgetPlanning.fxml",
                "Budget Planning Section");
    }

    @javafx.fxml.FXML
    public void TaxmanagementDBbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/TaxManagement.fxml",
                "Tax Management Section");
    }

    @javafx.fxml.FXML
    public void inventorycostDBbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/InventoryCost.fxml",
                "Inventory Cost Section");
    }

    @javafx.fxml.FXML
    public void generatereportDBbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Arham_2520927/Report.fxml",
                "Report Section");
    }
}