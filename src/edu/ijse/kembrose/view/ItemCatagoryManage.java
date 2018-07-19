/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.kembrose.view;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import edu.ijse.kembrose.control.ItemCatagoryController;
import edu.ijse.kembrose.control.ItemController;
import edu.ijse.kembrose.model.ItemCatagoryModel;
import edu.ijse.kembrose.model.ItemModel;
import edu.ijse.kembrose.view.subview.ItemCatagoryManagePanel1;
import edu.ijse.kembrose.view.subview.ItemCatagoryManagePanel2;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruchira
 */


public class ItemCatagoryManage extends javax.swing.JFrame {
    
    double lprice;
    double mprice;
    double sprice;
    String size1;
    int personcount1;
    String size2;
    double price2;
    int personcount2;
    public void setData(double lprice, double mprice, double sprice, String size1, int personcount1) {
        this.lprice=lprice;
        this.mprice=mprice;
        this.sprice=sprice;
        this.size1=size1;
        this.personcount1=personcount1;
    
    }
    private ItemCatagoryModel[] icid;
  
    /**
     * Creates new form ItemCatagoryManage
     */
    public ItemCatagoryManage()  {
        initComponents();
        setTime();
        setDate();
        setLocationRelativeTo(null);
        loadICId();
    }
    private void loadICId(){
        try {
            icid=ItemController.getAllICId();
            for (ItemCatagoryModel itemCatagoryModel : icid) {
                icidcombo.addItem(itemCatagoryModel.getiCatId());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ItemCatagoryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     private void setTime() {
        new Thread() {
            @Override
            public void run() {
                while (true) {                    
                    Date date = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                    timelabel.setText(dateFormat.format(date));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Template.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        }.start();
    }
   private void setDate() {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
        String formatedDate = dateFormat.format(date);
        datelabel.setText(formatedDate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timelabel = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        piclabel = new javax.swing.JLabel();
        updatebutton = new javax.swing.JButton();
        ictypetext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        itemnametext = new javax.swing.JTextField();
        itemidtext = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        deletebutton = new javax.swing.JButton();
        addbutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        icidcombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 87, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 87, 43));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Catagory Manage");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 0, 460, 57);

        timelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timelabel.setForeground(new java.awt.Color(255, 255, 255));
        timelabel.setText("12.00.00");
        jPanel2.add(timelabel);
        timelabel.setBounds(730, 30, 78, 25);

        datelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datelabel.setForeground(new java.awt.Color(255, 255, 255));
        datelabel.setText("20th April 2016");
        jPanel2.add(datelabel);
        datelabel.setBounds(730, 0, 100, 30);

        piclabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/kembrose/view/images/lunch.png"))); // NOI18N
        piclabel.setText("jLabel3");
        jPanel2.add(piclabel);
        piclabel.setBounds(10, 0, 60, 60);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 60);

        updatebutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        updatebutton.setText("Update");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel3.add(updatebutton);
        updatebutton.setBounds(320, 530, 120, 40);

        ictypetext.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ictypetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ictypetextActionPerformed(evt);
            }
        });
        jPanel3.add(ictypetext);
        ictypetext.setBounds(180, 220, 160, 24);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Item Catagory Id  :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 180, 130, 30);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Item Catagory Type  :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 220, 150, 30);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Item Name  :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 100, 110, 30);

        itemnametext.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel3.add(itemnametext);
        itemnametext.setBounds(180, 100, 160, 24);

        itemidtext.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel3.add(itemidtext);
        itemidtext.setBounds(180, 140, 160, 24);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);
        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 270, 420, 240);

        deletebutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel3.add(deletebutton);
        deletebutton.setBounds(500, 530, 120, 40);

        addbutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        addbutton.setText(" Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(addbutton);
        addbutton.setBounds(160, 530, 120, 40);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setText("Item Id  :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 140, 110, 30);

        icidcombo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        icidcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                icidcomboItemStateChanged(evt);
            }
        });
        jPanel3.add(icidcombo);
        icidcombo.setBounds(180, 180, 160, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/kembrose/view/images/FontAwesome_f015_64_4.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2);
        jLabel2.setBounds(730, 510, 64, 60);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 880, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        String itemname=itemnametext.getText();
        String itemid=itemidtext.getText();
        String ictype=ictypetext.getText();
        String icid=ictypetext.getText();
        
        ItemCatagoryManagePanel1 icmp1=new ItemCatagoryManagePanel1();
        icmp1.setData();
       
         ItemModel itemmodel = new ItemModel(itemid, icid, itemname, lprice, size1, personcount1);
        try {
            boolean isAdded=ItemController.addItem(itemmodel);
             if (isAdded) {
            JOptionPane.showMessageDialog(this, "Added success");
            }else{
             JOptionPane.showMessageDialog(this, "Added Failed");
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemCatagoryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemCatagoryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        ItemCatagoryManagePanel2 icmp2=new ItemCatagoryManagePanel2();
        icmp2.setData();
        String size ="";
        if (size1.isEmpty()) {
        size = size2;
        }else{
        size = size1;
        }
        
               
    }//GEN-LAST:event_addbuttonActionPerformed

    private void ictypetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ictypetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ictypetextActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        String itemid = itemidtext.getText();
        try {
            boolean isDeleted = ItemController.deleteItem(itemid);
             if (isDeleted) {
                JOptionPane.showMessageDialog(this, "Delete sucsess....");
            }else{
                JOptionPane.showMessageDialog(this, "Delete Failed....");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemCatagoryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemCatagoryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void icidcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_icidcomboItemStateChanged
        String icId = icidcombo.getSelectedItem().toString();
        try {
          String itemCatagoryType = ItemCatagoryController.searchItemCatagoryType(icId);
           ictypetext.setText(itemCatagoryType);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemCatagoryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemCatagoryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
      // if (icidcombo.getSelectedItem()==String )
           
    }//GEN-LAST:event_icidcomboItemStateChanged

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemCatagoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemCatagoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemCatagoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemCatagoryManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemCatagoryManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JLabel datelabel;
    private javax.swing.JButton deletebutton;
    private javax.swing.JComboBox icidcombo;
    private javax.swing.JTextField ictypetext;
    private javax.swing.JTextField itemidtext;
    private javax.swing.JTextField itemnametext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel piclabel;
    private javax.swing.JLabel timelabel;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables

    public void setData(String size2, double price2, int personcount2) {
        this.size2=size2;
        this.price2=price2;
        this.personcount2=personcount2;
    }

    
}