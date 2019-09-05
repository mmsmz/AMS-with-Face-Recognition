/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author STYL3
 */
public class Default_Salary {
    private int sdsId;
    private String designation;
    private double hourly_pay;
    private double basicSalary;
    private Date create_date;


    /**
     * @return the sdsId
     */
    public int getSdsId() {
        return sdsId;
    }

    /**
     * @param sdsId the sdsId to set
     */
    public void setSdsId(int sdsId) {
        this.sdsId = sdsId;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the hourly_pay
     */
    public double getHourly_pay() {
        return hourly_pay;
    }

    /**
     * @param hourly_pay the hourly_pay to set
     */
    public void setHourly_pay(double hourly_pay) {
        this.hourly_pay = hourly_pay;
    }

    /**
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
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
 
    
    
    
    
    public void adddefaultsalary(Default_Salary obj) throws Exception
    {    

          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");     
          Calendar cal = new GregorianCalendar(); 
          String SQL ="insert into deafult_Salary ( Designation, Hours_payment, Basic_Salary, Date) values('"+obj.designation+"',"+obj.hourly_pay+"',"+obj.basicSalary+"','"+sdf.format(obj.create_date)+"')";
          DB_Connection objcon=new DB_Connection();
          System.out.println(" "+SQL);
          objcon.addvalue(SQL);
  
    }

}
