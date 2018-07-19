/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.kembrose.control;

import edu.ijse.kembrose.db.DBConnection;
import edu.ijse.kembrose.model.ItemCatagoryModel;
import edu.ijse.kembrose.model.ItemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ruchira
 */
public class ItemController {

    public static ItemModel searchItem(String itemName) throws ClassNotFoundException, SQLException {
        String sql = "select * from item where itemName = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, itemName);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new ItemModel(rst.getString("itemId"), rst.getString("iCatId"), rst.getString("itemName"), rst.getDouble("price"), rst.getString("itemSize"), rst.getInt("personCount"));
        }
        return null;
    }

    public static boolean addItem(ItemModel item) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, item.getItemId());
        preparedStatement.setObject(2, item.getiCatId());
        preparedStatement.setObject(3, item.getName());
        preparedStatement.setObject(4, item.getPrice());
        preparedStatement.setObject(5, item.getSize());
        preparedStatement.setObject(6, item.getPersonCount());
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;

    }

    public static boolean updateItem(ItemModel itemModel) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE item set itemId=?, iCatId=?, itemname=?, price=?, itemsize=?, personcount=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, itemModel.getItemId());
        preparedStatement.setObject(2, itemModel.getiCatId());
        preparedStatement.setObject(3, itemModel.getName());
        preparedStatement.setObject(4, itemModel.getPrice());
        preparedStatement.setObject(5, itemModel.getSize());
        preparedStatement.setObject(6, itemModel.getPersonCount());
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;
    }

    public static boolean deleteItem(String itemId) throws SQLException, ClassNotFoundException {

        String sql = "DELETE FROM item WHERE itemId=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, itemId);
        int resultSet = preparedStatement.executeUpdate();
        return resultSet > 0;
    }

    public static ItemCatagoryModel[] getAllICId() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM itemcatagory ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
        }
        resultSet.beforeFirst();
        ItemCatagoryModel[] icid = new ItemCatagoryModel[rowCount];
        for (int i = 0; resultSet.next(); i++) {
            icid[i] = new ItemCatagoryModel(resultSet.getString("iCatId"), resultSet.getString("catagoryType"));
        }
        return icid;
    }

    public static ItemModel[] getAllItemId() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM item ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
        }
        resultSet.beforeFirst();
        ItemModel[] item = new ItemModel[rowCount];
        for (int i = 0; resultSet.next(); i++) {
            item[i] = new ItemModel(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4), resultSet.getString(5), resultSet.getInt(6));
        }
        return item;
    }

    public static String searchprice(String itemName, String size) throws ClassNotFoundException, SQLException {
        String sql = "select price from item WHERE itemName='" + itemName + "' and itemSize='" + size + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
}
