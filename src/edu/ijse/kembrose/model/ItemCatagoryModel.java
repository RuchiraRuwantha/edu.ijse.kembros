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
public class ItemCatagoryModel {
    private String iCatId;
    private String catType;

    public ItemCatagoryModel(String iCatId, String catType) {
        this.iCatId = iCatId;
        this.catType = catType;
    }

    /**
     * @return the iCatId
     */
    public String getiCatId() {
        return iCatId;
    }

    /**
     * @param iCatId the iCatId to set
     */
    public void setiCatId(String iCatId) {
        this.iCatId = iCatId;
    }

    /**
     * @return the catType
     */
    public String getCatType() {
        return catType;
    }

    /**
     * @param catType the catType to set
     */
    public void setCatType(String catType) {
        this.catType = catType;
    }
    
    
}
