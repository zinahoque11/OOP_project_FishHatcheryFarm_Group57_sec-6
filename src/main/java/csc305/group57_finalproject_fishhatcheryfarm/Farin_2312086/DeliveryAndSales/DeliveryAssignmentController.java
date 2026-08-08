package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class DeliveryAssignmentController {

    @FXML
    private TableColumn<DeliveryAssignment, String> OrderIDTablecolumn;

    @FXML
    private TableColumn<DeliveryAssignment, String> Statustablecolumn;

    @FXML
    private TableColumn<DeliveryAssignment, String> CustomerTablecolumn;

    @FXML
    private TableColumn<DeliveryAssignment, String> FishTablecolumn;

    @FXML
    private TableColumn<DeliveryAssignment, String> Quantitytablecolumn;

    @FXML
    private ComboBox<String> VehicleIDCombobox;

    @FXML
    private ComboBox<String> deleveryroutecombobox;

    @FXML
    private TableView<DeliveryAssignment> TableView;
    ArrayList<DeliveryAssignment>List = new ArrayList<>();
    DeliveryAssignment deliveryAssignment;


    @FXML
    public void initialize() {

        VehicleIDCombobox.getItems().addAll(
                "T-1",
                "T-2"
        );

        deleveryroutecombobox.getItems().addAll(
                "Dhaka",
                "Chittagong"
        );

        OrderIDTablecolumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        CustomerTablecolumn.setCellValueFactory(new PropertyValueFactory<>("customer"));
        FishTablecolumn.setCellValueFactory(new PropertyValueFactory<>("fish"));
        Quantitytablecolumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        Statustablecolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @FXML
    public void assignButton(ActionEvent actionEvent) {

        DeliveryAssignment selectedOrder =
                TableView.getSelectionModel().getSelectedItem();

        if (selectedOrder != null &&
                VehicleIDCombobox.getValue() != null &&
                deleveryroutecombobox.getValue() != null) {

            selectedOrder.setVehicleId(VehicleIDCombobox.getValue());
            selectedOrder.setDeliveryRoute(deleveryroutecombobox.getValue());
            selectedOrder.setStatus("Assigned");

            TableView.refresh();

            clearbutton(actionEvent);
        }
    }

    @FXML
    public void clearbutton(ActionEvent actionEvent) {

        VehicleIDCombobox.setValue(null);
        deleveryroutecombobox.setValue(null);
        TableView.getSelectionModel().clearSelection();
    }

    @FXML
    public void backbutton(ActionEvent actionEvent) {

        // Back button code goes here if you want to return to another scene.
    }
}