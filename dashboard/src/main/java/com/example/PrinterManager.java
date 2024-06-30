package com.example;

public class PrinterManager {
    public static Printer printer1;
    public static Printer printer2;
    public static Printer printer3;
    public static Printer printer4;
    public static USBCommunicator communicator;
    public static USBCommunicator communicator1;
    public static USBCommunicator communicator2;
    public static USBCommunicator communicator3;
    public static USBCommunicator communicator4;
 
    public static void initialize() {

        printer1 = new Printer();
        printer1.setPrintername("printer1");
        printer1.setCollectSensorData(false);


        printer2 = new Printer();
        printer2.setPrintername("printer2");
        printer2.setCollectSensorData(false);

        printer3 = new Printer();
        printer3.setPrintername("printer3");
        printer3.setCollectSensorData(false);


        printer4 = new Printer();
        printer4.setPrintername("printer4");
        printer4.setCollectSensorData(false);

        
        communicator = new USBCommunicator("COM3");
        communicator.setPrinterNameProt("printer");
        
        communicator1 = new USBCommunicator("COM3");
        communicator1.setPrinterNameProt("printer1");

        
        
        communicator2 = new USBCommunicator("COM3");
        communicator2.setPrinterNameProt("printer2");


        communicator3 = new USBCommunicator("COM3");
        communicator3.setPrinterNameProt("printer3");


        communicator4 = new USBCommunicator("COM3");
        communicator4.setPrinterNameProt("printer4");
         
    }


}
