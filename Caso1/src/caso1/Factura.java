/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author LABORATORIO 04
 */
public class Factura {
    private String client;
    private String id;
    private int facNum;
    private double facAmount;
    private int month;
    private int year;
    private int pending;

    
    
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFacNum() {
        return facNum;
    }

    public void setFacNum(int facNum) {
        this.facNum = facNum;
    }

    public double getFacAmount() {
        return facAmount;
    }

    public void setFacAmount(double facAmount) {
        this.facAmount = facAmount;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }
    
    
}
