package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import csc305.group57_finalproject_fishhatcheryfarm.AppendableObjectOutputStream;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class recordFeedSessionController
{
    @javafx.fxml.FXML
    private ComboBox<String> fishSpeciesCB;
    @javafx.fxml.FXML
    private TableColumn<fishStock,String> fishSpeciesColumn;
    @javafx.fxml.FXML
    private TableColumn<fishStock, String> healthStatusColumn;
    @javafx.fxml.FXML
    private TextField feedingSessionsTF;
    @javafx.fxml.FXML
    private TableView<fishStock> foodIntakeTableView;
    @javafx.fxml.FXML
    private TableColumn<fishStock, Integer> feedingSessionsTodayColumn;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private ComboBox<String> growthStageCB;
    @javafx.fxml.FXML
    private TableColumn<fishStock,String> growthStageColumn;
    @javafx.fxml.FXML
    private TextField healthStatusTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        growthStageCB.getItems().addAll("Newborn","Juvenile","Adult");
        fishSpeciesCB.getItems().addAll("Mackerel","Catfish","Snapper","Tilapia","Salmon","Tuna","CodFish","Sardines");
        fishSpeciesColumn.setCellValueFactory(new PropertyValueFactory<>("fishSpecies"));
        growthStageColumn.setCellValueFactory(new PropertyValueFactory<>("growthStage"));
        healthStatusColumn.setCellValueFactory(new PropertyValueFactory<>("healthStatus"));
        feedingSessionsTodayColumn.setCellValueFactory(new PropertyValueFactory<>("feedSessionsPerDay"));
    }


    @javafx.fxml.FXML
    public void showUpdateButton(ActionEvent actionEvent) {

        File f = new File("Feeding Sessions.bin");
        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            foodIntakeTableView.getItems().clear();

            while(true){

                try{
                    fishStock fs = (fishStock) ois.readObject();
                    foodIntakeTableView.getItems().add(fs);
                }

                catch (EOFException e){
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
    public void homePageButton(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent,
                "/csc305/group57_finalproject_fishhatcheryfarm/loginScene.fxml",
                "Home Page");
    }

    @javafx.fxml.FXML
    public void updateFeedSessionButtonOA(ActionEvent actionEvent) {
        if(growthStageCB.getValue() == null || fishSpeciesCB.getValue() == null){
            AlertUtil.errorAlert("Please select necessary fields.");
            return;
        }

        if(feedingSessionsTF.getText().isEmpty()){
            AlertUtil.errorAlert("Empty field: Feeding sessions today");
            return;
        }

        int feedSession = Integer.parseInt(feedingSessionsTF.getText());

        if(feedSession < 0){
            AlertUtil.errorAlert("Negative value!");
            return;
        }

        if(healthStatusTF.getText().isEmpty()){
            AlertUtil.errorAlert("Empty field: Health Status.");
            return;
        }

        fishStock fs = new fishStock();

        fs.setGrowthStage(growthStageCB.getValue());
        fs.setFishSpecies(fishSpeciesCB.getValue());
        fs.setFeedSessionsPerDay(feedSession);
        fs.setHealthStatus(healthStatusTF.getText());

        File f = new File("Feeding Sessions.bin");
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

            oos.writeObject(fs);
            oos.close();
            fos.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}