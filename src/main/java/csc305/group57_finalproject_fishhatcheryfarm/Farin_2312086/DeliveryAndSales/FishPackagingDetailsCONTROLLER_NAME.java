package csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class FishPackagingDetailsCONTROLLER_NAME {

    @javafx.fxml.FXML
    private TableColumn<FishPackaging, String> PackigingTypeTablecolumn;

    @javafx.fxml.FXML
    private TableColumn<FishPackaging, String> routeTablecolumn;

    @javafx.fxml.FXML
    private TableColumn<FishPackaging, Integer> PackigingQuantityTablecolumn;

    @javafx.fxml.FXML
    private TableColumn<FishPackaging, Integer> TotalOrdersTablecolumn;

    @javafx.fxml.FXML
    private ComboBox<String> PackigingTypeComboBOx;

    @javafx.fxml.FXML
    private TableView<FishPackaging> Tableview;

    @javafx.fxml.FXML
    private TableColumn<FishPackaging, String> BatchIDTablecolumn;

    @javafx.fxml.FXML
    private TextField PackigingQuantutyTextfield;

    ArrayList<FishPackaging> packagingList = new ArrayList<>();

    FishPackaging fishPackaging;


    @javafx.fxml.FXML
    public void initialize() {

        PackigingTypeComboBOx.getItems().addAll(
                "Oxygenated Poly Bags",
                "Insulated Plastic Crate",
                "Fiberglass Tank",
                "Standard Container"
        );


        BatchIDTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("batchId")
        );

        routeTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("route")
        );

        TotalOrdersTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("totalOrders")
        );

        PackigingTypeTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("packagingType")
        );

        PackigingQuantityTablecolumn.setCellValueFactory(
                new PropertyValueFactory<>("packagingQuantity")
        );


        packagingList.add(
                new FishPackaging(
                        "BATCH-101",
                        "Dhaka Route",
                        12,
                        "Unassigned",
                        0
                )
        );

        packagingList.add(
                new FishPackaging(
                        "BATCH-102",
                        "Chittagong Route",
                        8,
                        "Unassigned",
                        0
                )
        );

        packagingList.add(
                new FishPackaging(
                        "BATCH-103",
                        "Sylhet Route",
                        15,
                        "Unassigned",
                        0
                )
        );


        Tableview.getItems().addAll(packagingList);
    }


    @javafx.fxml.FXML
    public void AssignPackigingButton(ActionEvent actionEvent) {

        FishPackaging selectedBatch =
                Tableview.getSelectionModel().getSelectedItem();

        String selectedType =
                PackigingTypeComboBOx.getValue();

        String quantityText =
                PackigingQuantutyTextfield.getText();


        if (selectedBatch != null &&
                selectedType != null &&
                !quantityText.isEmpty()) {

            try {

                int quantity =
                        Integer.parseInt(quantityText);

                selectedBatch.setPackagingType(selectedType);

                selectedBatch.setPackagingQuantity(quantity);

                Tableview.refresh();

                ClearButton(actionEvent);

            } catch (NumberFormatException e) {

                e.printStackTrace();
            }
        }
    }


    @javafx.fxml.FXML
    public void Backbutton(ActionEvent actionEvent) {

        System.out.println("Back button clicked");

    }


    @javafx.fxml.FXML
    public void ClearButton(ActionEvent actionEvent) {

        PackigingTypeComboBOx.setValue(null);

        PackigingQuantutyTextfield.clear();

        Tableview.getSelectionModel().clearSelection();
    }
}