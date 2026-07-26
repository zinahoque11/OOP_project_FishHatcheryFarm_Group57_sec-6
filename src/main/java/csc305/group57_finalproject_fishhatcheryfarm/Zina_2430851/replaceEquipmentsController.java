package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class replaceEquipmentsController
{
    @javafx.fxml.FXML
    private TextField quantityReplacedTF;
    @javafx.fxml.FXML
    private ComboBox<String> replacementStatusCB;
    @javafx.fxml.FXML
    private TextField replacementIdTF;
    @javafx.fxml.FXML
    private CheckBox warrantyCheckBox;
    @javafx.fxml.FXML
    private TextArea additionalInfoTA;
    @javafx.fxml.FXML
    private ComboBox<String> equipTypeCB;
    @javafx.fxml.FXML
    private DatePicker replacementDateDP;

    @javafx.fxml.FXML
    public void initialize() {
        equipTypeCB.getItems().addAll("Nets", "Water Pumps","Water Filters", "Oxygen Cylinders", "Aerators");
        replacementStatusCB.getItems().addAll("Pending","Approved","Replaced","Cancelled");
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOA(ActionEvent actionEvent) {
    }
}