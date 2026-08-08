package csc305.group57_finalproject_fishhatcheryfarm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginScene.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/Delivery&SalesManagerFxml/SalesDashBoard.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/csc305/group57_finalproject_fishhatcheryfarm/Farin_2312086_FXML/HatcheryProductionManager/HatcheryDashBoard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome to Fish Hatchery Farm Management");
        stage.setScene(scene);
        stage.show();
    }
}
