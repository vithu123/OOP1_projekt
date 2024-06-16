package com.example;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import com.fazecast.jSerialComm.SerialPort;

public class PrinterController { 

    
    @FXML
    private Label label;
     @FXML
    private Menu settingButton;
    @FXML
    private void connect() throws IOException {
        App.setSceneRoot("file");
    }
    
    @FXML
    private void switchToFile() throws IOException {
        App.setSceneRoot("file");
    }

    @FXML
    private void switchToSetting() throws IOException {
        App.setSceneRoot("setting");
        label.setText("Clicked ");
        //App.printer1.listAllComPorts();
        
    }

    
}
