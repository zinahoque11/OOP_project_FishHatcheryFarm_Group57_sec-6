package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class HatchSurvivalRateController {

    @FXML private TableColumn<HatchSurvivalRate, Integer> InitialEggTablecolumn;
    @FXML private TableColumn<HatchSurvivalRate, Integer> SurvivingFryTablecolumn;
    @FXML private TableColumn<HatchSurvivalRate, Double> SurvivingRateTablecolumn;

    @FXML private TextField SurvivingTextfield;
    @FXML private TableView<HatchSurvivalRate> Tableview;
    @FXML private TableColumn<HatchSurvivalRate, String> BatchIDTablecolumn;
    @FXML private TextField InitialEggsTextfield;
    @FXML private ComboBox<String> batchIDCombobox;
    @FXML private PieChart pieChart;
    ArrayList<HatchSurvivalRate> List=new ArrayList<>();
    HatchSurvivalRate hatchSurvivalRate;

    @FXML
    public void initialize() {
        batchIDCombobox.getItems().addAll("b-101", "b-102");

        BatchIDTablecolumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        InitialEggTablecolumn.setCellValueFactory(new PropertyValueFactory<>("initialEggs"));
        SurvivingFryTablecolumn.setCellValueFactory(new PropertyValueFactory<>("survivingFry"));
        SurvivingRateTablecolumn.setCellValueFactory(new PropertyValueFactory<>("survivingRate"));
    }

    @FXML
    public void calculateButton(ActionEvent actionEvent) {
        String batchId = batchIDCombobox.getValue();
        String species = "Tilapia";
        if ("b-102".equals(batchId)) {
            species = "Rui";
        }

        int initialEggs = Integer.parseInt(InitialEggsTextfield.getText());
        int survivingFry = Integer.parseInt(SurvivingTextfield.getText());

        double survivalRate = 0;
        if (initialEggs > 0) {
            survivalRate = ((double) survivingFry / initialEggs) * 100;
        }

        hatchSurvivalRate = new HatchSurvivalRate(
                batchId,
                initialEggs,
                survivingFry,
                survivalRate
        );

        Tableview.getItems().add(hatchSurvivalRate);

        // Pie Chart
        pieChart.getData().clear();
        pieChart.getData().add(new PieChart.Data("Survived", survivingFry));
        pieChart.getData().add(new PieChart.Data("Not Survived", initialEggs - survivingFry));

        // Save to file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("HatchSurvivalRate.txt", true));
            writer.write(
                    hatchSurvivalRate.getBatchId() + "," +
                            hatchSurvivalRate.getInitialEggs() + "," +
                            hatchSurvivalRate.getSurvivingFry() + "," +
                            hatchSurvivalRate.getSurvivingRate() + "\n"
            );
            writer.close();

        } catch (Exception e) {

        }
    }
}