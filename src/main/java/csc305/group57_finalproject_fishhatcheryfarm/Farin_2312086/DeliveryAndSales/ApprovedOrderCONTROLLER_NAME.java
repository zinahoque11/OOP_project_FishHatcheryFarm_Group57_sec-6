package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;


import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class ApprovedOrderCONTROLLER_NAME
{
    @javafx.fxml.FXML
    private ComboBox <String>BatchRouteCombobox;
    @javafx.fxml.FXML
    private TableColumn<ApprovedOrder, String> quantityTablecolumn;
    @javafx.fxml.FXML
    private TableColumn <ApprovedOrder, String>routeTablecolumn;
    @javafx.fxml.FXML
    private TableColumn <ApprovedOrder, String>DeliveryStatusTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<ApprovedOrder, String> BatchIDTablecolumn;
    @javafx.fxml.FXML
    private DatePicker DeliveryDateDatePicker;
    @javafx.fxml.FXML
    private TableView<ApprovedOrder> tableview;
    @javafx.fxml.FXML
    private TableColumn <ApprovedOrder, String>customerTablecolumn;
    @javafx.fxml.FXML
    private TableColumn <ApprovedOrder, String>orderIDTablecolumn;
    ArrayList<ApprovedOrder> List = new ArrayList<>();
    ApprovedOrder approvedOrder;

    @javafx.fxml.FXML
    public void initialize() {
        BatchRouteCombobox.getItems().addAll(
                "Route A (Dhaka)",
                "Route B (Chittagong)");
        orderIDTablecolumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerTablecolumn.setCellValueFactory(new PropertyValueFactory<>("customer"));
        routeTablecolumn.setCellValueFactory(new PropertyValueFactory<>("route"));
        quantityTablecolumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        DeliveryStatusTablecolumn.setCellValueFactory(new PropertyValueFactory<>("deliveryStatus"));
        BatchIDTablecolumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));

    }

    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent) {
        System.out.println("Navigating back to previous screen...");
    }

    @javafx.fxml.FXML
    public void createbatchbutton(ActionEvent actionEvent) {
        ApprovedOrder selectedOrder = tableview.getSelectionModel().getSelectedItem();
        String selectedRoute = BatchRouteCombobox.getValue();
        LocalDate selectedDate = DeliveryDateDatePicker.getValue();

        int batchCounter = 0;

        if (selectedOrder != null && selectedRoute != null && selectedDate != null) {
            String generatedBatchId = "BATCH-" + batchCounter++;

            selectedOrder.setRoute(selectedRoute);
            selectedOrder.setBatchId(generatedBatchId);
            selectedOrder.setDeliveryDate(selectedDate);
            selectedOrder.setDeliveryStatus("Batch Created");

            tableview.refresh();
        }
    }

    @javafx.fxml.FXML
    public void clearbutton(ActionEvent actionEvent) {


    }
}