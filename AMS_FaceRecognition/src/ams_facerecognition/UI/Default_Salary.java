/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition.UI;

import ams_facerecognition.DB_Connection;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author A.RA
 */
public class Default_Salary extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs =null; 
    PreparedStatement pst=null; 
    Date date;
    
    public Default_Salary() {
        
          try
            {
                DB_Connection dbObj = new DB_Connection();
                conn = dbObj.getConnection();
            }
            catch (Exception ex)
            {
                //Messa.Show("Can't Open Connection!! " + ex);
                JOptionPane.showMessageDialog(null, "Can't Open Connection!! " + ex.getMessage());
            }
        initComponents();
    
        distable();
        date = new Date();
        txtdatepicker.setDate(date);
        
       // TableColumnModel tcm = jTable1.getColumnModel();
      //  tcm.removeColumn(tcm.getColumn(0) );
        
     
    //  userid.hide();
     
       
    }

    private void distable() { 
    
        try { 
        String sql ="SELECT default_salary.sds_id, default_salary.designation, default_salary.Hours_payment, default_salary.Basic_Salary,  DATE_FORMAT(users.Date, '%y-%m-%d') from default_salary"; 
        pst=conn.prepareStatement(sql); 
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
        jTable1.removeColumn(jTable1.getColumnModel().getColumn(0)); // hiding the user-id
        //System.out.println("inserted");
      
        }
        catch (Exception e) { 
        JOptionPane.showMessageDialog(null, e); 
       } 
    }
       
    public void refresh(){
        //jComboBoxUserType.setSelectedItem("");
        txthoursPaid.setText("");
        txtbasicSalary.setText("");
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnedit = new javax.swing.JButton();
        txtsds_ID = new javax.swing.JTextField();
        txtcmbtypesofDesignation = new javax.swing.JComboBox();
        txthoursPaid = new javax.swing.JPasswordField();
        txtbasicSalary = new javax.swing.JPasswordField();
        btnregister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdatepicker = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnedit.setBackground(new java.awt.Color(102, 102, 255));
        btnedit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnedit.setText("UPDATE");
        btnedit.setToolTipText("");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 110, 30));

        txtsds_ID.setEditable(false);
        jPanel1.add(txtsds_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 40, -1));

        txtcmbtypesofDesignation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Intern Technology", "Associate Engineer Technology", "Engineer Technology", "Senior Engineer Technology", "Lead Technology", " ", "Intern HR", "Associate Executive", "Executive", "Senior Executive", "Associate Consultant" }));
        jPanel1.add(txtcmbtypesofDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, 30));

        txthoursPaid.setForeground(new java.awt.Color(0, 0, 204));
        txthoursPaid.setToolTipText("");
        txthoursPaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txthoursPaid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthoursPaidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthoursPaidFocusLost(evt);
            }
        });
        txthoursPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoursPaidActionPerformed(evt);
            }
        });
        jPanel1.add(txthoursPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, 30));

        txtbasicSalary.setForeground(new java.awt.Color(0, 0, 204));
        txtbasicSalary.setToolTipText("");
        txtbasicSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtbasicSalary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbasicSalaryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbasicSalaryFocusLost(evt);
            }
        });
        txtbasicSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbasicSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(txtbasicSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, 30));

        btnregister.setBackground(new java.awt.Color(102, 102, 255));
        btnregister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnregister.setText("INSERT");
        btnregister.setToolTipText("");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "sds_id", "Designation", "Hourly_paid", "basic Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 410, 270));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hourly Payment : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));

        jLabel5.setBackground(new java.awt.Color(204, 51, 0));
        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>Basic Salary Package</html>");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 70));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Basic Salary :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 40, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Designation :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 350));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("SDS_ID : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, -1));

        txtdatepicker.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(txtdatepicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 790, 340));

        setSize(new java.awt.Dimension(803, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   /*   public static String SHA1(String input){
        try {
            
            MessageDigest mDigest = MessageDigest.getInstance("SHA1") ;
            byte[] result = mDigest.digest(input.getBytes());
            StringBuffer sb = new StringBuffer();
            
            for(int i = 0; i<result.length; i++){
                sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
            
                    
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
    }        */
    
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed

        if (txtcmbtypesofDesignation.getSelectedIndex() <= 0)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please select Designation", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
          

        else if (txthoursPaid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "enter the Hoursly Pay", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
   
        else  if (txtbasicSalary.getText().isEmpty()){   
            
        try{
            
        Default_Salary obj = new Default_Salary();
        //int Employee_ID = Integer.parseInt(txtemp_id.getText());
          //obj.setEmp_id(Employee_ID);
            
       obj.Desi(txtcmbtypesofDesignation.getSelectedItem().toString());
       obj.setUserName(txtusername.getText()); 
       obj.setPassword(txthoursPaid.getText());
       obj.setCreate_date(txtdatepicker.getDate());
       
       obj.addnewuser(obj);
        
         JOptionPane.showMessageDialog(this, "Successfully Created New User ", "Success", JOptionPane.INFORMATION_MESSAGE);
        distable();
        refresh();
        
        }
        
        catch (Exception ex) {
           //System.out.println(" "+ex.toString());
              JOptionPane.showMessageDialog(this, "Failed to Update, Please Recheck the Enteres Feilds", "Failed to Update" +ex.toString(), JOptionPane.ERROR_MESSAGE);
        }
       }
    }//GEN-LAST:event_btnregisterActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        java.util.Date date;
        
      try { 
          String valx1 =null;
          try
           {
             valx1 =  model.getValueAt(selectedRowIndex, 0 ).toString(); 
           }catch(Exception ex)
           {
           }
         if(valx1==null || valx1.toString().isEmpty() || valx1.toString().length()<1 ){ 
         txtemp_id.setText(model.getValueAt(selectedRowIndex, 1 ).toString());
         txtusername.setText(model.getValueAt(selectedRowIndex, 6 ).toString());
         
         txthoursPaid.setText("");
         txtbasicSalary.setText("");  
         }
               
        else {
        
        txtsds_ID.setText(model.getValueAt(selectedRowIndex, 0 ).toString());
        txtemp_id.setText(model.getValueAt(selectedRowIndex, 1 ).toString());
        //txtemp_id.setEditable(false);
        txtcmbtypesofDesignation.setSelectedItem(model.getValueAt(selectedRowIndex, 2 ).toString());
        
        txtusername.setText(model.getValueAt(selectedRowIndex, 6 ).toString());
        txthoursPaid.setText("");
        txtbasicSalary.setText("");   

             date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(selectedRowIndex, 4 ));
             txtdatepicker.setDate(date);
         } 
    }catch (ParseException ex) {
             Logger.getLogger(Default_Salary.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txthoursPaidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthoursPaidFocusGained
         
    }//GEN-LAST:event_txthoursPaidFocusGained

    private void txthoursPaidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthoursPaidFocusLost
       
        
    }//GEN-LAST:event_txthoursPaidFocusLost

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
       Newusers obj=new Newusers();
        if (txtemp_id.getText() .isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a data from the table below to update the password", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
       else {
            
        try{
        String value0 = txtsds_ID.getText();
        String value1=txtcmbtypesofDesignation.getSelectedItem().toString();

        String value2 = obj.SHA1(txthoursPaid.getText());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");     
        Calendar cal = new GregorianCalendar(); 
        String value3=sdf.format(txtdatepicker.getDate()); 
       
        String sql= "UPDATE users SET userType='"+value1+"', pass_Word='"+value2+"', created_date='"+value3+"'   where user_id='"+value0+"'";
        pst=conn.prepareStatement(sql);
        pst.execute();
              
        JOptionPane.showMessageDialog(this, "Sucessfully Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        
        distable();
        refresh();
       }
    }//GEN-LAST:event_btneditActionPerformed

    
    private void txthoursPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoursPaidActionPerformed
            
    
    }//GEN-LAST:event_txthoursPaidActionPerformed

    private void txtbasicSalaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbasicSalaryFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbasicSalaryFocusGained

    private void txtbasicSalaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbasicSalaryFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbasicSalaryFocusLost

    private void txtbasicSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbasicSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbasicSalaryActionPerformed

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
            java.util.logging.Logger.getLogger(Default_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Default_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Default_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Default_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Default_Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txtbasicSalary;
    private javax.swing.JComboBox txtcmbtypesofDesignation;
    private com.toedter.calendar.JDateChooser txtdatepicker;
    private javax.swing.JPasswordField txthoursPaid;
    private javax.swing.JTextField txtsds_ID;
    // End of variables declaration//GEN-END:variables
}
