package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ExpenseManagementController
{
    @javafx.fxml.FXML
    private TextField expensetitletext;
    @javafx.fxml.FXML
    private TextField amounttext;
    @javafx.fxml.FXML
    private TableColumn<expenseManagement, String> expensetitletabcol;
    @javafx.fxml.FXML
    private DatePicker datedatepicker;
    @javafx.fxml.FXML
    private TableColumn<expenseManagement, LocalDate> datetabcol;
    @javafx.fxml.FXML
    private TableColumn<expenseManagement, Float> amounttabcol;
    @javafx.fxml.FXML
    private TableColumn<expenseManagement, String> typetabcol;
    @javafx.fxml.FXML
    private TableView<expenseManagement> expensemanagementtab;
    @javafx.fxml.FXML
    private ComboBox<String> expensecombo;

    @javafx.fxml.FXML
    public void initialize() {
        expensecombo.getItems().addAll("Utilities", "transport",
                "Fishfood","Mainatinence");
        typetabcol.setCellValueFactory(new PropertyValueFactory<>("expensetype"));
        expensetitletabcol.setCellValueFactory(new PropertyValueFactory<>("expensetitle"));
        amounttabcol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        datetabcol.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void savebutton(ActionEvent actionEvent) {
        expenseManagement ep = new expenseManagement(expensetitletext.getText(),
                expensecombo.getValue(),
                Float.parseFloat(amounttext.getText()),
                datedatepicker.getValue());


    }

    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }

    @javafx.fxml.FXML
    public void viewbutton(ActionEvent actionEvent) {

    }
}