module csc305.group57_finalproject_fishhatcheryfarm {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens csc305.group57_finalproject_fishhatcheryfarm to javafx.fxml;
    opens csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.HatcheryProduction to javafx.fxml, javafx.base;
    opens csc305.group57_finalproject_fishhatcheryfarm.Farin_2312086.DeliveryAndSales to javafx.fxml, javafx.base;
    exports csc305.group57_finalproject_fishhatcheryfarm;
    exports csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;
    opens csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851 to javafx.fxml;
    exports csc305.group57_finalproject_fishhatcheryfarm.Utils;
    opens csc305.group57_finalproject_fishhatcheryfarm.Utils to javafx.fxml;
}