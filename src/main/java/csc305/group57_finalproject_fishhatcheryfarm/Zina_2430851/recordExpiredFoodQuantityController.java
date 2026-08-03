package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class recordExpiredFoodQuantityController
{
    @javafx.fxml.FXML
    private DatePicker productionDateDP;
    @javafx.fxml.FXML
    private DatePicker expiryDateDP;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, LocalDate> expiryDateColumn;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> foodTypeColumn;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, LocalDate> productionDateColumn;
    @javafx.fxml.FXML
    private TableView<foodInventory> removeExpiredFoodTV;
    @javafx.fxml.FXML
    private TextField foodTypeTF;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, Float> expiredFoodQuantityColumn;
    @javafx.fxml.FXML
    private TextField expiredFoodQuantityTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        foodTypeColumn.setCellValueFactory(new PropertyValueFactory<>("foodType"));
        productionDateColumn.setCellValueFactory(new PropertyValueFactory<>("productionDate"));
        expiryDateColumn.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
        expiredFoodQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("expiredFoodQuantity"));

    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }


    @javafx.fxml.FXML
    public void recordExpiredFoodQuantityButtonOA(ActionEvent actionEvent) {
    }
}