/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition;

/**
 *
 * @author A.RA
 */
public class Pay_Slip {
    
    private int ps_Id;
    private int emp_id;
    private String generated_date;
    private double hourly_payment;
    
    private double net_salary;

     
    /**
     * @return the ps_Id
     */
    public int getPs_Id() {
        return ps_Id;
    }

    /**
     * @param ps_Id the ps_Id to set
     */
    public void setPs_Id(int ps_Id) {
        this.ps_Id = ps_Id;
    }

    /**
     * @return the emp_id
     */
    public int getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * @return the generated_date
     */
    public String getGenerated_date() {
        return generated_date;
    }

    /**
     * @param generated_date the generated_date to set
     */
    public void setGenerated_date(String generated_date) {
        this.generated_date = generated_date;
    }

  
    
    
     public void addpayslip(Pay_Slip obj) throws Exception
    {
        
        String SQL ="insert into pay_slip ( emp_id, generated_date, hourly_payment, net_salary) values('"+obj.emp_id  +"',CURDATE(),"
                + "'"+obj.getHourly_payment()+"','"+obj.getNet_salary()+"')";
        DB_Connection objcon=new DB_Connection();
        System.out.println(" "+SQL);
        objcon.addvalue(SQL);
    }

    /**
     * @return the hourly_payment
     */
    public double getHourly_payment() {
        return hourly_payment;
    }

    /**
     * @param hourly_payment the hourly_payment to set
     */
    public void setHourly_payment(double hourly_payment) {
        this.hourly_payment = hourly_payment;
    }


    /**
     * @return the net_salary
     */
    public double getNet_salary() {
        return net_salary;
    }

    /**
     * @param net_salary the net_salary to set
     */
    public void setNet_salary(double net_salary) {
        this.net_salary = net_salary;
    }
}
