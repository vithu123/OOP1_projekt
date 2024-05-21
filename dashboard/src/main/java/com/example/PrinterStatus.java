package com.example;

public class PrinterStatus extends PrintJob{
    private boolean isPrinting;
    private String CurrentJob;
   
   
    public boolean isPrinting() {
        return isPrinting;
    }
    public void setPrinting(boolean isPrinting) {
        this.isPrinting = isPrinting;
    }
    public String getCurrentJob() {
        return CurrentJob;
    }
    public void setCurrentJob(String currentJob) {
        CurrentJob = currentJob;
    }
    
    
}
