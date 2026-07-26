package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class updateContractDetailsController
{
    @javafx.fxml.FXML
    private CheckBox outstandingPaymentsCheckBox;
    @javafx.fxml.FXML
    private DatePicker contractEndDP;
    @javafx.fxml.FXML
    private DatePicker contractStartDP;
    @javafx.fxml.FXML
    private TextField companyNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> contractStatusCB;
    @javafx.fxml.FXML
    private TextArea termsAndConditionsTA;
    @javafx.fxml.FXML
    private TextField contractIdTF;

    @javafx.fxml.FXML
    public void initialize() {
        contractStatusCB.getItems().addAll("Active","Expired","Renewed");
    }

    @javafx.fxml.FXML
    public void updateDetailsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}