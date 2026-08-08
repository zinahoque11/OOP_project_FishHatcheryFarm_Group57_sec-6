package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class BatchRevenueSummaryCONTROLLER_NAME {

    @javafx.fxml.FXML
    private TableColumn<BatchRevenueSummary, Integer> TotalordersTablecolumn;

    @javafx.fxml.FXML
    private TableColumn<BatchRevenueSummary, String> Statustablecolumn;

    @javafx.fxml.FXML
    private TableView<BatchRevenueSummary> Tableview;

    @javafx.fxml.FXML
    private TableColumn<BatchRevenueSummary, String> BatchIDTablecolumn;

    ArrayList<BatchRevenueSummary> List = new ArrayList<>();

    BatchRevenueSummary batchRevenueSummary;
    @javafx.fxml.FXML
    private TableColumn<BatchRevenueSummary, String> routetaablecolumn;


    @javafx.fxml.FXML
    public void initialize() {

        BatchIDTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("batchId")
        );

        TotalordersTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("totalOrders")
        );

        Statustablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("status")
        );
        routetaablecolumn.setCellValueFactory(new PropertyValueFactory<>("route"));
    }


    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent) {

        System.out.println("Back button clicked");

    }


    @javafx.fxml.FXML
    public void clearbutton(ActionEvent actionEvent) {

        List.clear();

        Tableview.getItems().clear();

        Tableview.getSelectionModel().clearSelection();
    }


    @javafx.fxml.FXML
    public void Calculaterevenuebutton(ActionEvent actionEvent) {

        List.clear();

        List.add(new BatchRevenueSummary(
                "b-101",
                "Dhaka Route",
                15,
                "Calculated"
        ));

        List.add(new BatchRevenueSummary(
                "b-102",
                "Chittagong Route",
                8,
                "Calculated"
        ));

        List.add(new BatchRevenueSummary(
                "b-103",
                "Sylhet Route",
                22,
                "Pending"
        ));

        List.add(new BatchRevenueSummary(
                "b-104",
                "Khulna Route",
                10,
                "Calculated"
        ));

        Tableview.getItems().clear();

        Tableview.getItems().addAll(List);
    }
}