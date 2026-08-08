package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MonitorHatchSuccessRateBatchController {

    @FXML
    private TextField hatchedEggsTextField;

    @FXML
    private TextField totaleggsTextfield;

    @FXML
    private ComboBox<String> batchidCombo;

    @FXML
    private ComboBox<String> filterCombo;

    @FXML
    private TableView<HatchSuccessRate> tableview;

    @FXML
    private TableColumn<HatchSuccessRate, String> batchIdtablecolumn;

    @FXML
    private TableColumn<HatchSuccessRate, Float> totaleggTablecolumn;

    @FXML
    private TableColumn<HatchSuccessRate, Float> hatchedeggTablecolumn;

    @FXML
    private TableColumn<HatchSuccessRate, Float> successRateTablecolumn;

    ArrayList<HatchSuccessRate> list = new ArrayList<>();
    HatchSuccessRate hatchSuccessRate;

    @FXML
    public void initialize() {

        batchidCombo.getItems().addAll(
                "b-101",
                "b-102"
        );

        filterCombo.getItems().addAll(
                "High Success (>80%)",
                "Low Success (<50%)"
        );

        batchIdtablecolumn.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        totaleggTablecolumn.setCellValueFactory(new PropertyValueFactory<>("totalEgg"));
        hatchedeggTablecolumn.setCellValueFactory(new PropertyValueFactory<>("hatchedEgg"));
        successRateTablecolumn.setCellValueFactory(new PropertyValueFactory<>("successRate"));
    }

    @FXML
    public void calculatebutton(ActionEvent actionEvent) {

        String batchId = batchidCombo.getValue();

        float totalEgg = Float.parseFloat(totaleggsTextfield.getText());
        float hatchedEgg = Float.parseFloat(hatchedEggsTextField.getText());

        float successRate = 0;

        if (totalEgg > 0) {
            successRate = (hatchedEgg / totalEgg) * 100;
        }

        hatchSuccessRate = new HatchSuccessRate(
                batchId,
                totalEgg,
                hatchedEgg,
                successRate
        );

        list.add(hatchSuccessRate);
        tableview.getItems().add(hatchSuccessRate);

        batchidCombo.setValue(null);
        totaleggsTextfield.clear();
        hatchedEggsTextField.clear();
    }

    @FXML
    public void filterbutton(ActionEvent actionEvent) {

        String filter = filterCombo.getValue();

        if (filter == null) {
            tableview.getItems().setAll(list);
            return;
        }

        ArrayList<HatchSuccessRate> filteredList = new ArrayList<>();

        for (HatchSuccessRate item : list) {

            if (filter.equals("High Success (>80%)") &&
                    item.getSuccessRate() > 80) {

                filteredList.add(item);
            }

            else if (filter.equals("Low Success (<50%)") &&
                    item.getSuccessRate() < 50) {

                filteredList.add(item);
            }
        }

        tableview.getItems().setAll(filteredList);
    }

    @FXML
    public void clearbutton(ActionEvent actionEvent) {

        batchidCombo.setValue(null);
        filterCombo.setValue(null);
        totaleggsTextfield.clear();
        hatchedEggsTextField.clear();

        tableview.getItems().clear();
        list.clear();
    }
}