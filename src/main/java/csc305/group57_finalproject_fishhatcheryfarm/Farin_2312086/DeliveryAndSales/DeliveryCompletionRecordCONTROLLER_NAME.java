package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class DeliveryCompletionRecordCONTROLLER_NAME {

    @javafx.fxml.FXML
    private ComboBox<String> reciptcombobox;

    @javafx.fxml.FXML
    private TableColumn<DeliveryCompletionRecord, String> StatusTablecolumn;

    @javafx.fxml.FXML
    private TableColumn<DeliveryCompletionRecord, String> VehicleTablecolumn;

    @javafx.fxml.FXML
    private TableColumn<DeliveryCompletionRecord, String> BatchIDTablecolumn;

    @javafx.fxml.FXML
    private TableView<DeliveryCompletionRecord> Tableview;


    ArrayList<DeliveryCompletionRecord> List = new ArrayList<>();

    DeliveryCompletionRecord deliveryCompletionRecord;


    @javafx.fxml.FXML
    public void initialize() {

        reciptcombobox.getItems().addAll(
                "Accepted",
                "Rejected"
        );


        BatchIDTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("batchId")
        );

        VehicleTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("vehicle")
        );

        StatusTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("status")
        );


        List.add(new DeliveryCompletionRecord(
                "b-101",
                "Customer A",
                "T-1",
                "Dispatched",
                "Delivered",
                "Accepted",
                "Completed",
                "Active"
        ));

        List.add(new DeliveryCompletionRecord(
                "b-102",
                "Customer B",
                "T-2",
                "Dispatched",
                "Delivered",
                "Rejected",
                "Pending",
                "Active"
        ));


        Tableview.getItems().addAll(List);
    }


    @javafx.fxml.FXML
    public void Updatebutton(ActionEvent actionEvent) {

        DeliveryCompletionRecord selectedRecord =
                Tableview.getSelectionModel().getSelectedItem();

        String receipt = reciptcombobox.getValue();


        if (selectedRecord != null && receipt != null) {

            selectedRecord.setReceipt(receipt);

            if (receipt.equals("Accepted")) {

                selectedRecord.setDeliveryStatus("Delivered");
                selectedRecord.setOrderStatus("Completed");

            } else {

                selectedRecord.setDeliveryStatus("Delivered");
                selectedRecord.setOrderStatus("Rejected");
            }

            selectedRecord.setStatus("Completed");

            Tableview.refresh();

            Clearbutton(actionEvent);
        }
    }


    @javafx.fxml.FXML
    public void Backbutton(ActionEvent actionEvent) {

        System.out.println("Back button clicked");
    }


    @javafx.fxml.FXML
    public void Clearbutton(ActionEvent actionEvent) {

        reciptcombobox.setValue(null);

        Tableview.getSelectionModel().clearSelection();
    }
}