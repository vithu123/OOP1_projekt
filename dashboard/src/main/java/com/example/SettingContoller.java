
package com.example;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SettingContoller {

    @FXML
    private TextField bed_set_1;

    @FXML
    private TextField bed_set_2;

    @FXML
    private TextField bed_set_3;

    @FXML
    private TextField bed_set_4;

    @FXML
    private TextField nozzel_set_1;

    @FXML
    private TextField nozzel_set_2;

    @FXML
    private TextField nozzel_set_3;

    @FXML
    private TextField nozzel_set_4;

    @FXML
    void autoHome_1(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("G28\n");
    }

    @FXML
    void autoHome_2(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("G28\n");
    }

    @FXML
    void autoHome_3(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("G28\n");
    }

    @FXML
    void autoHome_4(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("G28\n");
    }

    @FXML
    void moveX_1_minus(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("G91\n");
        PrinterManager.communicator1.sendCommand("G0 X-10\n");
        PrinterManager.communicator1.sendCommand("G90\n");
    }

    @FXML
    void moveX_1_plus(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("G91\n");
        PrinterManager.communicator1.sendCommand("G0 X10\n");
        PrinterManager.communicator1.sendCommand("G90\n");
    }

    @FXML
    void moveX_2_minus(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("G91\n");
        PrinterManager.communicator2.sendCommand("G0 X-10\n");
        PrinterManager.communicator2.sendCommand("G90\n");
    }

    @FXML
    void moveX_2_plus(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("G91\n");
        PrinterManager.communicator2.sendCommand("G0 X10\n");
        PrinterManager.communicator2.sendCommand("G90\n");
    }

    @FXML
    void moveX_3_minus(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("G91\n");
        PrinterManager.communicator3.sendCommand("G0 X-10\n");
        PrinterManager.communicator3.sendCommand("G90\n");
    }

    @FXML
    void moveX_3_plus(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("G91\n");
        PrinterManager.communicator3.sendCommand("G0 X10\n");
        PrinterManager.communicator3.sendCommand("G90\n");
    }

    @FXML
    void moveX_4_minus(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("G91\n");
        PrinterManager.communicator4.sendCommand("G0 X-10\n");
        PrinterManager.communicator4.sendCommand("G90\n");
    }

    @FXML
    void moveX_4_plus(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("G91\n");
        PrinterManager.communicator4.sendCommand("G0 X10\n");
        PrinterManager.communicator4.sendCommand("G90\n");
    }

    @FXML
    void moveY_1_minus(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("G91\n");
        PrinterManager.communicator1.sendCommand("G0 Y-10\n");
        PrinterManager.communicator1.sendCommand("G91\n");
    }

    @FXML
    void moveY_1_plus(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("G91\n");
        PrinterManager.communicator1.sendCommand("G0 Y10\n");
        PrinterManager.communicator1.sendCommand("G90\n");
    }

    @FXML
    void moveY_2_minus(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("G91\n");
        PrinterManager.communicator2.sendCommand("G0 Y-10\n");
        PrinterManager.communicator2.sendCommand("G90\n");
    }

    @FXML
    void moveY_2_plus(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("G91\n");
        PrinterManager.communicator2.sendCommand("G0 Y10\n");
        PrinterManager.communicator2.sendCommand("G90\n");
    }

    @FXML
    void moveY_3_minus(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("G91\n");
        PrinterManager.communicator3.sendCommand("G0 Y-10\n");
        PrinterManager.communicator3.sendCommand("G90\n");
    }

    @FXML
    void moveY_3_plus(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("G91\n");
        PrinterManager.communicator3.sendCommand("G0 Y10\n");
        PrinterManager.communicator3.sendCommand("G90\n");
    }

    @FXML
    void moveY_4_minus(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("G91\n");
        PrinterManager.communicator4.sendCommand("G0 Y-10\n");
        PrinterManager.communicator4.sendCommand("G90\n");
    }

    @FXML
    void moveY_4_plus(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("G91\n");
        PrinterManager.communicator4.sendCommand("G0 Y10\n");
        PrinterManager.communicator4.sendCommand("G90\n");
    }

    @FXML
    void moveZ_1_minus(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("G91\n");
        PrinterManager.communicator1.sendCommand("G0 Z-10\n");
        PrinterManager.communicator1.sendCommand("G90\n");
    }

    @FXML
    void moveZ_1_plus(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("G91\n");
        PrinterManager.communicator1.sendCommand("G0 Z10\n");
        PrinterManager.communicator1.sendCommand("G90\n");
    }

    @FXML
    void moveZ_2_minus(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("G91\n");
        PrinterManager.communicator2.sendCommand("G0 Z-10\n");
        PrinterManager.communicator2.sendCommand("G90\n");
    }

    @FXML
    void moveZ_2_plus(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("G91\n");
        PrinterManager.communicator2.sendCommand("G0 Z10\n");
        PrinterManager.communicator2.sendCommand("G90\n");
    }

    @FXML
    void moveZ_3_minus(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("G91\n");
        PrinterManager.communicator3.sendCommand("G0 Z-10\n");
        PrinterManager.communicator3.sendCommand("G90\n");
    }

    @FXML
    void moveZ_3_plus(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("G91\n");
        PrinterManager.communicator3.sendCommand("G0 Z10\n");
        PrinterManager.communicator3.sendCommand("G90\n");
    }

    @FXML
    void moveZ_4_minus(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("G91\n");
        PrinterManager.communicator4.sendCommand("G0 Z-10\n");
        PrinterManager.communicator4.sendCommand("G90\n");
    }

    @FXML
    void moveZ_4_plus(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("G91\n");
        PrinterManager.communicator4.sendCommand("G0 Z10\n");
        PrinterManager.communicator4.sendCommand("G90\n");
    }

    @FXML
    void setting_back_1(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void setting_back_2(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void setting_back_3(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void setting_back_4(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void temp_set_1(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("M109 S" +nozzel_set_1.getText() +" \n");
        PrinterManager.communicator1.sendCommand("M190 S" +bed_set_1.getText() +" \n");
    }
    @FXML
    void temp_set_2(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("M109 S" +nozzel_set_1.getText() +" \n");
        PrinterManager.communicator2.sendCommand("M190 S" +bed_set_1.getText() +" \n");
    }

    @FXML
    void temp_set_3(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("M109 S" +nozzel_set_1.getText() +" \n");
        PrinterManager.communicator3.sendCommand("M190 S" +bed_set_1.getText() +" \n");
    }

    @FXML
    void temp_set_4(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("M109 S" +nozzel_set_1.getText() +" \n");
        PrinterManager.communicator4.sendCommand("M190 S" +bed_set_1.getText() +" \n");
    }

}