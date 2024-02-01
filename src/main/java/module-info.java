module com.example.securin1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.securin1 to javafx.fxml;
    exports com.example.securin1;
}