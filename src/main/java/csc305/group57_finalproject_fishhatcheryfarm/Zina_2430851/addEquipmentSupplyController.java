package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class addEquipmentSupplyController
{
    @javafx.fxml.FXML
    private TableColumn<equipment, Float> quantityColumn;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TableView<equipment> equipmentTV;
    @javafx.fxml.FXML
    private ComboBox<String> equipmentTypeCB;
    @javafx.fxml.FXML
    private TextField warrantyPeriodTF;
    @javafx.fxml.FXML
    private TextField unitPriceTF;
    @javafx.fxml.FXML
    private ComboBox<String> conditionCB;
    @javafx.fxml.FXML
    private TableColumn<equipment, String> warrantyColumn;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private TableColumn<equipment, String> typeColumn;
    @javafx.fxml.FXML
    private TableColumn<equipment, Float> priceColumn;
    @javafx.fxml.FXML
    private TableColumn<equipment, String> conditionColumn;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        equipmentTypeCB.getItems().addAll("Nets", "Water Pumps","Water Filters", "Oxygen Cylinders", "Aerators");
        conditionCB.getItems().addAll("New", "Refurbished");
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("equipmentType"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        warrantyColumn.setCellValueFactory(new PropertyValueFactory<>("warrantyPeriod"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        conditionColumn.setCellValueFactory(new PropertyValueFactory<>("condition"));

    }


    @javafx.fxml.FXML
    public void addEquipmentButton(ActionEvent actionEvent) {
        equipment eq = new equipment();
        eq.setCondition(conditionCB.getValue());
        eq.setEquipmentType(equipmentTypeCB.getValue());
        eq.setQuantity(Float.parseFloat(quantityTF.getText()));
        eq.setWarrantyPeriod(warrantyPeriodTF.getText());
        eq.setUnitPrice(Float.parseFloat(unitPriceTF.getText()));

        File f = new File("Equipment Supplies.bin");
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

            oos.writeObject(eq);
            oos.close();
            fos.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void showUpdatesOA(ActionEvent actionEvent) {
        File f = new File("Equipment Supplies.bin");


        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream((fis));
            equipmentTV.getItems().clear();

            while(true){
                try{
                    equipment Equipment = (equipment) ois.readObject();
                    equipmentTV.getItems().add(Equipment);

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

    @javafx.fxml.FXML
    public void homePageButton(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }
}