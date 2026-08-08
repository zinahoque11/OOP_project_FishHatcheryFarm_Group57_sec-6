package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class OrderrequestCONTROLLER_NAME {

    @FXML
    private TextField CustomerNameTextField;

    @FXML
    private TextField CustomerPhoneTextfield;

    @FXML
    private TextField QuantityTextfield;

    @FXML
    private TextField EstimatedPriceTextfield;

    @FXML
    private ComboBox<String> FishSpeciesCombobox;

    @FXML
    private TableView<Orderrequest> Tableview;

    @FXML
    private TableColumn<Orderrequest, String> OrderIDTablecolumn;

    @FXML
    private TableColumn<Orderrequest, String> CustomerTablecolumn;

    @FXML
    private TableColumn<Orderrequest, String> SpeciesTablecolumn;

    @FXML
    private TableColumn<Orderrequest, Integer> QuantityTablecolumn;

    @FXML
    private TableColumn<Orderrequest, String> StatusTablecolumn;


    ArrayList<Orderrequest> orderList = new ArrayList<>();

    Orderrequest orderrequest;


    @FXML
    public void initialize() {

        FishSpeciesCombobox.getItems().addAll(
                "Tilapia",
                "Rui",
                "Catla",
                "Mrigal",
                "Pangasius"
        );


        OrderIDTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("orderId")
        );

        CustomerTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("customerName")
        );

        SpeciesTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("fishSpecies")
        );

        QuantityTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("quantity")
        );

        StatusTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("status")
        );
    }


    @FXML
    public void OrderButton(ActionEvent actionEvent) {

        String orderId = "ORD-" + (orderList.size() + 101);

        String customerName =
                CustomerNameTextField.getText();

        String customerPhone =
                CustomerPhoneTextfield.getText();

        String fishSpecies =
                FishSpeciesCombobox.getValue();

        int quantity =
                Integer.parseInt(QuantityTextfield.getText());

        double estimatedPrice =
                Double.parseDouble(
                        EstimatedPriceTextfield.getText()
                );

        String status = "Pending";


        orderrequest = new Orderrequest(
                orderId,
                customerName,
                customerPhone,
                fishSpecies,
                quantity,
                estimatedPrice,
                status
        );


        orderList.add(orderrequest);

        Tableview.getItems().add(orderrequest);


        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(
                                    "CustomerOrder.txt",
                                    true
                            )
                    );

            writer.write(
                    orderrequest.getOrderId() + "," +
                            orderrequest.getCustomerName() + "," +
                            orderrequest.getCustomerPhone() + "," +
                            orderrequest.getFishSpecies() + "," +
                            orderrequest.getQuantity() + "," +
                            orderrequest.getEstimatedPrice() + "," +
                            orderrequest.getStatus() + "\n"
            );

            writer.close();

        } catch (Exception e) {

            e.printStackTrace();
        }


        ClearButton(actionEvent);
    }


    @FXML
    public void ClearButton(ActionEvent actionEvent) {

        CustomerNameTextField.clear();

        CustomerPhoneTextfield.clear();

        QuantityTextfield.clear();

        EstimatedPriceTextfield.clear();

        FishSpeciesCombobox.setValue(null);

        Tableview.getSelectionModel().clearSelection();
    }


    @FXML
    public void Backbutton(ActionEvent actionEvent) {

        System.out.println("Back button clicked");

    }
}