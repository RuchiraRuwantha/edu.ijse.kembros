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
public class PriorityModel {
    private String priorityId;
    private String PriorityNo;

    public PriorityModel(String priorityId, String PriorityNo) {
        this.priorityId = priorityId;
        this.PriorityNo = PriorityNo;
    }

    /**
     * @return the priorityId
     */
    public String getPriorityId() {
        return priorityId;
    }

    /**
     * @param priorityId the priorityId to set
     */
    public void setPriorityId(String priorityId) {
        this.priorityId = priorityId;
    }

    /**
     * @return the PriorityNo
     */
    public String getPriorityNo() {
        return PriorityNo;
    }

    /**
     * @param PriorityNo the PriorityNo to set
     */
    public void setPriorityNo(String PriorityNo) {
        this.PriorityNo = PriorityNo;
    }
    
    
}
