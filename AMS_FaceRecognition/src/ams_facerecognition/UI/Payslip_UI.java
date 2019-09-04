/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition.UI;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

import ams_facerecognition.Attendance;
import ams_facerecognition.DB_Connection;
import ams_facerecognition.Employee;
import ams_facerecognition.Pay_Slip;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author A.RA
 */
public class Payslip_UI extends javax.swing.JFrame {
     Connection conn;
     ResultSet rs =null; 
     PreparedStatement pst=null; 
    /**
     * Creates new form Students_UI
     */
    public Payslip_UI() {
        
          try
            {
                DB_Connection dbObj = new DB_Connection();
                conn = dbObj.getConnection();
            }
            catch (Exception ex)
            {
             
                JOptionPane.showMessageDialog(null, "Can't Open Connection!! " + ex.getMessage());
            }
        initComponents();
        distable();
    }


   
    
    private void distable() { 
    
        try { 
        String sql ="SELECT ps_id, emp_id, generated_date, hourly_payment, net_salary  from pay_slip"; 
        pst=conn.prepareStatement(sql); 
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 

        }
        catch (Exception e) { 
        JOptionPane.showMessageDialog(null, e); 
       } 
    }
    
      public void refresh(){
     
        txtemp_Id.setText("");
        
        txtnet_salary.setText("");
       // txtcaptureTimeout.setText("");
     //   txthoursworked.setText("");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enst = new javax.swing.JLabel();
        txtps_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtemp_Id = new javax.swing.JTextField();
        Emp_id = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        Btn_Upate = new javax.swing.JButton();
        txtnet_salary = new javax.swing.JTextField();
        Emp_id1 = new javax.swing.JLabel();
        Emp_id2 = new javax.swing.JLabel();
        txthourly_payment = new javax.swing.JTextField();
        Emp_id3 = new javax.swing.JLabel();
        Emp_id4 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtcalculatesalary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enst.setBackground(new java.awt.Color(204, 51, 0));
        enst.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        enst.setText("Generating payslip ");
        getContentPane().add(enst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 30));
        enst.getAccessibleContext().setAccessibleName("Register Employee");

        txtps_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtps_id.setForeground(new java.awt.Color(102, 102, 102));
        txtps_id.setEnabled(false);
        txtps_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtps_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtps_idFocusLost(evt);
            }
        });
        getContentPane().add(txtps_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 120, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PaySlip_ID", "Emp_id", "Hourly_payment", "Salary", "Net Salary"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 830, 370));

        txtemp_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtemp_Id.setForeground(new java.awt.Color(102, 102, 102));
        txtemp_Id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemp_IdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemp_IdFocusLost(evt);
            }
        });
        txtemp_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemp_IdActionPerformed(evt);
            }
        });
        getContentPane().add(txtemp_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 50));

        Emp_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emp_id.setText("Payslip_ID :");
        getContentPane().add(Emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, 30));

        btnInsert.setBackground(new java.awt.Color(102, 102, 255));
        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.setToolTipText("");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 120, 60));

        Btn_Upate.setBackground(new java.awt.Color(102, 102, 255));
        Btn_Upate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Upate.setText("UPDATE");
        Btn_Upate.setToolTipText("");
        Btn_Upate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UpateActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Upate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 150, 60));

        txtnet_salary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnet_salary.setForeground(new java.awt.Color(102, 102, 102));
        txtnet_salary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnet_salaryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnet_salaryFocusLost(evt);
            }
        });
        getContentPane().add(txtnet_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 150, 50));

        Emp_id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emp_id1.setText("*Net_Salary :");
        getContentPane().add(Emp_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 130, 30));

        Emp_id2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emp_id2.setText("*Employee_ID :");
        getContentPane().add(Emp_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 30));

        txthourly_payment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txthourly_payment.setForeground(new java.awt.Color(102, 102, 102));
        txthourly_payment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthourly_paymentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthourly_paymentFocusLost(evt);
            }
        });
        getContentPane().add(txthourly_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 150, 50));

        Emp_id3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emp_id3.setText("*Hourly_Payment :");
        getContentPane().add(Emp_id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 30));

        Emp_id4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emp_id4.setText("*Salary  :");
        getContentPane().add(Emp_id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 30));

        txtsalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsalary.setForeground(new java.awt.Color(102, 102, 102));
        txtsalary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsalaryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsalaryFocusLost(evt);
            }
        });
        getContentPane().add(txtsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 150, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcalculatesalary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcalculatesalary.setText("CALCULATE NET SALARY");
        txtcalculatesalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcalculatesalaryActionPerformed(evt);
            }
        });
        jPanel1.add(txtcalculatesalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 180, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 790));

        setSize(new java.awt.Dimension(893, 826));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtps_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtps_idFocusGained

      
    }//GEN-LAST:event_txtps_idFocusGained

    private void txtps_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtps_idFocusLost
       
    }//GEN-LAST:event_txtps_idFocusLost

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        if (txtemp_Id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter the Employee ID", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
    
        else if (txthourly_payment.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter the hourly payment", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
      
        else if (txtnet_salary.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Number of Net Salary!! ", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }

        else {

            try{

                    Pay_Slip obj=new Pay_Slip();
                    int Employee_ID = Integer.parseInt(txtemp_Id.getText());
                    obj.setEmp_id(Employee_ID);
                    double hourly_pay = Double.parseDouble(txthourly_payment.getText());
                    obj.setHourly_payment(hourly_pay);
                      
                    
                  /*  int salary = Integer.parseInt(txtsalary.getText());
                    obj.setSalary(salary);*/
                    double net_salary = Double.parseDouble(txtnet_salary.getText());
                    obj.setNet_salary(net_salary);
                    obj.addpayslip(obj);

                    JOptionPane.showMessageDialog(this, "Successfully Employee Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
                    distable();
                    refresh();
            }
            catch (Exception ex) {
                System.out.println(" "+ex.toString());
           //     JOptionPane.showMessageDialog(ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtemp_IdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemp_IdFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemp_IdFocusGained

    private void txtemp_IdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemp_IdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemp_IdFocusLost

    private void txtemp_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemp_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemp_IdActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        

        txtps_id.setText(model.getValueAt(selectedRowIndex, 0 ).toString());
        txtemp_Id.setText(model.getValueAt(selectedRowIndex, 1 ).toString());
        txtnet_salary.setText(model.getValueAt(selectedRowIndex, 2).toString());
    //    txtcaptureTimeout.setText(model.getValueAt(selectedRowIndex, 3 ).toString());
      //  txthoursworked.setText(model.getValueAt(selectedRowIndex, 4).toString());

      
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void Btn_UpateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UpateActionPerformed
         
        try{
            String value0= txtps_id.getText();
            String value1=txtemp_Id.getText();
            String value2=txtnet_salary.getText();
            String value3=txtnet_salary.getText();
            String value4=txtnet_salary.getText();
           // String value5=txthoursworked.getText();
            
            
            String SQL= "UPDATE Attendance SET emp_Id='"+value1+"',date_today='"+value2+"',time_in='"+value3
            +"', time_out='"+value4+"', hours_worked='"+value4+"' where attnd_Id='"+value0+"'";
            pst=conn.prepareStatement(SQL);
            pst.execute();

            JOptionPane.showMessageDialog(this, "Sucessfully Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        distable();
        refresh();
    }//GEN-LAST:event_Btn_UpateActionPerformed

    private void txtnet_salaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnet_salaryFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnet_salaryFocusGained

    private void txtnet_salaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnet_salaryFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnet_salaryFocusLost

    private void txthourly_paymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthourly_paymentFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txthourly_paymentFocusGained

    private void txthourly_paymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthourly_paymentFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txthourly_paymentFocusLost

    private void txtsalaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsalaryFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryFocusGained

    private void txtsalaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsalaryFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryFocusLost

    private void txtcalculatesalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcalculatesalaryActionPerformed
     try {
       String sql = "SELECT SUM(hours_worked) from attendance where Month(date_today) = MONTH(CURRENT_DATE()) AND emp_id = '"+txtemp_Id.getText()+"'";
       rs = pst.executeQuery(sql);
       if(rs.next()){
         //Retrieve by column name
         int hoursWorked  = rs.getInt("SUM(hours_worked)");
         double hourlypay = Integer.parseInt(txthourly_payment.getText());
         txtnet_salary.setText(String.valueOf(hoursWorked * hourlypay));
      }
      rs.close();
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e); 
       }
    }//GEN-LAST:event_txtcalculatesalaryActionPerformed

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
            java.util.logging.Logger.getLogger(Payslip_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payslip_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payslip_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payslip_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payslip_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Upate;
    private javax.swing.JLabel Emp_id;
    private javax.swing.JLabel Emp_id1;
    private javax.swing.JLabel Emp_id2;
    private javax.swing.JLabel Emp_id3;
    private javax.swing.JLabel Emp_id4;
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel enst;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtcalculatesalary;
    private javax.swing.JTextField txtemp_Id;
    private javax.swing.JTextField txthourly_payment;
    private javax.swing.JTextField txtnet_salary;
    private javax.swing.JTextField txtps_id;
    private javax.swing.JTextField txtsalary;
    // End of variables declaration//GEN-END:variables
}