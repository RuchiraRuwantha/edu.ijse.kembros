/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.kembrose.control;

import edu.ijse.kembrose.db.DBConnection;
import edu.ijse.kembrose.model.OrderDetailsModel;
import edu.ijse.kembrose.model.OrderDetailsModel2;
import edu.ijse.kembrose.view.Orderform;
import edu.ijse.kembrose.model.OrderModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ruchira
 */
        public class OrderController {

    public static boolean addOrders(OrderModel ordermodel) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO orderform VALUES(?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, ordermodel.getOrderId());
        preparedStatement.setObject(2, ordermodel.getTableNo());
        preparedStatement.setObject(3, ordermodel.getContactNo());
        preparedStatement.setObject(4, ordermodel.getDate());
        preparedStatement.setObject(5, ordermodel.getTime());
        preparedStatement.setObject(6, ordermodel.getRequestedTime());
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;

    }

    public static OrderModel searchOrder(String orderId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from Orderform where orderId='" + orderId + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet resultSet = stm.executeQuery(sql);
        while (resultSet.next()) {
            OrderModel order = new OrderModel(resultSet.getString("orderId"), resultSet.getInt("tableNo"), resultSet.getString("contactNo"), resultSet.getString("date"), resultSet.getString("time"), resultSet.getString("requestedTime"));
            return order;
        }
        return null;
    }

    public static boolean addOrderDetail(ArrayList<OrderDetailsModel> orderDetailList) throws ClassNotFoundException, SQLException {
        int res = 0;
        for (OrderDetailsModel orderDetail : orderDetailList) {
            String query = "insert into OrderDetails values(?, ?, ?, ?, ?)";
            Connection connection = DBConnection.getDBConnection().getConnection();
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            prepareStatement.setObject(1, orderDetail.getOrderId());
            prepareStatement.setObject(2, orderDetail.getItemId());
            prepareStatement.setObject(3, orderDetail.getQuantity());
            prepareStatement.setObject(4, orderDetail.getTotalAmount());
            prepareStatement.setObject(5, orderDetail.getStatus());
            res += prepareStatement.executeUpdate();
        }
        if (orderDetailList.size() == res) {
            return true;
        }
        return false;
    }

    public static ArrayList<OrderDetailsModel2> searchOrderDetails(String orderId) throws ClassNotFoundException, SQLException {
        String sql = "select i.itemName,i.itemSize,i.price,od.totalAmount,od.quantity,od.status from orderdetails od,item i,orderform o where o.orderId=od.orderId and od.itemId=i.itemId and o.orderId='" + orderId + "'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet rst = statement.executeQuery(sql);
        ArrayList<OrderDetailsModel2> arrayList = new ArrayList<>();
        while (rst.next()) {
            OrderDetailsModel2 detailsModel2 = new OrderDetailsModel2(rst.getString("itemName"), rst.getString("itemSize"), rst.getDouble("price"), rst.getDouble("totalAmount"), rst.getInt("quantity"), rst.getString("status"));
            arrayList.add(detailsModel2);
        }
        return arrayList;
    }

    public static boolean updateOrders(OrderModel ordermodel) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE orderform set tableNo=?, contactNo=?, date=?, time=?, requestedTime=? where orderId=? ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1, ordermodel.getTableNo());
        preparedStatement.setObject(2, ordermodel.getContactNo());
        preparedStatement.setObject(3, ordermodel.getDate());
        preparedStatement.setObject(4, ordermodel.getTime());
        preparedStatement.setObject(5, ordermodel.getRequestedTime());
        preparedStatement.setObject(6, ordermodel.getOrderId());
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;
    }

    public static boolean updateOrderDetails(OrderDetailsModel model2) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE orderDetails set quantity=?, totalAmount=?, status=? where orderId=? and itemId=? ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1, model2.getQuantity());
        preparedStatement.setObject(2, model2.getTotalAmount());
        preparedStatement.setObject(3, model2.getStatus());
        preparedStatement.setObject(4, model2.getOrderId());
        preparedStatement.setObject(5, model2.getItemId());
        int resultSet = preparedStatement.executeUpdate();

        return resultSet > 0;
    }

}
/*
 public static boolean AddCustomer(Customer customer) throws ClassNotFoundException,SQLException{
        String query ="INSERT INTO Customer VALUES(?,?,?,?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setObject(1, customer.getCust_Id());
        preparedStatement.setObject(2, customer.getName());
        preparedStatement.setObject(3, customer.getAddress());
        preparedStatement.setObject(4, customer.getNic());
        preparedStatement.setObject(5, customer.getMobile_No());
        preparedStatement.setObject(6, customer.getHome_No());
        preparedStatement.setObject(7, customer.getEmail());
        int resultSet = preparedStatement.executeUpdate();
        return resultSet>0;
    }
*/
