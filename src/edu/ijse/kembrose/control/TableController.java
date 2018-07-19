/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.kembrose.control;

import edu.ijse.kembrose.db.DBConnection;
import edu.ijse.kembrose.model.ItemModel;
import edu.ijse.kembrose.model.OrderDetailsModel;
import edu.ijse.kembrose.model.ResTableModel;
import edu.ijse.kembrose.model.ReservationDetailsModel;
import edu.ijse.kembrose.model.TableReservationDetailsModel;
import edu.ijse.kembrose.model.TableReservationModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ruchira
 */
    public class TableController {

    public static ResTableModel[] getAllTableId() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * from restable ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
        }
        resultSet.beforeFirst();
        ResTableModel[] tableNo = new ResTableModel[rowCount];
        for (int i = 0; resultSet.next(); i++) {
            tableNo[i] = new ResTableModel(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getDouble(4), resultSet.getInt(5));
        }

        return tableNo;
    }

    public static ResTableModel getResTableId(String tableId) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("select * from restable WHERE tableId='" + tableId + "'");
        while (rst.next()) {
            return new ResTableModel(rst.getString("tableId"), rst.getInt("tableNo"), rst.getString("location"), rst.getDouble("price"), rst.getInt("noOfSeats"));
        }
        return null;
    }

    public static String searchLocation(String tableId) throws ClassNotFoundException, SQLException {
        String sql = "select location from restable WHERE tableId='" + tableId + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    public static String searchPrice(String tableId) throws ClassNotFoundException, SQLException {
        String sql = "select price from restable WHERE tableId='" + tableId + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    public static String searchNoOfSeats(String tableId) throws ClassNotFoundException, SQLException {
        String sql = "select noOfSeats from restable WHERE tableId='" + tableId + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    public static TableReservationModel searchReservation(String name) throws ClassNotFoundException, SQLException {
        String sql = "select * from tablereservation where name like '" + name + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        while (rst.next()) {
            TableReservationModel table = new TableReservationModel(rst.getString("tableResId"), rst.getString("name"), rst.getString("contactNo"));
            return table;
        }
        return null;
    }

    public static ArrayList<TableReservationDetailsModel> searchReservationDetails(String name) throws ClassNotFoundException, SQLException {
        String sql = "select tr.tableResId,rd.tableId,rd.noOfGuests,rd.timeIn,rd.timeOut,rd.date,rd.note,rd.price,rd.totalAmount,rd.status from tablereservation tr,reservationdetails rd where tr.tableResId=rd.tableResId and tr.name='"+name+"'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        ArrayList<TableReservationDetailsModel> arrayList = new ArrayList<>();
        while (rst.next()) {
            TableReservationDetailsModel tableReservationDetails= new TableReservationDetailsModel(rst.getString("tableResId"), rst.getString("tableId"), rst.getInt("noOfGuests"), rst.getString("timeIn"), rst.getString("timeOut"), rst.getString("date"), rst.getString("note"), rst.getDouble("price"), rst.getDouble("totalAmount"), rst.getString("status"));
            arrayList.add(tableReservationDetails);
        }
        return arrayList;
    }

    public static boolean addTableReservation(TableReservationModel table) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tablereservation VALUES(?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, table.getTableResId());
        preparedStatement.setObject(2, table.getName());
        preparedStatement.setObject(3, table.getContactNo());
//        preparedStatement.setObject(4, table.getDate());
//        preparedStatement.setObject(5, table.getTimeIn());
//        preparedStatement.setObject(6, table.getTimeOut());
//        preparedStatement.setObject(7, table.getNoOfguests());
      //  preparedStatement.setObject(8, table.getResTableNo());
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;

    }

//    public static boolean addReservationDetails(ReservationDetailsModel table) throws ClassNotFoundException, SQLException {
//        String sql = "INSERT INTO reservationdetails VALUES(?,?,?,?)";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setObject(1, table.getTableResId());
//        preparedStatement.setObject(2, table.getOrderId());
//        preparedStatement.setObject(3, table.getTableId());
//        preparedStatement.setObject(4, table.getNote());
//        preparedStatement.setObject(5, table.getPrice());
//
//        int resultSet = preparedStatement.executeUpdate();
//
//        return resultSet > 0;
//
//    }

    public static boolean updateTableReservation(TableReservationModel table) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tablereservation set name=?, contactNo=? where tableResId=? " ;
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setObject(1, table.getName());
        preparedStatement.setObject(2, table.getContactNo());
        preparedStatement.setObject(3, table.getTableResId());
//        preparedStatement.setObject(4, table.getDate());
//        preparedStatement.setObject(5, table.getTimeIn());
//        preparedStatement.setObject(6, table.getTimeOut());
//        preparedStatement.setObject(7, table.getNoOfguests());
//        preparedStatement.setObject(8, table.getResTableNo());
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;
    }

    public static boolean updateReservationDetails(ReservationDetailsModel table) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE reservationdetails set tableId=?, note=?, price=?, totalAmount=?, noOfGuests=?, date=?, timeIn=?, timeOut=?, status=? where tableResId =?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, table.getTableId());
        preparedStatement.setObject(2, table.getNote());
        preparedStatement.setObject(3, table.getPrice());
        preparedStatement.setObject(4, table.getTotalAmount());
        preparedStatement.setObject(5, table.getNoOfGuests());
        preparedStatement.setObject(6, table.getTimeIn());
        preparedStatement.setObject(7, table.getTimeOut());
        preparedStatement.setObject(8, table.getDate());
        preparedStatement.setObject(9, table.getStatus());
        preparedStatement.setObject(10, table.getTableResId());
        
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;
    }

//    public static boolean deleteReservation(String tableId, String tableResId) throws SQLException, ClassNotFoundException {
//        String sql = "DELETE FROM reservationDetails WHERE tableId = '"+tableId+"' and tableresId = '"+tableResId+"'";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setObject(1, tableId);
//        preparedStatement.setObject(2, tableResId);
//        int resultSet = preparedStatement.executeUpdate();
//        return resultSet > 0;
//    }
    
     public static boolean addReservationDetails(ArrayList<ReservationDetailsModel> tableReservationList) throws ClassNotFoundException, SQLException {
        int res = 0;
        for (ReservationDetailsModel tableDetail : tableReservationList) {
            String query = "insert into reservationDetails values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection connection = DBConnection.getDBConnection().getConnection();
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            prepareStatement.setObject(1, tableDetail.getTableResId());
           // prepareStatement.setObject(2, tableDetail.getOrderId());
            prepareStatement.setObject(2, tableDetail.getTableId());
            prepareStatement.setObject(3, tableDetail.getNote());
            prepareStatement.setObject(4, tableDetail.getPrice());
            prepareStatement.setObject(5, tableDetail.getTotalAmount());
            prepareStatement.setObject(6, tableDetail.getNoOfGuests());
            prepareStatement.setObject(7, tableDetail.getDate());
            prepareStatement.setObject(8, tableDetail.getTimeIn());
            prepareStatement.setObject(9, tableDetail.getTimeOut());
            prepareStatement.setObject(10, tableDetail.getStatus());
            res += prepareStatement.executeUpdate();
        }
        if (tableReservationList.size() == res) {
            return true;
        }
        return false;
    }

//    public static ReservationDetailsModel getResDetails(String name) throws ClassNotFoundException, SQLException {
//        String sql = "select rd.note,rd.price,rd.orderId,rd.tableId,rd.tableResId from reservationdetails rd,tableReservation tr where tr.tableResId=rd.tableResId AND tr.name='" + name + "'";
//        Connection connection = DBConnection.getDBConnection().getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//        if (resultSet.next()) {
//            ReservationDetailsModel reservationDetailsModel = new ReservationDetailsModel(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getDouble(5));
//            return reservationDetailsModel;
//        }
//        return null;
//    }
      public static boolean addTables(ResTableModel resTableModel) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO resTable  VALUES(?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, resTableModel.getTableId());
        preparedStatement.setObject(2, resTableModel.getTableNo());
        preparedStatement.setObject(3, resTableModel.getLocation());
        preparedStatement.setObject(4, resTableModel.getPrice());
        preparedStatement.setObject(5, resTableModel.getNoOfSeats());
        
        int resultset = preparedStatement.executeUpdate();
        return resultset > 0;
    }
}
