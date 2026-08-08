package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
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

public class supplyMedController
{
    @javafx.fxml.FXML
    private DatePicker deliveryDateDP;
    @javafx.fxml.FXML
    private TableColumn<Medication, LocalDate> deliveryDateColumn;
    @javafx.fxml.FXML
    private TextField medTypeTF;
    @javafx.fxml.FXML
    private TextField quantitySuppliedTF;
    @javafx.fxml.FXML
    private TableColumn<Medication, LocalDate> expiryDateColumn;
    @javafx.fxml.FXML
    private DatePicker expiryDateDP;
    @javafx.fxml.FXML
    private TableView<Medication> medSuppliesTV;
    @javafx.fxml.FXML
    private TableColumn<Medication, Float> quantitySuppliedColumn;
    @javafx.fxml.FXML
    private TableColumn<Medication, String> medTypeColumn;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        medTypeColumn.setCellValueFactory(new PropertyValueFactory<>("medType"));
        deliveryDateColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        quantitySuppliedColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        expiryDateColumn.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
    }


    @javafx.fxml.FXML
    public void addMedSuppliesButton(ActionEvent actionEvent) {

        Medication m =new Medication();
        m.setMedType(medTypeTF.getText());
        m.setDeliveryDate(deliveryDateDP.getValue());
        m.setQuantity(Float.parseFloat(quantitySuppliedTF.getText()));
        m.setExpiryDate(expiryDateDP.getValue());


        File f = new File("Med Supplies.bin");
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

            oos.writeObject(m);
            oos.close();
            fos.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }

    @javafx.fxml.FXML
    public void viewListButton(ActionEvent actionEvent) {
        File f = new File("Med Supplies.bin");

        try{

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            medSuppliesTV.getItems().clear();


            while(true){

                try{
                    Medication med = (Medication) ois.readObject();
                    medSuppliesTV.getItems().add(med);
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
        //Back to supplier's dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/supplierDashboard.fxml",
                "Supplier Dashboard");
    }
}