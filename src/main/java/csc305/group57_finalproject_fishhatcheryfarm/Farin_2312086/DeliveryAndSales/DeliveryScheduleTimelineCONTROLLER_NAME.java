package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class DeliveryScheduleTimelineCONTROLLER_NAME {

    @javafx.fxml.FXML
    private TableColumn<DeliveryScheduleTimeline, String> VehicleTablecolumn;

    @javafx.fxml.FXML
    private TableView<DeliveryScheduleTimeline> Tableview;

    @javafx.fxml.FXML
    private TableColumn<DeliveryScheduleTimeline, String> BatchIDTablecolumn;

    @javafx.fxml.FXML
    private TextField StatusTextfield;

    @javafx.fxml.FXML
    private TableColumn<DeliveryScheduleTimeline, Integer> processTablecolumn;

    @javafx.fxml.FXML
    private TableColumn<DeliveryScheduleTimeline, LocalDate> DateTablecolumn;

    @javafx.fxml.FXML
    private BarChart<String, Number> Barchart;

    @javafx.fxml.FXML
    private TableColumn<DeliveryScheduleTimeline, String> statusTablecolumn;


    ArrayList<DeliveryScheduleTimeline> List = new ArrayList<>();
    DeliveryAssignment deliveryAssignment;


    @javafx.fxml.FXML
    public void initialize() {

        BatchIDTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("batchId")
        );

        VehicleTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("vehicle")
        );

        DateTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("date")
        );

        statusTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("status")
        );

        processTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("process")
        );


        List.add(new DeliveryScheduleTimeline(
                "b-101",
                "T-1",
                LocalDate.now(),
                "Dispatched",
                25
        ));

        List.add(new DeliveryScheduleTimeline(
                "b-102",
                "T-2",
                LocalDate.now(),
                "In Transit",
                60
        ));

        List.add(new DeliveryScheduleTimeline(
                "b-103",
                "T-1",
                LocalDate.now(),
                "Delivered",
                100
        ));


        Tableview.getItems().addAll(List);


        XYChart.Series<String, Number> series =
                new XYChart.Series<>();

        series.setName("Delivery Progress (%)");


        for (DeliveryScheduleTimeline item : List) {

            series.getData().add(
                    new XYChart.Data<>(
                            item.getBatchId(),
                            item.getProcess()
                    )
            );
        }


        Barchart.getData().add(series);


        Tableview.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldSelection, newSelection) -> {

                    if (newSelection != null) {
                        StatusTextfield.setText(
                                newSelection.getStatus()
                        );
                    } else {
                        StatusTextfield.clear();
                    }
                });
    }
}