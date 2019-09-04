/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams_facerecognition;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author A.RA
 */
public class NewClass {
    
    public static void main (String args[]){
        
        SimpleDateFormat sdf = new SimpleDateFormat("hh mm ss ");     

        Calendar cal = new GregorianCalendar(); 

  

  /*      int year       = cal.get(Calendar.YEAR); 

        int month      = cal.get(Calendar.MONTH);  

        int hour       = cal.get(Calendar.HOUR);   

        int minute     = cal.get(Calendar.MINUTE); 

        int second     = cal.get(Calendar.SECOND); 

        int millisecond= cal.get(Calendar.MILLISECOND); */

             

        System.out.println(sdf.format(cal.getTime())); 

             

   /*     System.out.println("year \t\t: " + year); 

        System.out.println("month \t\t: " + month);         

        System.out.println("hour \t\t: " + hour); 

        System.out.println("minute \t\t: " + minute); 

        System.out.println("second \t\t: " + second); 

        System.out.println("millisecond \t: " + millisecond); 
    }*/
}
}
