module com.example.clothifystore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.clothify to javafx.fxml;
    exports com.clothify;
    exports com.clothify.controllers;
    opens com.clothify.controllers to javafx.fxml;
}