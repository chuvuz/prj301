/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vu
 */
public class Group {
    private int groupid;
    private String groupname;
    private String lectureid;
    private String courseid;

    public Group() {
    }

    public Group(int groupid, String groupname, String lectureid, String courseid) {
        this.groupid = groupid;
        this.groupname = groupname;
        this.lectureid = lectureid;
        this.courseid = courseid;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getLectureid() {
        return lectureid;
    }

    public void setLectureid(String lectureid) {
        this.lectureid = lectureid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return "Group{" + "groupid=" + groupid + ", groupname=" + groupname + ", lectureid=" + lectureid + ", courseid=" + courseid + '}';
    }
    
}
