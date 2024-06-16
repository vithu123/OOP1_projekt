package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.fazecast.jSerialComm.SerialPort;

/* 
JavaFX App
 
*/
public class App extends Application {

    private static Scene scene;

    public static void main(String[] args) {
        /* 
        System.out.println("3D drucker Dashbord gestartet!");
        Druckerverwaltung  test = new  Druckerverwaltung();
        PrintJob file1 = new PrintJob("test1");
        test.addJob(file1);
        test.startNextJob();
        test.startNextJob();*/

        Printer printer1 = new Printer();
        printer1.setPrintername("printer1");
        Printer printer2 = new Printer();
        printer2.setPrintername("printer2");
        Printer printer3 = new Printer();
        printer3.setPrintername("printer3");
        Printer printer4 = new Printer();
        printer4.setPrintername("printer4");
        
        
        USBCommunicator communication1 = new USBCommunicator("COM5");
        communication1.listAllComPorts();
        communication1.connect();
        try {
            Thread.sleep(5000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        //
        

        
        
        communication1.sendCommand("M105\n");
        
        String test = communication1.readResponse();
        System.out.println("1 :"+test);
        String test2 = communication1.readResponse();
        System.out.println("2 :"+test2);
        try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        communication1.sendCommand("M114\n");
        try {
            Thread.sleep(10000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        test = communication1.readResponse();
        System.out.println("3 :"+test);
        communication1.sendCommand("G0 Z60\n");
        //communication1.disconnect();
        //communication1.sendCommand("G0 Z30");
       /* test = communication1.readResponse();
        
        communication1.sendCommand("M104");
        test = communication1.readResponse();
        test2 = communication1.readResponse();
        System.out.println("1 :"+test);
        System.out.println("2 :"+test2);
        communication1.disconnect();
        /*
        communication1.setPrinterNameProt("printer1");
        communication1.listAllComPorts();
        USBCommunicator communication2 = new USBCommunicator();
        communication2.setPrinterNameProt("printer2");
        USBCommunicator communication3 = new USBCommunicator();
        communication3.setPrinterNameProt("printer3");
        USBCommunicator communication4 = new USBCommunicator();
        communication4.setPrinterNameProt("printer4");*/
        communication1.sendCommand("G0 Z10\n");
        launch();
        
        
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("printer"), 640, 480);
        stage.setTitle("3d Drucker");
        stage.setScene(scene);
        stage.show();
    }

    static void setSceneRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
    

}