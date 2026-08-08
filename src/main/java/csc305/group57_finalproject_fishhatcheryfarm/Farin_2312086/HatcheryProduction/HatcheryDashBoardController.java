package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction;


import csc305.group57_finalproject_fishhatcheryfarm.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HatcheryDashBoardController {

    @javafx.fxml.FXML
    private BorderPane boarderPane;


    @javafx.fxml.FXML
    public void initialize() {

    }


    @javafx.fxml.FXML
    public void RecordFeedButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/RecordFeedDistributionforHatchlings.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    @javafx.fxml.FXML
    public void CompletedHatchButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/RemoveorArchiveCompletedHatch.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void IncubationCyclesButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/ManageEggIncubationCycles.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void FishBreedingButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/RecordFishBreedingBatchInformation.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void SuccessRateButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/MonitorHatchSuccessRateperBatch.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void AssignHatcheryButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/AssignHatcheryTankstoEggBatches.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void ServivalRateButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/CalculateSurvivalRateofHatchCycles.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void DailySummaryButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(
                    HelloApplication.class.getResource(
                            "/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/GenerateDailyHatcheryProductionSummary.fxml"
                    )
            );

            boarderPane.setCenter(fxmlLoader.load());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}