package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class EggIncubationCycleController {

    @FXML
    private TextField PHvalueTextfield;

    @FXML
    private TextField OxygenLevelTextfield;

    @FXML
    private TextField temperatureTextfield;

    @FXML
    private TextField DurationTextfield;

    @FXML
    private TextField searchText;

    @FXML
    private ComboBox<String> StatusCombobox;

    @FXML
    private ComboBox<String> cycleStatusCombobox;

    @FXML
    private TableView<EggIncubationCycle> tableview;

    @FXML
    private TableColumn<EggIncubationCycle, Double> temperatureTablecolumn;

    @FXML
    private TableColumn<EggIncubationCycle, Double> oxygenLevelTablecolumn;

    @FXML
    private TableColumn<EggIncubationCycle, Double> PhValueTablecolumn;

    @FXML
    private TableColumn<EggIncubationCycle, String> cyclestatusTablecolumn;

    @FXML
    private TableColumn<EggIncubationCycle, String> statusTablecolumn;

    @FXML
    private TableColumn<EggIncubationCycle, String> durationTablecolumn1;

    ArrayList<EggIncubationCycle> list = new ArrayList<>();
    EggIncubationCycle eggIncubationCycle;

    @FXML
    public void initialize() {

        cycleStatusCombobox.getItems().addAll(
                "Completed",
                "Cancelled"
        );

        StatusCombobox.getItems().addAll(
                "Optimal",
                "Normal"
        );

        temperatureTablecolumn.setCellValueFactory(new PropertyValueFactory<>("temperature"));
        oxygenLevelTablecolumn.setCellValueFactory(new PropertyValueFactory<>("oxygenLevel"));
        PhValueTablecolumn.setCellValueFactory(new PropertyValueFactory<>("phValue"));
        cyclestatusTablecolumn.setCellValueFactory(new PropertyValueFactory<>("cycleStatus"));
        statusTablecolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        durationTablecolumn1.setCellValueFactory(new PropertyValueFactory<>("duration"));
    }

    @FXML
    public void updatebutton(ActionEvent actionEvent) {

        double temperature = Double.parseDouble(temperatureTextfield.getText());
        double oxygenLevel = Double.parseDouble(OxygenLevelTextfield.getText());
        double phValue = Double.parseDouble(PHvalueTextfield.getText());

        String cycleStatus = cycleStatusCombobox.getValue();
        String status = StatusCombobox.getValue();
        String duration = DurationTextfield.getText();

        eggIncubationCycle = new EggIncubationCycle(
                temperature,
                oxygenLevel,
                phValue,
                cycleStatus,
                status,
                duration
        );

        list.add(eggIncubationCycle);
        tableview.getItems().add(eggIncubationCycle);

        temperatureTextfield.clear();
        OxygenLevelTextfield.clear();
        PHvalueTextfield.clear();
        DurationTextfield.clear();
        searchText.clear();

        cycleStatusCombobox.setValue(null);
        StatusCombobox.setValue(null);
    }

    @FXML
    public void clearbutton(ActionEvent actionEvent) {

        temperatureTextfield.clear();
        OxygenLevelTextfield.clear();
        PHvalueTextfield.clear();
        DurationTextfield.clear();
        searchText.clear();

        cycleStatusCombobox.setValue(null);
        StatusCombobox.setValue(null);
    }

    @FXML
    public void searchbutton(ActionEvent actionEvent) {

        String query = searchText.getText().toLowerCase().trim();

        if (query.isEmpty()) {
            tableview.getItems().setAll(list);
            return;
        }

        ArrayList<EggIncubationCycle> searchList = new ArrayList<>();

        for (EggIncubationCycle item : list) {

            if ((item.getCycleStatus() != null &&
                    item.getCycleStatus().toLowerCase().contains(query))
                    ||
                    (item.getStatus() != null &&
                            item.getStatus().toLowerCase().contains(query))
                    ||
                    (item.getDuration() != null &&
                            item.getDuration().toLowerCase().contains(query))
                    ||
                    String.valueOf(item.getTemperature()).contains(query)
                    ||
                    String.valueOf(item.getOxygenLevel()).contains(query)
                    ||
                    String.valueOf(item.getPhValue()).contains(query)) {

                searchList.add(item);
            }
        }

        tableview.getItems().setAll(searchList);
    }
}