package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.time.LocalDate;

public class addFeedingSuppliesController
{
    @javafx.fxml.FXML
    private TableColumn<supplyFood, String> feedTypeColumn;
    @javafx.fxml.FXML
    private TextField quantitySuppliedTF;
    @javafx.fxml.FXML
    private TextField unitPriceTF;
    @javafx.fxml.FXML
    private ComboBox<String> feedTypeCB;
    @javafx.fxml.FXML
    private TableColumn<supplyFood, Float> quantitySuppliedColumn;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TextField productNameTF;
    @javafx.fxml.FXML
    private TableView<supplyFood> supplyFoodTV;
    @javafx.fxml.FXML
    private TableColumn<supplyFood, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<supplyFood,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<supplyFood, Float> priceColumn;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        feedTypeCB.getItems().addAll("Pellet","Crumble","Powder");
        productColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        quantitySuppliedColumn.setCellValueFactory(new PropertyValueFactory<>("quantitySupplied"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        feedTypeColumn.setCellValueFactory(new PropertyValueFactory<>("feedType"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));

    }


    @javafx.fxml.FXML
    public void addSuppliesButton(ActionEvent actionEvent) {

        supplyFood sf = new supplyFood();
        sf.setFeedType(feedTypeCB.getValue());
        sf.setProductName(productNameTF.getText());
        sf.setQuantitySupplied(Float.parseFloat(quantitySuppliedTF.getText()));
        sf.setDeliveryDate(deliveryDateDP.getValue());
        sf.setUnitPrice(Float.parseFloat(unitPriceTF.getText()));

        File f = new File("Food supply.bin");
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

            oos.writeObject(sf);
            oos.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }



    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {

        //Back to supplier's dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/supplierDashboard.fxml",
                "Supplier Dashboard");
    }

    @javafx.fxml.FXML
    public void viewSuppliesOA(ActionEvent actionEvent) {
        File f = new File("Food supply.bin");

        try{

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            supplyFoodTV.getItems().clear();

            while(true){
                try{
                    supplyFood s = (supplyFood) ois.readObject();
                    supplyFoodTV.getItems().add(s);
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