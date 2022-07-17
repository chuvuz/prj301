/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vu
 */
public class Course {
    private String courseid;
    private String coursename;

    public Course() {
    }

    public Course(String courseid, String coursename) {
        this.courseid = courseid;
        this.coursename = coursename;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "Course{" + "courseid=" + courseid + ", coursename=" + coursename + '}';
    }
    
}
