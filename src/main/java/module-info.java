module com.example.clothifystore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clothifystore to javafx.fxml;
    exports com.example.clothifystore;
}