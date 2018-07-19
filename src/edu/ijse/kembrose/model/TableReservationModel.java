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
public class TableReservationModel {
    private String tableResId;
    private String name;
    private String contactNo;

    public TableReservationModel(String tableResId, String name, String contactNo) {
        this.tableResId = tableResId;
        this.name = name;
        this.contactNo = contactNo;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
    
}
