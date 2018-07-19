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
public class ItemModel {
    private String itemId;
    private String iCatId;
    private String name;
    private double price;
    private String size;
    private int personCount;

    public ItemModel(String itemId, String iCatId, String name, double price, String size, int personCount) {
        this.itemId = itemId;
        this.iCatId = iCatId;
        this.name = name;
        this.price = price;
        this.size = size;
        this.personCount = personCount;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the personCount
     */
    public int getPersonCount() {
        return personCount;
    }

    /**
     * @param personCount the personCount to set
     */
    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }
    
    
}
