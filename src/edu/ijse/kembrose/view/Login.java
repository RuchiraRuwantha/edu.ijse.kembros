/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.kembrose.view;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import edu.ijse.kembrose.control.UserController;
import edu.ijse.kembrose.model.UserDetailsModel;
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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setTime();
        setDate();
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel1.setText("Kembrose Restaurant");
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

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("User Name  :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 210, 170, 60);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setText("Password  :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 260, 170, 60);

        userNameText.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel3.add(userNameText);
        userNameText.setBounds(220, 230, 170, 24);
        jPanel3.add(passwordText);
        passwordText.setBounds(220, 270, 170, 30);

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Log In");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(270, 370, 120, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/kembrose/view/images/green.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 60, 880, 570);

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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        String userName = userNameText.getText();
        String password = passwordText.getText();
        try {
            UserDetailsModel user = UserController.logInUser(userName, password);
            if(null == user){
                JOptionPane.showMessageDialog(this, "this user Not Avalable");
                userNameText.setText("");
                passwordText.setText("");
            }else{
                if("pr001".equals(user.getPriorityId())){
                    AdminHome adminHome = new AdminHome();
                    adminHome.setVisible(true);
                }else{
                    CashierHome cashierHome = new CashierHome();
                    cashierHome.setVisible(true);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel piclabel;
    private javax.swing.JLabel timelabel;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
