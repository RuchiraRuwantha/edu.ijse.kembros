/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.kembrose.other;

import edu.ijse.kembrose.control.IDController;
import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author Ruchira
 */
public class IdGenerator {
   public static String getNewId(String tableName,String columName ,String prefix)throws ClassNotFoundException,SQLException{
       String lastId = IDController.getLastId(tableName, columName);
        if (lastId!=null) {
            int id =Integer.parseInt(lastId.split(prefix)[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(3);
            numberFormat.setGroupingUsed(false);
            String formatedId=numberFormat.format(id);
            return prefix + formatedId;
        }else{
            return prefix +"001";
        }
   }
}

