/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition.UI;

import ams_facerecognition.Attendance;
import ams_facerecognition.DB_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author A.RA
 */
public class EmployeeLOG extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeLOG
     */
    
     Connection conn;
     ResultSet rs =null; 
     PreparedStatement pst=null; 
     
     public EmployeeLOG() {

        initComponents();
        
    }
     
     
    String email_ID;
    public EmployeeLOG(String User) {
     
         try
            {
                DB_Connection dbObj = new DB_Connection();
                conn = dbObj.getConnection();
            }
            catch (Exception ex)
            {
             
                JOptionPane.showMessageDialog(null, "Can't Open Connection!! " + ex.getMessage());
            }
        
        this.email_ID = User;

     initComponents();
        lbl_emailid.setText(User);     
        
        distable();
        lbl_emailid.hide();
    }
    
    
 private void distable() { 
    
        try { 
        String sql ="SELECT  emp_id, name, gender, nicNo, homeAddress, contactNo, emailId, qualification, join_date, department from employee where emailId = '"+email_ID+"'"; 
        pst=conn.prepareStatement(sql); 
        rs=pst.executeQuery();

        if(rs.next()) { 
             txtemp_id.setText(rs.getString("emp_id"));
             txtempname.setText(rs.getString("name"));
             txttgender.setText(rs.getString("gender"));
             txtnicno.setText(rs.getString("nicNo"));
             txthomeaddress.setText(rs.getString("homeAddress"));
             txtcontactno.setText(rs.getString("contactNo"));
             txtemailid.setText(rs.getString("emailId"));
             txtqualification.setText(rs.getString("qualification"));
             txtdateof_join.setText(rs.getString("join_date"));
             txtdepartment.setText(rs.getString("department"));
      
             /*String empId = rs.getString("emp_id");
        txtemp_id.setText(empId);
        String employeeName = rs.getString("name");
        txtempname.setText(employeeName);
    */
  
         }
        }
        catch (Exception e) { 
        JOptionPane.showMessageDialog(null, e); 
       } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btn_payslip = new javax.swing.JButton();
        btn_CheckIn = new javax.swing.JButton();
        txtdepartment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txthomeaddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdateof_join = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnicno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttgender = new javax.swing.JTextField();
        txtqualification = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtempname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcontactno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemp_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_emailid = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_payslip.setText("Payment ");
        btn_payslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payslipActionPerformed(evt);
            }
        });
        jPanel1.add(btn_payslip, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 114, 55));

        btn_CheckIn.setText("CheckIn");
        btn_CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckInActionPerformed(evt);
            }
        });
        jPanel1.add(btn_CheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 114, 55));

        txtdepartment.setEditable(false);
        txtdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(txtdepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 190, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Department :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        txthomeaddress.setEditable(false);
        jPanel1.add(txthomeaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 190, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Home Address :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        txtdateof_join.setEditable(false);
        txtdateof_join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateof_joinActionPerformed(evt);
            }
        });
        jPanel1.add(txtdateof_join, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 190, 35));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Date of Join : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        txtnicno.setEditable(false);
        jPanel1.add(txtnicno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 190, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("NIC NR. :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Sex :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        txttgender.setEditable(false);
        txttgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttgenderActionPerformed(evt);
            }
        });
        jPanel1.add(txttgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, 35));

        txtqualification.setEditable(false);
        txtqualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqualificationActionPerformed(evt);
            }
        });
        jPanel1.add(txtqualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 190, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Qualification :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        txtemailid.setEditable(false);
        jPanel1.add(txtemailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 190, 35));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Email ID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        txtempname.setEditable(false);
        jPanel1.add(txtempname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 190, 35));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Employee Name :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtcontactno.setEditable(false);
        jPanel1.add(txtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 190, 35));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Contact No :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        txtemp_id.setEditable(false);
        jPanel1.add(txtemp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, 35));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Employee ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 51, 0));
        jLabel11.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel11.setText("PrOFILE ABOUT ME: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lbl_emailid.setText("user_name");
        jPanel1.add(lbl_emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 70, 35));

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 80, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 440));

        setSize(new java.awt.Dimension(766, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckInActionPerformed
           EmployeeCheckIN emp_Check_user_checkin =new EmployeeCheckIN ();
           emp_Check_user_checkin.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_btn_CheckInActionPerformed

    private void btn_payslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payslipActionPerformed
               EmployeePayment ep = new EmployeePayment();
               ep.show();
    }//GEN-LAST:event_btn_payslipActionPerformed

    private void txtqualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqualificationActionPerformed

    private void txttgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttgenderActionPerformed

    private void txtdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartmentActionPerformed

    private void txtdateof_joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateof_joinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateof_joinActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
            
            
        
        Attendance atcheck = new Attendance();
        atcheck.setEmp_id(Integer.parseInt(txtemp_id.getText()));
            
      
         try {
             atcheck.addlogout(atcheck);
         } catch (Exception ex) {
             Logger.getLogger(EmployeeLOG.class.getName()).log(Level.SEVERE, null, ex);
         }
             
              JOptionPane.showMessageDialog(null, "Log out success");
                LOGIN_UI admin = new LOGIN_UI();
	        admin.setVisible(true);
             
             // logooout 

               
               
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeLOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLOG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLOG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CheckIn;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_payslip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_emailid;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtdateof_join;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtemp_id;
    private javax.swing.JTextField txtempname;
    private javax.swing.JTextField txthomeaddress;
    private javax.swing.JTextField txtnicno;
    private javax.swing.JTextField txtqualification;
    private javax.swing.JTextField txttgender;
    // End of variables declaration//GEN-END:variables
}
