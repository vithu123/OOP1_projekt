package com.example;

import java.io.IOException;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortEvent;

public class USBCommunicator {
    private SerialPort comPort;
    private String printerNamePort;
    public USBCommunicator() {
        comPort.setComPortParameters(115200, 8, SerialPort.ONE_STOP_BIT, SerialPort.NO_PARITY);
    }
     
    public USBCommunicator(String portDescriptor) {
        comPort = SerialPort.getCommPort(portDescriptor);
        comPort.setComPortParameters(115200, 8, SerialPort.ONE_STOP_BIT, SerialPort.NO_PARITY);
    }
    public void setComPort(String comPort) {
        this.comPort = SerialPort.getCommPort(comPort);
    }
    public void setPrinterNameProt(String printerNamePort) {
        this.printerNamePort = printerNamePort;
    }
    public void listAllComPorts() {
        SerialPort[] comPorts = SerialPort.getCommPorts();
        if (comPorts.length == 0) {
            System.out.println("No COM ports available.");
        } else {
            System.out.println("Available COM ports:");
            for (SerialPort comPort : comPorts) {
                System.out.println("Port: " + comPort.getSystemPortName() + " - " + comPort.getDescriptivePortName());
            }
        }
    }
    

    public boolean connect() {
        return comPort.openPort();
    }

    public void disconnect() {
        if (comPort != null) {
            comPort.closePort();
        }
    }

    public void sendCommand(String command) {
        if (comPort != null && comPort.isOpen()) {
            try {
                comPort.getOutputStream().write(command.getBytes());
                comPort.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("An error occurred while sending the command.");
            }
        }
    }
    

    public String readResponse() {
        String text = "";
        if (comPort != null && comPort.isOpen()) {
            for (int x = 0; x < 500; x++) {
                byte[] readBuffer = new byte[1024];
                int numRead = comPort.readBytes(readBuffer, readBuffer.length);
                text += new String(readBuffer, 0, numRead);
            }
        }
        return text;
    }


 
}