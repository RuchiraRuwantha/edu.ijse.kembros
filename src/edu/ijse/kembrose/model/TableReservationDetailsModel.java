/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.kembrose.model;

/**
 *
 * @author Ruchira
 */
public class TableReservationDetailsModel {
    private String tableResId;
    private String tableId;
    private int noOfGuests;
    private String timeIn;
    private String timeOut;
    private String date;
    private String note;
    private double price;
    private double totalAmount; 
    private String status;

    public TableReservationDetailsModel(String tableResId, String tableId, int noOfGuests, String timeIn, String timeOut, String date, String note, double price, double totalAmount, String status) {
        this.tableResId = tableResId;
        this.tableId = tableId;
        this.noOfGuests = noOfGuests;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.date = date;
        this.note = note;
        this.price = price;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    /**
     * @return the tableResId
     */
    public String getTableResId() {
        return tableResId;
    }

    /**
     * @param tableResId the tableResId to set
     */
    public void setTableResId(String tableResId) {
        this.tableResId = tableResId;
    }

    /**
     * @return the tableId
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * @param tableId the tableId to set
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * @return the noOfGuests
     */
    public int getNoOfGuests() {
        return noOfGuests;
    }

    /**
     * @param noOfGuests the noOfGuests to set
     */
    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

    /**
     * @return the timeIn
     */
    public String getTimeIn() {
        return timeIn;
    }

    /**
     * @param timeIn the timeIn to set
     */
    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    /**
     * @return the timeOut
     */
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * @param timeOut the timeOut to set
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the totalAmount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
