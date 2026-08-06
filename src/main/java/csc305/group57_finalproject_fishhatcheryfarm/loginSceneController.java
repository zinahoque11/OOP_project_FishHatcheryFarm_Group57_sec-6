package csc305.group57_finalproject_fishhatcheryfarm;

import csc305.group57_finalproject_fishhatcheryfarm.Utils.AlertUtil;
import csc305.group57_finalproject_fishhatcheryfarm.Utils.SceneSwitcher;
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

        String userName = userNameTF.getText();
        String email = userEmailTF.getText();
        String userId = userIdTF.getText();
        String password = passwordTF.getText();
        String userType = userTypeCB.getValue();


        if(userName.isEmpty() || email.isEmpty() || userId.isEmpty() || password.isEmpty()){

            AlertUtil.errorAlert("Please fill up all the information!");
            return;
        }

        if(userId.length() < 5){

            AlertUtil.errorAlert("User ID must have 5 characters!");
            return;
        }

        if(!email.contains("@") || !email.contains(".com") || !email.contains("gmail")){

            AlertUtil.errorAlert("Invalid Email!");
            return;
        }


        if (userType == null ){

            AlertUtil.errorAlert("Please select a user Type!");
            return;
        }

        switch(userType){

            case "Supplier":
                SceneSwitcher.switchScene(actionEvent,
                        "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/supplierDashboard.fxml",
                        "Supplier Dashboard");

                break;

            case "Fish Food Manager":
                SceneSwitcher.switchScene(actionEvent,
                        "/csc305/group57_finalproject_fishhatcheryfarm/Zina_2430851/FishFoodManagerDashboard.fxml",
                        "Fish Food Manager Dashboard");

                break;

            case "Customer":
                SceneSwitcher.switchScene(actionEvent,
                        "/csc305/group57_finalproject_fishhatcheryfarm/Tabassum_2430965/customerDashboard.fxml",
                        "Customer Dashboard");

                break;

            case "Delivery Man":
                SceneSwitcher.switchScene(actionEvent,
                        "/csc305/group57_finalproject_fishhatcheryfarm/Tabassum_2430965/DeliveryManDashboard.fxml",
                        "Delivery Man Dashboard");

                break;



        }





    }
}