package com.springapp.mvc.model;

import java.util.ArrayList;
import java.util.Date;
/**
 * Created with IntelliJ IDEA.
 * User: suruchi
 * Date: 2/13/15
 * Time: 5:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class student3 {
    private String StudentName;
    private String StudentHobby;
    private Long StudentMobile;
    private ArrayList<String> StudentSkills;
    private Date StudentDOB;
    private String studentName;


    public String getStudentHobby()
    {
        return StudentHobby;
    }
    public ArrayList<String> getStudentSkills()
    {
        return StudentSkills;
    }
    public Date getStudentDOB()
    {
        return StudentDOB;
    }
    public Long getStudentMobile()
    {
        return StudentMobile;
    }
    public void setStudentName(String StudentName)
    {
        this.StudentName=StudentName;
    }
   public  void setStudentHobby(String StudentHobby)
    {
        this.StudentHobby=StudentHobby;
    }
    public  void setStudenMobile(Long StudentMobile)
    {
        this.StudentMobile=StudentMobile;
    }
    public  void setStudentDOB(Date StudentDOB)
    {
        this.StudentDOB=StudentDOB;
    }
    void setStudentSkills(ArrayList<String> StudentSkills)
    {
        this.StudentSkills=StudentSkills;
    }


    String getStudentName() {
        return StudentName;  //To change body of created methods use File | Settings | File Templates.
    }
}
