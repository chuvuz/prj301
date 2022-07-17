/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author vu
 */
public class Session {

    private int sessionid;
    private int sessionnumber;
    private Date sessiondate;
    private String semester;
    private String groupid;
    private int lectureid;

    public Session() {
    }

    public Session(int sessionid, int sessionnumber, Date sessiondate, String semester, String groupid, int lectureid) {
        this.sessionid = sessionid;
        this.sessionnumber = sessionnumber;
        this.sessiondate = sessiondate;
        this.semester = semester;
        this.groupid = groupid;
        this.lectureid = lectureid;
    }

    public int getSessionid() {
        return sessionid;
    }

    public void setSessionid(int sessionid) {
        this.sessionid = sessionid;
    }

    public int getSessionnumber() {
        return sessionnumber;
    }

    public void setSessionnumber(int sessionnumber) {
        this.sessionnumber = sessionnumber;
    }

    public Date getSessiondate() {
        return sessiondate;
    }

    public void setSessiondate(Date sessiondate) {
        this.sessiondate = sessiondate;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public int getLectureid() {
        return lectureid;
    }

    public void setLectureid(int lectureid) {
        this.lectureid = lectureid;
    }

    @Override
    public String toString() {
        return "Session{" + "sessionid=" + sessionid + ", sessionnumber=" + sessionnumber + ", sessiondate=" + sessiondate + ", semester=" + semester + ", groupid=" + groupid + ", lectureid=" + lectureid + '}';
    }
    
    
}
