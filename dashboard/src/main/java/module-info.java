module com.example {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fazecast.jSerialComm;
    requires java.desktop;
    opens com.example to javafx.fxml;
    exports com.example; 
}
