package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DailyProductionSummaryController
{
    @javafx.fxml.FXML
    private TableColumn <HatchSurvivalRate, Double>EggTextfield;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private TableColumn<HatchSurvivalRate, Double> HatchlingsTextfield;
    @javafx.fxml.FXML
    private BarChart barChart;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
    @javafx.fxml.FXML
    private TableView <HatchSurvivalRate>Tableview;
    @javafx.fxml.FXML
    private TableColumn <HatchSurvivalRate, String>StatusTextfield;
    @javafx.fxml.FXML
    private TableColumn<HatchSurvivalRate, Double> SurvivalrateTextfield;
    @javafx.fxml.FXML
    private TableColumn <HatchSurvivalRate, String>BatchIDTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        BatchIDTextfield.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        EggTextfield.setCellValueFactory(new PropertyValueFactory<>("initialEggs"));
        HatchlingsTextfield.setCellValueFactory(new PropertyValueFactory<>("survivingFry"));
        SurvivalrateTextfield.setCellValueFactory(new PropertyValueFactory<>("survivingRate"));
        StatusTextfield.setCellValueFactory(new PropertyValueFactory<>("species"));

    }

    @javafx.fxml.FXML
    public void clearbutton(ActionEvent actionEvent) {
        Tableview.getItems().clear();
        barChart.getData().clear();
    }

    @javafx.fxml.FXML
    public void filterButton(ActionEvent actionEvent) {

    }
}