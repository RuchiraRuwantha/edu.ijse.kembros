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
public class ResTableModel {
    private String tableId;
    private int tableNo;
    private String location;
    private double price;
    private int noOfSeats;

    public ResTableModel(String tableId, int tableNo, String location, double price, int noOfSeats) {
        this.tableId = tableId;
        this.tableNo = tableNo;
        this.location = location;
        this.price = price;
        this.noOfSeats = noOfSeats;
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
     * @return the tableNo
     */
    public int getTableNo() {
        return tableNo;
    }

    /**
     * @param tableNo the tableNo to set
     */
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
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
     * @return the noOfSeats
     */
    public int getNoOfSeats() {
        return noOfSeats;
    }

    /**
     * @param noOfSeats the noOfSeats to set
     */
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
    
}
