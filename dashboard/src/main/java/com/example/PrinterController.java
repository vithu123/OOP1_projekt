
package com.example;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;



public class PrinterController implements Initializable{ 
    
    @FXML
    private Label X_1;

    private static Label static_X_1;

    @FXML
    private Label X_2;

    private static Label static_X_2;

    @FXML
    private Label X_3;

    private static Label static_X_3;

    @FXML
    private Label X_4;

    private static Label static_X_4;

    @FXML
    private Label Y_1;

    private static Label static_Y_1;

    @FXML
    private Label Y_2;

    private static Label static_Y_2;

    @FXML
    private Label Y_3;

    private static Label static_Y_3;

    @FXML
    private Label Y_4;

    private static Label static_Y_4;


    @FXML
    private Label Z_1;

    private static Label static_Z_1;

    @FXML
    private Label Z_2;

    private static Label static_Z_2;

    @FXML
    private Label Z_3;

    private static Label static_Z_3;

    @FXML
    private Label Z_4;

    private static Label static_Z_4;

    @FXML
    private Label bedTemp_1;

    private static Label static_bedTemp_1;

    @FXML
    private Label bedTemp_2;

    private static Label static_bedTemp_2;

    @FXML
    private Label bedTemp_3;

    private static Label static_bedTemp_3;


    @FXML
    private Label bedTemp_4;

    private static Label static_bedTemp_4;

    @FXML
    private Label nozzTemp_1;

    private static Label static_nozzTemp_1;

    @FXML
    private Label nozzTemp_2;

    private static Label static_nozzTemp_2;

    @FXML
    private Label nozzTemp_3;

    private static Label static_nozzTemp_3;

    @FXML
    private Label nozzTemp_4;

    private static Label static_nozzTemp_4;

    @FXML
    private Label status_1;

    private static Label static_status_1;

    @FXML
    private Label status_2;

    private static Label static_status_2;

    @FXML
    private Label status_3;

    private static Label static_status_3;

    @FXML
    private Label status_4; 

    private static Label static_status_4;

    @FXML
    private Menu settingButton;

    @FXML
    private AnchorPane menuPrinter1;

    @FXML
    private AnchorPane menuPrinter2;

    @FXML
    private AnchorPane menuPrinter3;

    @FXML
    private AnchorPane menuPrinter4;

        @FXML
    private Button setPrinter1;

    @FXML
    private Button setPrinter2;

    @FXML
    private Button setPrinter3;

    @FXML
    private Button setPrinter4;
    
   @FXML
    private ChoiceBox<String> choiceBox1;

    @FXML
    private ChoiceBox<String> choiceBox2;

    @FXML
    private ChoiceBox<String> choiceBox3;
    @FXML
    private ChoiceBox<String> choiceBox4;
   
    @FXML
    private String[] data = new String[6];

    private String comString;


    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        
        PrinterManager.initialize();
        comString=PrinterManager.communicator.listAllComPorts();
        data = comString.split("\n");
        
        choiceBox1.getItems().addAll(data);
        choiceBox1.setOnAction(this::getData1);

        choiceBox1.getSelectionModel().clearSelection();

        choiceBox2.getItems().addAll(data);
        choiceBox2.setOnAction(this::getData2);

        choiceBox2.getSelectionModel().clearSelection();

        choiceBox3.getItems().addAll(data);
        choiceBox3.setOnAction(this::getData3);

        choiceBox3.getSelectionModel().clearSelection();

        choiceBox4.getItems().addAll(data);
        choiceBox4.setOnAction(this::getData4);

        choiceBox4.getSelectionModel().clearSelection();

        static_X_1=X_1;
        static_X_2=X_2;
        static_X_3=X_3;
        static_X_4=X_4;

        static_Y_1=Y_1;
        static_Y_2=Y_2;
        static_Y_3=Y_3;
        static_Y_4=Y_4;

        static_Z_1=Z_1;
        static_Z_2=Z_2;
        static_Z_3=Z_3;
        static_Z_4=Z_4;

        static_nozzTemp_1=nozzTemp_1;
        static_nozzTemp_2=nozzTemp_2;
        static_nozzTemp_3=nozzTemp_3;
        static_nozzTemp_4=nozzTemp_4;

        static_bedTemp_1=bedTemp_1;
        static_bedTemp_2=bedTemp_2;
        static_bedTemp_3=bedTemp_3;
        static_bedTemp_4=bedTemp_4;

        static_status_1=status_1;
        static_status_2=status_2;
        static_status_3=status_3;
        static_status_4=status_4;

        
    }

 

    private void getData1(ActionEvent event){
    }
    private void getData2(ActionEvent event){
    }
    private void getData3(ActionEvent event){
    }
    private void getData4(ActionEvent event){
    }

    public static void setStatic_nozzTemp_1(String texString) {
        PrinterController.static_nozzTemp_1.setText(texString + "C°");
    }

    public static void setStatic_nozzTemp_2(String texString) {
        PrinterController.static_nozzTemp_2.setText(texString + "C°");
    }

    public static void setStatic_nozzTemp_3(String texString) {
        PrinterController.static_nozzTemp_3.setText(texString + "C°");
    }

    public static void setStatic_nozzTemp_4(String texString) {
        PrinterController.static_nozzTemp_4.setText(texString + "C°");
    }

    public static void setStatic_bedTemp_1(String texString) {
        PrinterController.static_bedTemp_1.setText(texString + "C°");
    }

    public static void setStatic_bedTemp_2(String texString) {
        PrinterController.static_bedTemp_2.setText(texString + "C°");
    }

    public static void setStatic_bedTemp_3(String texString) {
        PrinterController.static_bedTemp_3.setText(texString + "C°");
    }

    public static void setStatic_bedTemp_4(String texString) {
        PrinterController.static_bedTemp_4.setText(texString + "C°");
    }

    public static void setStatic_status_1(String texString) {
        PrinterController.static_status_1.setText(texString);
    }

    public static void setStatic_status_2(String texString) {
        PrinterController.static_status_2.setText(texString);
    }

    public static void setStatic_status_3(String texString) {
        PrinterController.static_status_3.setText(texString);
    }

    public static void setStatic_status_4(String texString) {
        PrinterController.static_status_4.setText(texString);
    }

    public static void setStatic_X_1(String texString) {
        PrinterController.static_X_1.setText(texString);
    }

    public static void setStatic_X_2(String texString) {
        PrinterController.static_X_2.setText(texString);
    }

    public static void setStatic_X_3(String texString) {
        PrinterController.static_X_3.setText(texString);
    }

    public static void setStatic_X_4(String texString) {
        PrinterController.static_X_4.setText(texString);
    }

    public static void setStatic_Y_1(String texString) {
        PrinterController.static_Y_1.setText(texString);
    }

    public static void setStatic_Y_2(String texString) {
        PrinterController.static_Y_2.setText(texString);
    }

    public static void setStatic_Y_3(String texString) {
        PrinterController.static_Y_3.setText(texString);
    }

    public static void setStatic_Y_4(String texString) {
        PrinterController.static_Y_4.setText(texString);
    }

    public static void setStatic_Z_1(String texString) {
        PrinterController.static_Z_1.setText(texString);
    }

    public static void setStatic_Z_2(String texString) {
        PrinterController.static_Z_2.setText(texString);
    }

    public static void setStatic_Z_3(String texString) {
        PrinterController.static_Z_3.setText(texString);
    }

    public static void setStatic_Z_4(String texString) {
        PrinterController.static_Z_4.setText(texString);
    }

    @FXML
    void close1(ActionEvent event) {
        menuPrinter1.setVisible(false);
        setPrinter1.setVisible(true);
    }

    @FXML
    void close2(ActionEvent event) {
        menuPrinter2.setVisible(false);
        setPrinter2.setVisible(true);
    }

    @FXML
    void close3(ActionEvent event) {
        menuPrinter3.setVisible(false);
        setPrinter3.setVisible(true);
    }

    @FXML
    void close4(ActionEvent event) {
        menuPrinter4.setVisible(false);
        setPrinter4.setVisible(true);
    }

    @FXML
    void conntect1(ActionEvent event) {

        PrinterManager.communicator1.setComPort(choiceBox1.getValue());
        PrinterManager.communicator1.connect();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(PrinterManager.communicator1.readResponse());
        
        PrinterManager.printer1.setCollectSensorData(true);

    }

    @FXML
    void conntect2(ActionEvent event) {
        PrinterManager.communicator2.setComPort(choiceBox2.getValue());
        PrinterManager.communicator2.connect();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(PrinterManager.communicator2.readResponse());

    }


    @FXML
    void conntect3(ActionEvent event) {
        PrinterManager.communicator3.setComPort(choiceBox3.getValue());
        PrinterManager.communicator3.connect();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(PrinterManager.communicator3.readResponse());

        PrinterManager.printer3.setCollectSensorData(true);
    }

    @FXML
    void conntect4(ActionEvent event) {
        PrinterManager.communicator4.setComPort(choiceBox4.getValue());
        PrinterManager.communicator4.connect();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(PrinterManager.communicator4.readResponse());

        PrinterManager.printer4.setCollectSensorData(true);
    }
    @FXML
    void plus1(ActionEvent event) {
        menuPrinter1.setVisible(true);
        setPrinter1.setVisible(false);
    }

    @FXML
    void plus2(ActionEvent event) {
        menuPrinter2.setVisible(true);
        setPrinter2.setVisible(false);
    }

    @FXML
    void plus3(ActionEvent event) {
        menuPrinter3.setVisible(true);
        setPrinter3.setVisible(false);
    }

    @FXML
    void plus4(ActionEvent event) {
        menuPrinter4.setVisible(true);
        setPrinter4.setVisible(false);
    }

    @FXML
    void switchToFile() throws IOException {
        App.setSceneRoot("file");
    }

    @FXML
    void switchToSetting() throws IOException {
        App.setSceneRoot("setting");
    } 
}



