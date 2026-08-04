package csc305.group57_finalproject_fishhatcheryfarm.Utils;

import javafx.scene.control.Alert;

public class AlertUtil {

    public static void infoAlert(String message){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information:");
        a.setContentText(message);
        a.showAndWait();
    }

    public static void errorAlert(String message){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Error:");
        a.setContentText(message);
        a.showAndWait();

    }

}
