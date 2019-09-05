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
 * @author STYL3
 */
public class Department {

       private String departmentname;
       private int deptmnt_Heaad_ID
       private String Location;
       
       
    /**
     * @return the departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
     * @param departmentname the departmentname to set
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
     * @return the deptmnt_Heaad_ID
     */
    public int getDeptmnt_Heaad_ID() {
        return deptmnt_Heaad_ID;
    }

    /**
     * @param deptmnt_Heaad_ID the deptmnt_Heaad_ID to set
     */
    public void setDeptmnt_Heaad_ID(int deptmnt_Heaad_ID) {
        this.deptmnt_Heaad_ID = deptmnt_Heaad_ID;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

       
       
       
    
}
