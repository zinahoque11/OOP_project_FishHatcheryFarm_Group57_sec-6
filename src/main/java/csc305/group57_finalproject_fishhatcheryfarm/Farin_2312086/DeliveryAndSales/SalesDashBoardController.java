package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import csc305.group57_finalproject_fishhatcheryfarm.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class SalesDashBoardController
{
    @javafx.fxml.FXML
    private BorderPane borderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AssignDeliveryButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/AssignDeliveryVehiclesandRoutes.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @javafx.fxml.FXML
    public void DeliveryScheduleTimeline(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/MonitorDeliveryScheduleTimelines.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void FishPackagingbutton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/ManageFishPackagingDetailsperOrder.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @javafx.fxml.FXML
    public void ApprovedOrderbutton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/ConvertApprovedOrdersintoDeliveryBatches.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @javafx.fxml.FXML
    public void BatchRevenueSummarybutton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/CalculateRevenueperDeliveryBatch.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @javafx.fxml.FXML
    public void DeliveryCompletionRecordbutton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/Record DeliveryCompletionandCustomerReceiptConfirmation.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @javafx.fxml.FXML
    public void OrderrequestButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/RecordFishOrderRequestsfromCustomers.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @javafx.fxml.FXML
    public void ReturnButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/ManageReturnorReplacementRequests.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }

    @Deprecated
    public void DeliveryAssignmentButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/AssignDeliveryVehiclesandRoutes.fxml"));
            borderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {}
    }
}