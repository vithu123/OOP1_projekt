package com.example;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;



/* 
JavaFX App
 
*/
public class App extends Application {

    private static Scene scene;

    public static void main(String[] args) {
        launch();  
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("printer"), 600, 600);
        stage.setTitle("3d Drucker");
        stage.setScene(scene);
        stage.show();

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10), event -> collectSensorData()));
        timeline.setCycleCount(Timeline.INDEFINITE); // Unbegrenzte Wiederholung
        timeline.play();


    }




    static void setSceneRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
    private void collectSensorData() {
      float finalNozzleTemp;
      float finalBedTemp;
      float final_X;
      float final_Y;
      float final_Z;
        if(PrinterManager.printer1.getCollectSensorData()){

          PrinterManager.communicator1.sendCommand("M105\n");
          try {
            Thread.sleep(50);
          } 
          catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          String input = PrinterManager.communicator1.readResponse();
          String[] parts = input.split(" ");
          for(String part : parts){
            if(part.startsWith("T:")){
              String[] tempParts = part.split("T:");
              PrinterManager.printer1.setNozzelTemp(Float.parseFloat(tempParts[1]));
              System.out.println(PrinterManager.printer1.getNozzelTemp());  
            }
            if(part.startsWith("B:")){
              String[] bedParts = part.split("B:");
              PrinterManager.printer1.setBedTemp(Float.parseFloat(bedParts[1]));
              System.out.println(PrinterManager.printer1.getBedTemp());
            }       
          }
          finalNozzleTemp = PrinterManager.printer1.getNozzelTemp();
          finalBedTemp = PrinterManager.printer1.getBedTemp();
          PrinterController.setStatic_nozzTemp_1(String.format("%.0f",finalNozzleTemp));
          PrinterController.setStatic_bedTemp_1(String.format("%.0f",finalBedTemp));
          PrinterManager.communicator1.sendCommand("M114\n");
          try {
            Thread.sleep(50);
          } 
          catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          input = PrinterManager.communicator1.readResponse();
          parts = input.split(" ");
          for(String part : parts){
            if(part.startsWith("X:")){
              String[] posX = part.split("X:");
              PrinterManager.printer1.setPosition(Float.parseFloat(posX[1]),0);
              System.out.println(PrinterManager.printer1.getPosition(0));
            }
            if(part.startsWith("Y:")){
              String[] posY = part.split("Y:");
              PrinterManager.printer1.setPosition(Float.parseFloat(posY[1]),1);
              System.out.println(PrinterManager.printer1.getPosition(1)); 
            }
            if(part.startsWith("Z:")){
              String[] posZ = part.split("Z:");
              PrinterManager.printer1.setPosition(Float.parseFloat(posZ[1]),2);
              System.out.println(PrinterManager.printer1.getPosition(2)); 
            }
            if(part.startsWith("Count")){
              break;
            }
            final_X = PrinterManager.printer1.getPosition(0);
            final_Y = PrinterManager.printer1.getPosition(1);
            final_Z = PrinterManager.printer1.getPosition(2);
            PrinterController.setStatic_X_1(String.format("%.0f",final_X));
            PrinterController.setStatic_Y_1(String.format("%.0f",final_Y));
            PrinterController.setStatic_Z_1(String.format("%.0f",final_Z));

          }
          PrinterManager.communicator1.sendCommand("M27\n");
          try {
            Thread.sleep(50);
          } 
          catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          input = PrinterManager.communicator1.readResponse();
          parts = input.split(" ");
          if(input.startsWith("Not")){
            PrinterController.setStatic_status_1("-");
            System.out.println("-");
          }
          if(input.startsWith("SD")){
            PrinterController.setStatic_status_1(parts[3]);
            System.out.println(parts[3]);
          }
      } 
      if(PrinterManager.printer2.getCollectSensorData()){

        PrinterManager.communicator2.sendCommand("M105\n");
        try {
          Thread.sleep(50);
        } 
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        String input = PrinterManager.communicator2.readResponse();
        String[] parts = input.split(" ");
        for(String part : parts){
          if(part.startsWith("T:")){
            String[] tempParts = part.split("T:");
            PrinterManager.printer2.setNozzelTemp(Float.parseFloat(tempParts[1]));
            System.out.println(PrinterManager.printer2.getNozzelTemp());  
          }
          if(part.startsWith("B:")){
            String[] bedParts = part.split("B:");
            PrinterManager.printer2.setBedTemp(Float.parseFloat(bedParts[1]));
            System.out.println(PrinterManager.printer2.getBedTemp());
          }       
        }
        finalNozzleTemp = PrinterManager.printer2.getNozzelTemp();
        finalBedTemp = PrinterManager.printer2.getBedTemp();
        PrinterController.setStatic_nozzTemp_2(String.format("%.0f",finalNozzleTemp));
        PrinterController.setStatic_bedTemp_2(String.format("%.0f",finalBedTemp));
        PrinterManager.communicator2.sendCommand("M114\n");
        try {
          Thread.sleep(50);
        } 
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator2.readResponse();
        parts = input.split(" ");
        for(String part : parts){
          if(part.startsWith("X:")){
            String[] posX = part.split("X:");
            PrinterManager.printer2.setPosition(Float.parseFloat(posX[1]),0);
            System.out.println(PrinterManager.printer2.getPosition(0));
          }
          if(part.startsWith("Y:")){
            String[] posY = part.split("Y:");
            PrinterManager.printer2.setPosition(Float.parseFloat(posY[1]),1);
            System.out.println(PrinterManager.printer2.getPosition(1)); 
          }
          if(part.startsWith("Z:")){
            String[] posZ = part.split("Z:");
            PrinterManager.printer2.setPosition(Float.parseFloat(posZ[1]),2);
            System.out.println(PrinterManager.printer2.getPosition(2)); 
          }
          if(part.startsWith("Count")){
            break;
          }
          final_X = PrinterManager.printer2.getPosition(0);
          final_Y = PrinterManager.printer2.getPosition(1);
          final_Z = PrinterManager.printer2.getPosition(2);
          PrinterController.setStatic_X_2(String.format("%.0f",final_X));
          PrinterController.setStatic_Y_2(String.format("%.0f",final_Y));
          PrinterController.setStatic_Z_2(String.format("%.0f",final_Z));
      
        }
        PrinterManager.communicator2.sendCommand("M27\n");
        try {
          Thread.sleep(50);
        } 
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator2.readResponse();
        parts = input.split(" ");
        if(input.startsWith("Not")){
          PrinterController.setStatic_status_2("-");
          System.out.println("-");
        }
        if(input.startsWith("SD")){
          PrinterController.setStatic_status_2(parts[3]);
          System.out.println(parts[3]);
        }
      } 
      if(PrinterManager.printer3.getCollectSensorData()){

        PrinterManager.communicator3.sendCommand("M105\n");
        try {
          Thread.sleep(50);
        } 
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        String input = PrinterManager.communicator3.readResponse();
        String[] parts = input.split(" ");
        for(String part : parts){
          if(part.startsWith("T:")){
            String[] tempParts = part.split("T:");
            PrinterManager.printer3.setNozzelTemp(Float.parseFloat(tempParts[1]));
            System.out.println(PrinterManager.printer3.getNozzelTemp());  
          }
          if(part.startsWith("B:")){
            String[] bedParts = part.split("B:");
            PrinterManager.printer3.setBedTemp(Float.parseFloat(bedParts[1]));
            System.out.println(PrinterManager.printer3.getBedTemp());
          }       
        }
        finalNozzleTemp = PrinterManager.printer3.getNozzelTemp();
        finalBedTemp = PrinterManager.printer3.getBedTemp();
        PrinterController.setStatic_nozzTemp_3(String.format("%.0f",finalNozzleTemp));
        PrinterController.setStatic_bedTemp_3(String.format("%.0f",finalBedTemp));
        PrinterManager.communicator3.sendCommand("M114\n");
        try {
          Thread.sleep(50);
        } 
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator3.readResponse();
        parts = input.split(" ");
        for(String part : parts){
          if(part.startsWith("X:")){
            String[] posX = part.split("X:");
            PrinterManager.printer3.setPosition(Float.parseFloat(posX[1]),0);
            System.out.println(PrinterManager.printer3.getPosition(0));
          }
          if(part.startsWith("Y:")){
            String[] posY = part.split("Y:");
            PrinterManager.printer3.setPosition(Float.parseFloat(posY[1]),1);
            System.out.println(PrinterManager.printer3.getPosition(1)); 
          }
          if(part.startsWith("Z:")){
            String[] posZ = part.split("Z:");
            PrinterManager.printer3.setPosition(Float.parseFloat(posZ[1]),2);
            System.out.println(PrinterManager.printer3.getPosition(2)); 
          }
          if(part.startsWith("Count")){
            break;
          }
          final_X = PrinterManager.printer3.getPosition(0);
          final_Y = PrinterManager.printer3.getPosition(1);
          final_Z = PrinterManager.printer3.getPosition(2);
          PrinterController.setStatic_X_3(String.format("%.0f",final_X));
          PrinterController.setStatic_Y_3(String.format("%.0f",final_Y));
          PrinterController.setStatic_Z_3(String.format("%.0f",final_Z));
      
        }
        PrinterManager.communicator3.sendCommand("M27\n");
        try {
          Thread.sleep(50);
        } 
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator3.readResponse();
        parts = input.split(" ");
        if(input.startsWith("Not")){
          PrinterController.setStatic_status_3("-");
          System.out.println("-");
        }
        if(input.startsWith("SD")){
          PrinterController.setStatic_status_3(parts[3]);
          System.out.println(parts[3]);
        }
      }
      if (PrinterManager.printer3.getCollectSensorData()) {

        PrinterManager.communicator3.sendCommand("M105\n");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String input = PrinterManager.communicator3.readResponse();
        String[] parts = input.split(" ");
        for (String part : parts) {
            if (part.startsWith("T:")) {
                String[] tempParts = part.split("T:");
                PrinterManager.printer3.setNozzelTemp(Float.parseFloat(tempParts[1]));
                System.out.println(PrinterManager.printer3.getNozzelTemp());
            }
            if (part.startsWith("B:")) {
                String[] bedParts = part.split("B:");
                PrinterManager.printer3.setBedTemp(Float.parseFloat(bedParts[1]));
                System.out.println(PrinterManager.printer3.getBedTemp());
            }
        }
        finalNozzleTemp = PrinterManager.printer3.getNozzelTemp();
        finalBedTemp = PrinterManager.printer3.getBedTemp();
        PrinterController.setStatic_nozzTemp_3(String.format("%.0f", finalNozzleTemp));
        PrinterController.setStatic_bedTemp_3(String.format("%.0f", finalBedTemp));
        PrinterManager.communicator3.sendCommand("M114\n");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator3.readResponse();
        parts = input.split(" ");
        for (String part : parts) {
            if (part.startsWith("X:")) {
                String[] posX = part.split("X:");
                PrinterManager.printer3.setPosition(Float.parseFloat(posX[1]), 0);
                System.out.println(PrinterManager.printer3.getPosition(0));
            }
            if (part.startsWith("Y:")) {
                String[] posY = part.split("Y:");
                PrinterManager.printer3.setPosition(Float.parseFloat(posY[1]), 1);
                System.out.println(PrinterManager.printer3.getPosition(1));
            }
            if (part.startsWith("Z:")) {
                String[] posZ = part.split("Z:");
                PrinterManager.printer3.setPosition(Float.parseFloat(posZ[1]), 2);
                System.out.println(PrinterManager.printer3.getPosition(2));
            }
            if (part.startsWith("Count")) {
                break;
            }
            final_X = PrinterManager.printer3.getPosition(0);
            final_Y = PrinterManager.printer3.getPosition(1);
            final_Z = PrinterManager.printer3.getPosition(2);
            PrinterController.setStatic_X_3(String.format("%.0f", final_X));
            PrinterController.setStatic_Y_3(String.format("%.0f", final_Y));
            PrinterController.setStatic_Z_3(String.format("%.0f", final_Z));
        }
        PrinterManager.communicator3.sendCommand("M27\n");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator3.readResponse();
        parts = input.split(" ");
        if (input.startsWith("Not")) {
            PrinterController.setStatic_status_3("-");
            System.out.println("-");
        }
        if (input.startsWith("SD")) {
            PrinterController.setStatic_status_3(parts[3]);
            System.out.println(parts[3]);
        }
      }
      if (PrinterManager.printer4.getCollectSensorData()) {

        PrinterManager.communicator4.sendCommand("M105\n");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String input = PrinterManager.communicator4.readResponse();
        String[] parts = input.split(" ");
        for (String part : parts) {
            if (part.startsWith("T:")) {
                String[] tempParts = part.split("T:");
                PrinterManager.printer4.setNozzelTemp(Float.parseFloat(tempParts[1]));
                System.out.println(PrinterManager.printer4.getNozzelTemp());
            }
            if (part.startsWith("B:")) {
                String[] bedParts = part.split("B:");
                PrinterManager.printer4.setBedTemp(Float.parseFloat(bedParts[1]));
                System.out.println(PrinterManager.printer4.getBedTemp());
            }
        }
        finalNozzleTemp = PrinterManager.printer4.getNozzelTemp();
        finalBedTemp = PrinterManager.printer4.getBedTemp();
        PrinterController.setStatic_nozzTemp_4(String.format("%.0f", finalNozzleTemp));
        PrinterController.setStatic_bedTemp_4(String.format("%.0f", finalBedTemp));
        PrinterManager.communicator4.sendCommand("M114\n");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator4.readResponse();
        parts = input.split(" ");
        for (String part : parts) {
            if (part.startsWith("X:")) {
                String[] posX = part.split("X:");
                PrinterManager.printer4.setPosition(Float.parseFloat(posX[1]), 0);
                System.out.println(PrinterManager.printer4.getPosition(0));
            }
            if (part.startsWith("Y:")) {
                String[] posY = part.split("Y:");
                PrinterManager.printer4.setPosition(Float.parseFloat(posY[1]), 1);
                System.out.println(PrinterManager.printer4.getPosition(1));
            }
            if (part.startsWith("Z:")) {
                String[] posZ = part.split("Z:");
                PrinterManager.printer4.setPosition(Float.parseFloat(posZ[1]), 2);
                System.out.println(PrinterManager.printer4.getPosition(2));
            }
            if (part.startsWith("Count")) {
                break;
            }
            final_X = PrinterManager.printer4.getPosition(0);
            final_Y = PrinterManager.printer4.getPosition(1);
            final_Z = PrinterManager.printer4.getPosition(2);
            PrinterController.setStatic_X_4(String.format("%.0f", final_X));
            PrinterController.setStatic_Y_4(String.format("%.0f", final_Y));
            PrinterController.setStatic_Z_4(String.format("%.0f", final_Z));
        }
        PrinterManager.communicator4.sendCommand("M27\n");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        input = PrinterManager.communicator4.readResponse();
        parts = input.split(" ");
        if (input.startsWith("Not")) {
            PrinterController.setStatic_status_4("-");
            System.out.println("-");
        }
        if (input.startsWith("SD")) {
            PrinterController.setStatic_status_4(parts[3]);
            System.out.println(parts[3]);
        }
      }

    }

}