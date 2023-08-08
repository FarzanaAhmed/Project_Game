module com.example.gamebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gamebox to javafx.fxml;
    exports com.example.gamebox;
}