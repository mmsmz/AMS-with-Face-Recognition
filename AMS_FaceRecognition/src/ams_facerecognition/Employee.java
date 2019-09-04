/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition;

import ams_facerecognition.UI.Employee_UI;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author A.RA
 */
public class Employee {

   private int emp_ID;
   private String emptype;
   private String name;
   private String gender;
   private String nicNo;
   private String homeAddress;
   private String contactNo;
   private String emailId;
   private String qualification;
   private Date join_date;
   private String department;
 
   
   
     /**
     * @return the emp_ID
     */
    public int getEmp_ID() {
        return emp_ID;
    }
    /**
     * @param emp_ID the emp_ID to set
     */
    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the nicNo
     */
    public String getNicNo() {
        return nicNo;
    }

    /**
     * @param nicNo the nicNo to set
     */
    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    /**
     * @return the homeAddress
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the qualification
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * @param qualification the qualification to set
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

   
    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
   
   
   //String date = datepicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
   
   
        /**
     * @return the join_date
     */
    public Date getJoin_date() {
        return join_date;
    }

    /**
     * @param join_date the join_date to set
     */
    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    /**
     * @return the emptype
     */
    public String getEmptype() {
        return emptype;
    }

    /**
     * @param emptype the emptype to set
     */
    public void setEmptype(String emptype) {
        this.emptype = emptype;
    }
    
       
    public void addemployee(Employee obj) throws Exception
    {
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");     
        Calendar cal = new GregorianCalendar(); 
    
          
        String SQL ="insert into Employee ( name, gender, nicNo, homeAddress, contactNo, emailId, qualification, join_date, department) values('"+obj.name  +"','"+obj.gender+"',"
                + "'"+obj.nicNo+"','"+obj.homeAddress+"','"+obj.contactNo+"','"+obj.emailId+"','"+obj.qualification+"','"+sdf.format(obj.join_date)+"','"+obj.department+"')";
        DB_Connection objcon=new DB_Connection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
    }



    
}
