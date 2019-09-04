/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition.UI;

import ams_facerecognition.DB_Connection;
import ams_facerecognition.Newusers;
import static ams_facerecognition.Newusers.SHA1;
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
public class NEWUSER_UI extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs =null; 
    PreparedStatement pst=null; 
    Date date;
    public NEWUSER_UI() {
        
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
        String sql ="SELECT users.user_Id, employee.emp_ID, users.userType, users.userName,  DATE_FORMAT(users.created_date, '%y-%m-%d'),  employee.name, employee.emailId from users RIGHT join employee ON users.emp_id = employee.emp_ID order by users.emp_id desc"; 
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
        txtemp_id.setText("");
        txtusername.setText("");
        
        txtpassword.setText("");
        txtconfirmpassword.setText("");
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnregister = new javax.swing.JButton();
        txtemp_id = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxUserType = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtconfirmpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtdatepicker = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregister.setBackground(new java.awt.Color(102, 102, 255));
        btnregister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnregister.setText("INSERT");
        btnregister.setToolTipText("");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 290, 50));

        txtemp_id.setEditable(false);
        txtemp_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtemp_id.setForeground(new java.awt.Color(0, 0, 204));
        txtemp_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemp_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemp_idFocusLost(evt);
            }
        });
        getContentPane().add(txtemp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 100, 40));

        txtpassword.setForeground(new java.awt.Color(0, 0, 204));
        txtpassword.setToolTipText("");
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 290, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SELECT USER TYPE :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 150, 40));

        userid.setEditable(false);
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 40, 40));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "user_id", "Emp_id", "User_Type", "User_Name", "Create_date", "Emp_Name", "Emp_EmailID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, true, true
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
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 770, 160));

        jComboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "ADMINISTRATOR", "HR", "EMPLOYEE" }));
        getContentPane().add(jComboBoxUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 150, 40));

        jLabel5.setBackground(new java.awt.Color(204, 51, 0));
        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setText("REGISTER NEW USERS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Employee Id :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("USER ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, -1));

        txtusername.setEditable(false);
        txtusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 0, 204));
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 290, 40));

        txtconfirmpassword.setForeground(new java.awt.Color(0, 0, 204));
        txtconfirmpassword.setToolTipText("");
        txtconfirmpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtconfirmpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtconfirmpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtconfirmpasswordFocusLost(evt);
            }
        });
        txtconfirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 290, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Confirm Password :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, -1));

        txtdatepicker.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(txtdatepicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 140, 40));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setText("Show");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 70, 40));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndelete.setBackground(new java.awt.Color(236, 47, 0));
        btndelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Deactivate");
        btndelete.setToolTipText("");
        btndelete.setContentAreaFilled(false);
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndelete.setOpaque(true);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, 50));

        btnedit.setBackground(new java.awt.Color(102, 102, 255));
        btnedit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnedit.setText("UPDATE");
        btnedit.setToolTipText("");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 100, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));

        setSize(new java.awt.Dimension(803, 624));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemp_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemp_idFocusGained
     
     
    }//GEN-LAST:event_txtemp_idFocusGained

    private void txtemp_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemp_idFocusLost
    
    }//GEN-LAST:event_txtemp_idFocusLost
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
       
        
        if (txtemp_id.getText() .isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please select from the table below to assign a login to the specific users", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
        else if (jComboBoxUserType.getSelectedIndex() <= 0)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please select User Type", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
          
        else if (txtusername.getText() .isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter the User Name", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (txtpassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Password ", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
   
         else if (!(txtconfirmpassword.getText().equals(txtpassword.getText())))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Paaword Mismatch", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
        else  if (txtconfirmpassword.getText().equals(txtpassword.getText())){   
            
        try{
            
        Newusers obj=new Newusers();
        int Employee_ID = Integer.parseInt(txtemp_id.getText());
                    obj.setEmp_id(Employee_ID);
                    
       obj.setUser_Type(jComboBoxUserType.getSelectedItem().toString());
       obj.setUserName(txtusername.getText());
        
       // sha1  encrypting the password
       obj.setPassword(txtpassword.getText());
       obj.setCreate_date(txtdatepicker.getDate());
                     
       // obj.setCreate_date(txtdate.getDate());
       //   obj.setCreate_date(sdf.format(cal.getTime()));
     
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
         txtpassword.setText("");
         txtconfirmpassword.setText("");  
         }
               
        else {
        
        userid.setText(model.getValueAt(selectedRowIndex, 0 ).toString());
        txtemp_id.setText(model.getValueAt(selectedRowIndex, 1 ).toString());
        //txtemp_id.setEditable(false);
        jComboBoxUserType.setSelectedItem(model.getValueAt(selectedRowIndex, 2 ).toString());
        
        txtusername.setText(model.getValueAt(selectedRowIndex, 6 ).toString());
        txtpassword.setText("");
        txtconfirmpassword.setText("");   

             date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(selectedRowIndex, 4 ));
             txtdatepicker.setDate(date);
         } 
    }catch (ParseException ex) {
             Logger.getLogger(NEWUSER_UI.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
         
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
       
        
    }//GEN-LAST:event_txtpasswordFocusLost

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
       Newusers obj=new Newusers();
        if (txtemp_id.getText() .isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a data from the table below to update the password", "Dialog: Fields Can't be Empty", JOptionPane.ERROR_MESSAGE);
        }
       else {
            
        try{
        String value0 = userid.getText();
        String value1=jComboBoxUserType.getSelectedItem().toString();

        String value2 = obj.SHA1(txtpassword.getText());
        
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

    
    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
            
    
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameFocusLost

    private void txtconfirmpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconfirmpasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmpasswordFocusGained

    private void txtconfirmpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconfirmpasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmpasswordFocusLost

    private void txtconfirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmpasswordActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
            if(jCheckBox1.isSelected()){
                     txtpassword.setEchoChar((char)0);
            
            }
            else 
            {
                         txtpassword.setEchoChar('*');
            }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(NEWUSER_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NEWUSER_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NEWUSER_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NEWUSER_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new NEWUSER_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnregister;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBoxUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txtconfirmpassword;
    private com.toedter.calendar.JDateChooser txtdatepicker;
    private javax.swing.JTextField txtemp_id;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
