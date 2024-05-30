package com.example;

public class  Printer extends PrinterStatus{
    private String printername;
    private float nozzelTemp;
    private float bedTemp;
    private float position[] = new float[3];
    public String getPrintername() {
        return printername;
    }
    public float getNozzelTemp() {
        return nozzelTemp;
    }
    public float getBedTemp() {
        return bedTemp;
    }
    public float[] getPosition() {
        return position;
    }
    public void setPrintername(String printername) {
        this.printername = printername;
    }
    public void setNozzelTemp(float nozzelTemp) {
        this.nozzelTemp = nozzelTemp;
    }
    public void setBedTemp(float bedTemp) {
        this.bedTemp = bedTemp;
    }
    public void setPosition(float[] position) {
        this.position = position;
    }
    
    




    
}
