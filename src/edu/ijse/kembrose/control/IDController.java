/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.kembrose.control;

import edu.ijse.kembrose.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ruchira
 */
public class IDController {
    public static String getLastId(String tableName , String columnName) throws ClassNotFoundException,SQLException{
        String query="SELECT "+columnName+" FROM "+tableName+" ORDER BY 1 DESC LIMIT 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement createStatement = connection.createStatement();
        ResultSet rst=createStatement.executeQuery(query);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
}