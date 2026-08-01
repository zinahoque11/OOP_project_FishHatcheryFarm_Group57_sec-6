package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class recordFoodConsumptionController
{
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField foodQuantityTF;
    @javafx.fxml.FXML
    private TextArea additionalinfoTA;
    @javafx.fxml.FXML
    private TextField foodConsumedTF;
    @javafx.fxml.FXML
    private ComboBox<String> growthStageCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        growthStageCB.getItems().addAll("Newborn","Juvenile","Adult");
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordConsumptionButtonOA(ActionEvent actionEvent) {
    }
}