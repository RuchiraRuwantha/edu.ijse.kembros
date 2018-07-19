/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.kembrose.control;

import edu.ijse.kembrose.db.DBConnection;
import edu.ijse.kembrose.model.ItemCatagoryModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ruchira
 */
public class ItemCatagoryController {
    
    public static ItemCatagoryModel[] getAllItemCatagoryTypes() throws  ClassNotFoundException, SQLException {
        String sql = "select * from itemcatagory ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
        }
        resultSet.beforeFirst();
        ItemCatagoryModel[] itemCatagoryType = new ItemCatagoryModel[rowCount];
        for (int i = 0; resultSet.next(); i++) {
            itemCatagoryType[i] = new ItemCatagoryModel(resultSet.getString(1), resultSet.getString(2));
        }
                return null;
    
    }
    public static String searchItemCatagoryType(String icId) throws ClassNotFoundException, SQLException {
        String sql = "select catagoryType from itemcatagory WHERE iCatId='" + icId + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
}
