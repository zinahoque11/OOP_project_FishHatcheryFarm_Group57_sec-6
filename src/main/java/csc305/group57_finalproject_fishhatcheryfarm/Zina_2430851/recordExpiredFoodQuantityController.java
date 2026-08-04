package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.time.LocalDate;

public class recordExpiredFoodQuantityController
{
    @javafx.fxml.FXML
    private DatePicker expiryDateDP;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, LocalDate> expiryDateColumn;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> foodTypeColumn;
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
        expiryDateColumn.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
        expiredFoodQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("expiredFoodQuantity"));

    }



    @javafx.fxml.FXML
    public void recordExpiredFoodQuantityButtonOA(ActionEvent actionEvent) {


        if(foodTypeTF.getText().isEmpty()){
            AlertUtil.errorAlert("Please give food type.");
            return;
        }

        if(Float.parseFloat(expiredFoodQuantityTF.getText()) < 0) {
            AlertUtil.errorAlert("Quantity cannot be negative!");
            return;
        }


        if(expiryDateDP.getValue() == null){
            AlertUtil.errorAlert("Please give expiry date.");
            return;
        }



        foodInventory foodInv = new foodInventory();

        foodInv.setFoodType(foodTypeTF.getText());
        foodInv.setExpiredFoodQuantity(Float.parseFloat(expiredFoodQuantityTF.getText()));
        foodInv.setExpiryDate(expiryDateDP.getValue());

        File f = new File("Expired Food Quantity.bin");
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

            oos.writeObject(foodInv);
            oos.close();
            fos.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void homePageOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }

    @javafx.fxml.FXML
    public void showRecordsOA(ActionEvent actionEvent) {

        File f = new File("Expired Food Quantity.bin");

        try{

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            removeExpiredFoodTV.getItems().clear();

            while(true){

                try{
                    foodInventory fi = (foodInventory) ois.readObject();
                    removeExpiredFoodTV.getItems().add(fi);
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