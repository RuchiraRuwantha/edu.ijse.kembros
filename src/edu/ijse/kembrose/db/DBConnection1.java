/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.kembrose.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ruchira
 */
public class DBConnection1 {

    private final Connection connection;
    private static DBConnection1 dBConnection;

    private DBConnection1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant", "root", "123");
    }

    public static DBConnection1 getDBConnection() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection1();
        }
        return dBConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
