module com.example.weatherfetch {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    opens com.example.weatherfetch to javafx.fxml;
    exports com.example.weatherfetch;
}