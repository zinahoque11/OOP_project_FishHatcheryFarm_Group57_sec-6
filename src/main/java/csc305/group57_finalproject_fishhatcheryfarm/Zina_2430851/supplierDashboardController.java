package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class supplierDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void submitInvoicesButton(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/submitDeliveryInvoice.fxml",
                "Submit Invoice Page");
    }

    @javafx.fxml.FXML
    public void addFeedingSupplyButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/addFeedingSupplies.fxml",
                "Add feeding Supplies Page");
    }


    @javafx.fxml.FXML
    public void reportShortageButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/reportSupplyShortage.fxml",
                "Report supply Shortage Page");
    }

    @javafx.fxml.FXML
    public void updateApprovalButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/approveSupplyReqs.fxml",
                "Approval Supply Page");
    }

    @javafx.fxml.FXML
    public void addEquipmentButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/addEquipmentSupply.fxml",
                "Add Equipment Page");
    }

    @javafx.fxml.FXML
    public void addMedSupplyButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/supplyMed.fxml",
                "Add Med Supply Page");
    }

    @javafx.fxml.FXML
    public void replaceEquipmentsButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/replaceEquipments.fxml",
                "Replace Equipment Page");
    }

    @javafx.fxml.FXML
    public void updateContractDetailsButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/updateContractDetails.fxml",
                "Update Contract Details Page");
    }

    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }
}