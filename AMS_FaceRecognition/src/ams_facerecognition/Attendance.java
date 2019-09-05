/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



public class Attendance {
     
    private int attnd_ID;
    private int emp_id;
    private Date date_today;
    private Time time_In;
    private Time time_Out;
    private Double hours_worked;

     Connection conn;
     ResultSet rs =null; 
     PreparedStatement pst=null; 
     
    public Attendance(){
      try
            {
                DB_Connection dbObj = new DB_Connection();
                conn = dbObj.getConnection();
            }
            catch (Exception ex)
            {
             
                JOptionPane.showMessageDialog(null, "Can't Open Connection!! " + ex.getMessage());
            }
    }

    /**
     * @return the attnd_ID
     */
    public int getAttnd_ID() {
        return attnd_ID;
    }

    
    /**
     * @param attnd_ID the attnd_ID to set
     */
    public void setAttnd_ID(int attnd_ID) {
        this.attnd_ID = attnd_ID;
    }

    /**
     * @return the emp_id
     */
    public int getEmp_id() {
        return emp_id;
    }

    /**
     * @return the date_today
     */
    public Date getDate_today() {
        return date_today;
    }

    /**
     * @param date_today the date_today to set
     */
    public void setDate_today(Date date_today) {
        this.date_today = date_today;
    }

    /**
     * @return the time_In
     */
    public Time getTime_In() {
        return time_In;
    }

    /**
     * @param time_In the time_In to set
     */
    public void setTime_In(Time time_In) {
        this.time_In = time_In;
    }

    /**
     * @return the time_Out
     */
    public Time getTime_Out() {
        return time_Out;
    }

    /**
     * @param time_Out the time_Out to set
     */
    public void setTime_Out(Time time_Out) {
        this.time_Out = time_Out;
    }

    /**
     * @return the hours_worked
     */
    public Double getHours_worked() {
        return hours_worked;
    }

    /**
     * @param hours_worked the hours_worked to set
     */
    public void setHours_worked(Double hours_worked) {
        this.hours_worked = hours_worked;
    }

        /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    String join_date;
        
    public void addattendance(Attendance obj) throws Exception
    {
       // startup();
     try {
       String sql = "SELECT * from attendance where emp_id='"+obj.getEmp_id()+"' and date_today = CURDATE()";
        pst=conn.prepareStatement(sql); 
        rs=pst.executeQuery();
//       rs = pst.executeQuery(sql);
      
      if(!rs.next()){
         //Retrieve by column name
        String SQL ="insert into attendance ( emp_id, date_today, time_in, time_out, hours_worked) values('"+obj.getEmp_id()+"',CURDATE(),CURRENT_TIME(),CURRENT_TIME(),0)";
        DB_Connection objcon=new DB_Connection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
      }
      rs.close();
      }catch(Exception e){
       JOptionPane.showMessageDialog(null, e); 
      }
    }
    
    
    public void addlogout(Attendance obj) throws Exception
    {
     try {
        String SQL ="UPDATE attendance SET time_out = CURRENT_TIME(), hours_worked =ROUND(TIME_TO_SEC(TIMEDIFF(time_out, time_in))/(60*60)) where emp_id='"+obj.getEmp_id()+"' AND date_today = CURDATE()";
        DB_Connection objcon=new DB_Connection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
       
      }catch(Exception e){
       JOptionPane.showMessageDialog(null, e); 
       }
    }


    
}
