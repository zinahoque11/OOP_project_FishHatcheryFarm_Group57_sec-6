package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class updateFoodIntakeController
{
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private TableColumn<fishStock,String> fishSpeciesColumn;
    @javafx.fxml.FXML
    private TableColumn<fishStock, String> healthStatusColumn;
    @javafx.fxml.FXML
    private TextField feedingSessionsTF;
    @javafx.fxml.FXML
    private TableView<fishStock> foodIntakeTableView;
    @javafx.fxml.FXML
    private TableColumn<fishStock, Integer> feedingSessionsTodayColumn;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private ComboBox<String> growthStageCB;
    @javafx.fxml.FXML
    private TableColumn<fishStock,String> growthStageColumn;
    @javafx.fxml.FXML
    private TextField healthStatusTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        growthStageCB.getItems().addAll("Newborn","Juvenile","Adult");
        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        fishSpeciesColumn.setCellValueFactory(new PropertyValueFactory<>("fishSpecies"));
        growthStageColumn.setCellValueFactory(new PropertyValueFactory<>("growthStage"));
        healthStatusColumn.setCellValueFactory(new PropertyValueFactory<>("healthStatus"));
        feedingSessionsTodayColumn.setCellValueFactory(new PropertyValueFactory<>("feedSessionsPerDay"));
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateFoodIntakeButtonOA(ActionEvent actionEvent) {
    }
}