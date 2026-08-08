package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class updateFoodStockAndQuantityViewController
{
    @javafx.fxml.FXML
    private TableView<foodInventory> StockAndQuantityTableView;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> stockStatusColumn;
    @javafx.fxml.FXML
    private TextField foodQuantityTF;
    @javafx.fxml.FXML
    private ComboBox<String> stockStatusCB;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> foodQuantityColumn;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TextField foodTypeTF;
    @javafx.fxml.FXML
    private TableColumn<foodInventory, String> foodTypeColumn;

    @javafx.fxml.FXML
    public void initialize() {

        stockStatusCB.getItems().addAll("In-Stock","Out of Stock","Limited");
        foodTypeColumn.setCellValueFactory(new PropertyValueFactory<>("foodType"));
        foodQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("foodQuantity"));
        stockStatusColumn.setCellValueFactory(new PropertyValueFactory<>("stockStatus"));

    }


    @javafx.fxml.FXML
    public void saveUpdatesOA(ActionEvent actionEvent) {

        if(foodTypeTF.getText().isEmpty()){
            AlertUtil.errorAlert("Please enter Food Type.");
            return;
        }

        if (Float.parseFloat(foodQuantityTF.getText()) < 0) {
            AlertUtil.errorAlert("Quantity cannot be Negative!");
            return;
        }

        if(stockStatusCB.getValue() == null){
            AlertUtil.errorAlert("Please select stock status.");
            return;
        }

        foodInventory foodinv = new foodInventory();

        foodinv.setFoodType(foodTypeTF.getText());
        foodinv.setFoodQuantity(Float.parseFloat(foodQuantityTF.getText()));
        foodinv.setStockStatus(stockStatusCB.getValue());

        File f = new File("UpdatedFoodStock.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try{

            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }

            else{

                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);

            }

            oos.writeObject(foodinv);
            oos.close();
            fos.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }

    @javafx.fxml.FXML
    public void showUpdatesButtonOA(ActionEvent actionEvent) {

        File f = new File("UpdatedFoodStock.bin");

        try{

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            StockAndQuantityTableView.getItems().clear();


            while(true){

                try{
                    foodInventory fi = (foodInventory) ois.readObject();
                    StockAndQuantityTableView.getItems().add(fi);
                }


                catch(EOFException e){
                    break;

                }

            }

            ois.close();
            fis.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void homePageOA(ActionEvent actionEvent) {
        //Back to Manager's Dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/FishFoodManagerDashboard.fxml",
                "Fish Food Manager Dashboard");
    }
}