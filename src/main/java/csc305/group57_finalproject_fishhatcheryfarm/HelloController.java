package csc305.group57_finalproject_fishhatcheryfarm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to Fish Hatchery Management App!");
        System.out.print("Hello");
    }
}
