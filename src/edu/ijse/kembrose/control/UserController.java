/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.kembrose.control;

import edu.ijse.kembrose.db.DBConnection;
import edu.ijse.kembrose.model.UserDetailsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ruchira
 */
public class UserController {
    public static boolean addUser(UserDetailsModel userDetailsModel)throws SQLException,ClassNotFoundException {
		String sql="Insert into userDetails values(?,?,?,?,?)";	
		Connection conn=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=conn.prepareStatement(sql);
		stm.setObject(1,userDetailsModel.getUserId());
		stm.setObject(2,userDetailsModel.getPriorityId());
		stm.setObject(3,userDetailsModel.getUserName());
		stm.setObject(4,userDetailsModel.getPassword());
                stm.setObject(5,userDetailsModel.getEmail());
		int res=stm.executeUpdate();
		return res>0;
	}
     public static boolean deleteUser(String userId)throws SQLException , ClassNotFoundException{
        String query="DELETE FROM userDetails WHERE userId =?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setObject(1, userId);
        int resultSet=preparedStatement.executeUpdate();
        return resultSet>0;
    }
     
     public static UserDetailsModel logInUser(String userName, String password) throws ClassNotFoundException, SQLException {
        String sql = "select * from userdetails where userName = ? and password = ? ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, userName);
        stm.setObject(2, password);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new UserDetailsModel(rst.getString("UserId"), rst.getString("priorityId"), rst.getString("userName"), rst.getString("password"), rst.getString("email"));
        }
        return null;
    }
}

