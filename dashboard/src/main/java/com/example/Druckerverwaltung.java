package com.example;

import java.util.ArrayList;
import java.util.List;

public class Druckerverwaltung {
    private List<PrintJob> jobs = new ArrayList<>();

    public void addJob(PrintJob job) {
        jobs.add(job);
    }
    public void startNextJob() {
        for (PrintJob job : jobs) {
            if (job.getStage().equals("Warten")) {
                job.setStage("Druckt");
                // Simuliere Druckfortschritt
                
                new Thread(() -> simulatePrinting(job)).start();
                break;
            }
        }

    }
    private void simulatePrinting(PrintJob job) {
        try {
            while (job.getProgress() < 100.0) {
                Thread.sleep(1000);
                job.setProgress(job.getProgress() + 10);
                System.out.println("Druckfortschritt von " + job.getFileName() + ": " + job.getProgress() + "%");
            }
            job.setStage("Fertig");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    
}
