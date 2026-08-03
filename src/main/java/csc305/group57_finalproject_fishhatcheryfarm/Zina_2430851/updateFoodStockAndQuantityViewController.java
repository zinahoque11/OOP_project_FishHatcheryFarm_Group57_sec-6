package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class updateFoodStockAndQuantityViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private TableView<foodInventory> StockAndQuantityTableView;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> fishSpeciesColumn;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> stockStatusColumn;
    @javafx.fxml.FXML
    private TextField foodQuantityTF;
    @javafx.fxml.FXML
    private ComboBox<String> stockStatusCB;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> foodQuantityColumn;

    ArrayList<foodInventory> inventoryUpdatedList = new ArrayList<>();
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        stockStatusCB.getItems().addAll("In-Stock","Out of Stock","Limited");
        fishSpeciesColumn.setCellValueFactory(new PropertyValueFactory<>("fishSpecies"));
        foodQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("foodQuantity"));
        stockStatusColumn.setCellValueFactory(new PropertyValueFactory<>("stockStatus"));
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }

    @javafx.fxml.FXML
    public void saveUpdatesOA(ActionEvent actionEvent) {
    }
}