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
public class Attendance {
    private String studentid;
    private int session ;
    private String status;
    private Date recordtime;
    private String comment;

    public Attendance() {
    }

    public Attendance(String studentid, int session, String status, Date recordtime, String comment) {
        this.studentid = studentid;
        this.session = session;
        this.status = status;
        this.recordtime = recordtime;
        this.comment = comment;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Attendance{" + "studentid=" + studentid + ", session=" + session + ", status=" + status + ", recordtime=" + recordtime + ", comment=" + comment + '}';
    }
    
    
}
