package csc305.group57_finalproject_fishhatcheryfarm.Arham_2520927;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class BudgetPlanningController
{
    @javafx.fxml.FXML
    private ComboBox<String> budgetcategorycombo;
    @javafx.fxml.FXML
    private TableColumn<budgetplan, String> categorytabcol;
    @javafx.fxml.FXML
    private DatePicker budgetperiodtext;
    @javafx.fxml.FXML
    private TableView<budgetplan> budgetplantab;
    @javafx.fxml.FXML
    private TextField projectnametext;
    @javafx.fxml.FXML
    private TableColumn<budgetplan, Float> totalamounttabcol;
    @javafx.fxml.FXML
    private TableColumn<budgetplan, String> departmenttabcol;
    @javafx.fxml.FXML
    private TextField totalamounttext;
    @javafx.fxml.FXML
    private TableColumn periodtabcol;

    @javafx.fxml.FXML
    public void initialize() {
        budgetcategorycombo.getItems().addAll("Production","Sales",
                "Human Resource","Marketing","Operations");
        categorytabcol.setCellValueFactory(new PropertyValueFactory<>("category"));
        totalamounttabcol.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        departmenttabcol.setCellValueFactory(new PropertyValueFactory<>("department"));
        periodtabcol.setCellValueFactory(new PropertyValueFactory<>("period"));
    }

    @javafx.fxml.FXML
    public void updateonact(ActionEvent actionEvent) {
        budgetplan bp = new budgetplan(projectnametext.getText(),
                budgetcategorycombo.getValue(),
                Float.parseFloat(totalamounttext.getText()),
                budgetperiodtext.getValue());

        File f = new File("Budget Plan.bin");
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

            oos.writeObject(bp);
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
        File f = new File("Budget Plan.bin");

        try{

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            budgetplantab.getItems().clear();

            while(true){
                try{
                    budgetplan bp = (budgetplan) ois.readObject();
                    budgetplantab.getItems().add(bp);
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
}