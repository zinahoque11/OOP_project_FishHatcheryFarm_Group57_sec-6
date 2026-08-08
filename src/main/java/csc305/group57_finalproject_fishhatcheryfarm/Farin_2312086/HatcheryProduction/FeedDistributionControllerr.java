package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class FeedDistributionControllerr {

    @javafx.fxml.FXML
    private TextField QuantityTextfield;
    @javafx.fxml.FXML
    private TableColumn<FeedDistribution, Double> TotalFeedTablecolumn; // Double Type
    @javafx.fxml.FXML
    private TableColumn<FeedDistribution, String> BatchIDTablecolumn;
    @javafx.fxml.FXML
    private TableColumn<FeedDistribution, Double> QuantityTableColumn; // Double Type
    @javafx.fxml.FXML
    private ComboBox<String> feedTypeCombobox;
    @javafx.fxml.FXML
    private TableColumn<FeedDistribution, LocalDate> FeedingTimeTablecolumn;
    @javafx.fxml.FXML
    private DatePicker feedTimeDatepicker;
    @javafx.fxml.FXML
    private ComboBox<String> BatchIDCombobox;
    @javafx.fxml.FXML
    private TableColumn<FeedDistribution, String> TypeColumn;
    @javafx.fxml.FXML
    private TableView<FeedDistribution> TableView;
    ArrayList<FeedDistribution> List=new ArrayList<>();
    FeedDistribution feedRecord;

    @javafx.fxml.FXML
    public void initialize() {
        BatchIDCombobox.getItems().addAll("b-101", "b-102");
        feedTypeCombobox.getItems().addAll("Starter Feed", "Grower Feed");

        BatchIDTablecolumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        TypeColumn.setCellValueFactory(new PropertyValueFactory<>("feedType"));
        QuantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        FeedingTimeTablecolumn.setCellValueFactory(new PropertyValueFactory<>("feedingTime"));
        TotalFeedTablecolumn.setCellValueFactory(new PropertyValueFactory<>("totalFeed"));
    }

    @javafx.fxml.FXML
    public void SaveFoodRecordButton(ActionEvent actionEvent) {
        String batchId = BatchIDCombobox.getValue();
        String feedType = feedTypeCombobox.getValue();

        // String কে double-এ কনভার্ট করা হয়েছে
        double quantity = Double.parseDouble(QuantityTextfield.getText());
        LocalDate feedingTime = feedTimeDatepicker.getValue();
        double totalFeed = quantity;

        // Create Model Instance
        feedRecord = new FeedDistribution(
                batchId,
                feedType,
                quantity,
                feedingTime,
                totalFeed
        );

        // Add object to TableView
        TableView.getItems().add(feedRecord);

        // Save to Text File
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("FeedDistribution.txt", true));
            writer.write(
                    feedRecord.getBatchId() + "," +
                            feedRecord.getFeedType() + "," +
                            feedRecord.getQuantity() + "," +
                            feedRecord.getFeedingTime() + "," +
                            feedRecord.getTotalFeed() + "\n"
            );
            writer.close();
        } catch (Exception e) {

        }

        // Clear input fields
        QuantityTextfield.clear();
        BatchIDCombobox.setValue(null);
        feedTypeCombobox.setValue(null);
        feedTimeDatepicker.setValue(null);
    }
}