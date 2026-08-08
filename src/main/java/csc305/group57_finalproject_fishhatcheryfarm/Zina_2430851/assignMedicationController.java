package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class assignMedicationController
{
    @javafx.fxml.FXML
    private TableColumn<Medication, String> medNameColumn;
    @javafx.fxml.FXML
    private TextField durationTF;
    @javafx.fxml.FXML
    private ComboBox<String> fishspeciesCB;
    @javafx.fxml.FXML
    private TextField medNameTF;
    @javafx.fxml.FXML
    private TextField tankIdTF;
    @javafx.fxml.FXML
    private TableColumn<Medication, String> tankIDcolumn;
    @javafx.fxml.FXML
    private TextField medDosageTF;
    @javafx.fxml.FXML
    private TableColumn<Medication, Float> medDosageColumn;
    @javafx.fxml.FXML
    private TableColumn<Medication, String> speciesColumn;
    @javafx.fxml.FXML
    private TableView<Medication> medTableView;
    @javafx.fxml.FXML
    private TableColumn<Medication, Integer> durationColumn;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        fishspeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        tankIDcolumn.setCellValueFactory(new PropertyValueFactory<>("tankID"));
        speciesColumn.setCellValueFactory(new PropertyValueFactory<>("fishSpecies"));
        medNameColumn.setCellValueFactory(new PropertyValueFactory<>("medType"));
        medDosageColumn.setCellValueFactory(new PropertyValueFactory<>("dosage"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("medDurationDays"));

    }


    @javafx.fxml.FXML
    public void assignMedButton(ActionEvent actionEvent) {

        Medication m = new Medication();
        m.setTankID(tankIdTF.getText());
        m.setFishSpecies(fishspeciesCB.getValue());
        m.setMedType(medNameTF.getText());
        m.setDosage(Float.parseFloat(medDosageTF.getText()));
        m.setMedDurationDays(Integer.parseInt(durationTF.getText()));


        File f = new File("Assign Med.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try{
            if(f.exists()){
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
    public void homePageButton(ActionEvent actionEvent) {

        //Back to Manager's Dashboard
        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/FishFoodManagerDashboard.fxml",
                "Fish Food Manager Dashboard");
    }

    @javafx.fxml.FXML
    public void showUpdatesOA(ActionEvent actionEvent) {

        File f = new File("Assign Med.bin");

        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            medTableView.getItems().clear();


            while(true){
                try{
                    Medication med = (Medication) ois.readObject();
                    medTableView.getItems().add(med);
                }

                catch(Exception e){
                    break;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }}


