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
public class UserDetailsModel {
    private String userId;
    private String priorityId;
    private String userName;
    private String password;
    private String email;

    public UserDetailsModel(String userId, String priorityId, String userName, String password, String email) {
        this.userId = userId;
        this.priorityId = priorityId;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
