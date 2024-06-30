package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileContoller {

    File selectedFile;
    @FXML
    private TextArea fileRead_1;

    @FXML
    private TextArea fileRead_2;

    @FXML
    private TextArea fileRead_3;

    @FXML
    private TextArea fileRead_4;

    @FXML
    void back_1(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void back_2(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void back_3(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void back_4(ActionEvent event) {
        try {
            App.setSceneRoot("printer");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    void fileChoos_1(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Datei auswählen");

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            System.out.println("Ausgewählte Datei: " + selectedFile.getAbsolutePath());
        }
    }

    @FXML
    void fileChoos_2(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Datei auswählen");

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            System.out.println("Ausgewählte Datei: " + selectedFile.getAbsolutePath());
        }
    }

    @FXML
    void fileChoos_3(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Datei auswählen");

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            System.out.println("Ausgewählte Datei: " + selectedFile.getAbsolutePath());
        }
    }

    @FXML
    void fileChoos_4(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Datei auswählen");

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            System.out.println("Ausgewählte Datei: " + selectedFile.getAbsolutePath());
        }
    }

    @FXML
    void load_1(ActionEvent event) {
        System.out.println(selectedFile.getName());
        PrinterManager.communicator1.sendCommand("M28 "+selectedFile.getName()+"\n");
        try {
            PrinterManager.communicator1.sendCommand(Files.readString(selectedFile.toPath()));
            PrinterManager.communicator1.sendCommand("M29\n");
        }catch (IOException e){
            PrinterManager.communicator1.sendCommand("M29\n");
        }
    }

    @FXML
    void load_2(ActionEvent event) {
        System.out.println(selectedFile.getName());
        PrinterManager.communicator2.sendCommand("M28 "+selectedFile.getName()+"\n");
        try {
            PrinterManager.communicator2.sendCommand(Files.readString(selectedFile.toPath()));
            PrinterManager.communicator2.sendCommand("M29\n");
        }catch (IOException e){
            PrinterManager.communicator2.sendCommand("M29\n");
        }
    }

    @FXML
    void load_3(ActionEvent event) {
        System.out.println(selectedFile.getName());
        PrinterManager.communicator3.sendCommand("M28 "+selectedFile.getName()+"\n");
        try {
            PrinterManager.communicator3.sendCommand(Files.readString(selectedFile.toPath()));
            PrinterManager.communicator3.sendCommand("M29\n");
        }catch (IOException e){
            PrinterManager.communicator3.sendCommand("M29\n");
        }
    }

    @FXML
    void load_4(ActionEvent event) {
        System.out.println(selectedFile.getName());
        PrinterManager.communicator4.sendCommand("M28 "+selectedFile.getName()+"\n");
        try {
            PrinterManager.communicator4.sendCommand(Files.readString(selectedFile.toPath()));
            PrinterManager.communicator4.sendCommand("M29\n");
        }catch (IOException e){
            PrinterManager.communicator4.sendCommand("M29\n");
        }
    }

    @FXML
    void read_1(ActionEvent event) {
        PrinterManager.communicator1.sendCommand("M20\n");
        PrinterManager.communicator1.sendCommand("M105\n");
          try {
            Thread.sleep(50);
          } 
          catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          String SD_list = PrinterManager.communicator1.readResponse();
          System.out.println(SD_list);
          fileRead_1.setText(SD_list);

    }

    @FXML
    void read_2(ActionEvent event) {
        PrinterManager.communicator2.sendCommand("M20\n");
        PrinterManager.communicator2.sendCommand("M105\n");
          try {
            Thread.sleep(50);
          } 
          catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          String SD_list = PrinterManager.communicator2.readResponse();
          System.out.println(SD_list);
          fileRead_2.setText(SD_list);
    }

    @FXML
    void read_3(ActionEvent event) {
        PrinterManager.communicator3.sendCommand("M20\n");
        PrinterManager.communicator3.sendCommand("M105\n");
          try {
            Thread.sleep(50);
          } 
          catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          String SD_list = PrinterManager.communicator3.readResponse();
          System.out.println(SD_list);
          fileRead_3.setText(SD_list);
    }

    @FXML
    void read_4(ActionEvent event) {
        PrinterManager.communicator4.sendCommand("M20\n");
        PrinterManager.communicator4.sendCommand("M105\n");
          try {
            Thread.sleep(50);
          } 
          catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          String SD_list = PrinterManager.communicator4.readResponse();
          System.out.println(SD_list);
          fileRead_4.setText(SD_list);
    }

}