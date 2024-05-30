package com.example;

public class PrinterStatus extends PrintJob {

    private boolean isPrinting;
    private String currentJob;

    public PrinterStatus() {
        super("kein job"); 
        this.isPrinting = false;
        this.currentJob = "Kein Job"; 
    }
    public boolean isPrinting() {
        return isPrinting;
    }

    public void setPrinting(boolean isPrinting) {
        this.isPrinting = isPrinting;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }
}