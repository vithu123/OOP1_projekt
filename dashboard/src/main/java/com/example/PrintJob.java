package com.example;

public class PrintJob {
    private String fileName;
    private int progress;
    private String stage;

    public PrintJob(String fileName) {
        this.fileName = fileName;
        this.progress = 0;
        this.stage = "Warten";
    }

    public String getFileName() {
        return fileName;
    }
    public int getProgress() {
        return progress;
    }
    public String getStage() {
        return stage;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setProgress(int progress) {
        this.progress = progress;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }    
}
