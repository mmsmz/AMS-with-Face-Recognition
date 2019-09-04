/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author A.RA
 */
public class Newusers {
    private int User_id;
    private int Emp_id;
    private String User_Type;
    private String userName;
    private String password;
    private Date create_date;

    
    
    /**
     * @return the User_id
     */
    public int getUser_id() {
        return User_id;
    }

    /**
     * @param User_id the User_id to set
     */
    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    /**
     * @return the Emp_id
     */
    public int getEmp_id() {
        return Emp_id;
    }
  /**
     * @param Emp_id the Emp_id to set
     */
    public void setEmp_id(int Emp_id) {
        this.Emp_id = Emp_id;
    }
    
    
    /**
     * @return the User_Type
     */
    public String getUser_Type() {
        return User_Type;
    }

    /**
     * @param User_Type the User_Type to set
     */
    public void setUser_Type(String User_Type) {
        this.User_Type = User_Type;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the create_date
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * @param create_date the create_date to set
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
    
    public static String SHA1(String input){
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
    }        

    public void addnewuser(Newusers obj) throws Exception
    {    

          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");     
          Calendar cal = new GregorianCalendar(); 
          String SQL ="insert into users ( emp_id, userType, userName, pass_Word, created_date) values('"+obj.Emp_id  +"','"+obj.User_Type+"',"
                + "'"+obj.userName+"','"+SHA1(obj.password)+"','"+sdf.format(obj.create_date)+"')";
          DB_Connection objcon=new DB_Connection();
          System.out.println(" "+SQL);
          objcon.addvalue(SQL);
  
    }
 
    
     
}
