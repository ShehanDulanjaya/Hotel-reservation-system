/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import  database.DBconnect;
import hotelreservation.admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sharan
 */
public class Removereceptionist1 extends javax.swing.JFrame {
    Connection connect = null;
ResultSet rst=null;
PreparedStatement pst=null;
Statement  stmt =null;

    /**
     * Creates new form removecashier
     */
    public Removereceptionist1() {
        initComponents();
        connect = DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl4 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remove receptionist");
        setPreferredSize(new java.awt.Dimension(1280, 725));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Remove Receptionist");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 180, 34));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Search Receptionist ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 110, 140, 37));

        txt1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 133, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 74, -1));

        tbl4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tbl4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cashier id", "Name", "NIC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl4);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 134));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, -1, -1));

        txt2.setEditable(false);
        txt2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 109, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Selected Receptionist");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 350, 140, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 580, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Admin1 rsp = new Admin1();
     rsp.setVisible(true);
     this.setVisible(false);
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      String idd;
   String idd1;
   String idd2;  
        int i=0;
        String srch=txt1.getText();
        try {
        String sql2 = "SELECT *  FROM login WHERE userId like '%"+srch+"%' ";
        pst = connect.prepareStatement(sql2);
        rst=pst.executeQuery(sql2);
        
            while(rst.next()) {
                idd=rst.getString("userId");
                idd1=rst.getString("fName");
                idd2=rst.getString("nic");
                tbl4.setValueAt(idd, i, 0);
                tbl4.setValueAt(idd1, i, 1);
                tbl4.setValueAt(idd2, i, 2);
                i++;}         // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Removereceptionist1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        String A=txt2.getText();
        if(!"".equals(A)){
      
       int dbb =   JOptionPane.showConfirmDialog (null, "Would You Like to delete Receptionist "+A+"","Warning",JOptionPane.YES_NO_OPTION);
     if(dbb == JOptionPane.YES_OPTION){ 
     
    
     try {
         
     
        String sql1;
         sql1 = "delete from login where userId=?";
        pst = connect.prepareStatement(sql1);
        pst.setString(1, A);
        pst.execute();
        
        

    //  rst=  pst.executeQuery(sql1);
        
        
        JOptionPane.showMessageDialog(null, "Succes!");
    } catch (SQLException ex) {
        Logger.getLogger(Changereceptionistpass1.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     
    Update_table(); 
     
     } 
     else
     {
         
     }
        }
        else{
          JOptionPane.showMessageDialog(null, "Please select one!");  
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl4MouseClicked
int row=tbl4.getSelectedRow();
        
        String Table_click=(tbl4.getModel().getValueAt(row,0).toString());
        
        txt2.setText(Table_click);        // TODO add your handling code here:
    }//GEN-LAST:event_tbl4MouseClicked

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
            java.util.logging.Logger.getLogger(Removereceptionist1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Removereceptionist1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Removereceptionist1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Removereceptionist1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Removereceptionist1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

    private void Update_table() {
 int i=0;       
while(i<10)  
{
    
    tbl4.setValueAt("", i, 0);
    tbl4.setValueAt("", i, 1);
    tbl4.setValueAt("", i, 2);
    i++;
}


//To change body of generated methods, choose Tools | Templates.
    }
}
