/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB_Connection {
    public static Connection getConnection() throws Exception{
        
            try { 
                String driver = "com.mysql.cj.jdbc.Driver";
                String url= "jdbc:mysql://localhost:3306/ams_fr";    
                String userName= "root";
                String password= "1234";
                Class.forName(driver);
                Connection conn =null;
                conn = DriverManager.getConnection(url, userName, password);
                System.out.println("Connected!!");
                return conn;
            }
            catch(Exception e){
                System.out.println(e);
            }          
        return  null;
     }
    
     public void addvalue(String SQL)throws Exception{
      Statement st=getConnection().createStatement();
      st.executeUpdate(SQL);
      getConnection().close();
    }
 }

     //Connection conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ABC_UNIDB;integratedSecurity=true");
  
     //Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/AMS_FR" +
                                  // "user=root&password=1234");
    

    
 