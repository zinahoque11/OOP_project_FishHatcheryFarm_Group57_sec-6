package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
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
        expensecombo.getItems().addAll("Maintainence","Fish Food",
                "Utilities","Travel","salary");
        expensetitletabcol.setCellValueFactory(new PropertyValueFactory<>("expensetitle"));
        typetabcol.setCellValueFactory(new PropertyValueFactory<>("expensetype"));
        datetabcol.setCellValueFactory(new PropertyValueFactory<>("date"));
        amounttabcol.setCellValueFactory(new PropertyValueFactory<>("amount"));
    }

    @javafx.fxml.FXML
    public void savebutton(ActionEvent actionEvent) {
        expenseManagement em = new expenseManagement();
        em.setExpensetitle(expensetitletext.getText());
        em.setAmount(Float.parseFloat(amounttext.getText()));
        em.setDate(datedatepicker.getValue());
        em.setExpensetype(expensecombo.getValue());


        File f = new File("Expense Management.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try{
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }

            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(em);
            oos.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }

    @javafx.fxml.FXML
    public void viewbutton(ActionEvent actionEvent) {
        File f = new File("Expense Management.bin");

        try{

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            expensemanagementtab.getItems().clear();

            while(true){
                try{
                    expenseManagement em = (expenseManagement) ois.readObject();
                    expensemanagementtab.getItems().add(em);
                }

                catch(EOFException e){
                    break;
                }
            }
        }

        catch(Exception e){
            e.printStackTrace();
    }
}