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
public class OrderModel {
    private String orderId;
    private int tableNo;
    private String contactNo;
    private String date;
    private String time;
    private String requestedTime;

    public OrderModel(String orderId, int tableNo, String contactNo, String date, String time, String requestedTime) {
        this.orderId = orderId;
        this.tableNo = tableNo;
        this.contactNo = contactNo;
        this.date = date;
        this.time = time;
        this.requestedTime = requestedTime;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
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
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the requestedTime
     */
    public String getRequestedTime() {
        return requestedTime;
    }

    /**
     * @param requestedTime the requestedTime to set
     */
    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }
    
    
}
