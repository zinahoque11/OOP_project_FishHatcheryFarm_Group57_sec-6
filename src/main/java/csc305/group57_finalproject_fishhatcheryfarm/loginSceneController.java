package csc305.group57_finalproject_fishhatcheryfarm;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginSceneController
{
    @javafx.fxml.FXML
    private TextField userIdTF;
    @javafx.fxml.FXML
    private TextField userNameTF;
    @javafx.fxml.FXML
    private PasswordField passwordTF;
    @javafx.fxml.FXML
    private TextField userEmailTF;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeCB.getItems().addAll(
                "Fish Food Manager",
                "Supplier",
                "Customer",
                "Delivery Man",
                "Managing Director",
                "Accountant",
                "Hatchery Production Manager",
                "Delivery & Sales Manager");
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) {


    }
}