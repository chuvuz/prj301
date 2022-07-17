/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vu
 */
public class Student {

    private String studentid;
    private String studentcode;
    private String studentname;
    private String studentmiddlename;
    private String studentgivenname;
    private String studentmail;

    public Student() {
    }

    public Student(String studentid, String studentcode, String studentname, String studentmiddlename, String studentgivenname, String studentmail) {
        this.studentid = studentid;
        this.studentcode = studentcode;
        this.studentname = studentname;
        this.studentmiddlename = studentmiddlename;
        this.studentgivenname = studentgivenname;
        this.studentmail = studentmail;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentmiddlename() {
        return studentmiddlename;
    }

    public void setStudentmiddlename(String studentmiddlename) {
        this.studentmiddlename = studentmiddlename;
    }

    public String getStudentgivenname() {
        return studentgivenname;
    }

    public void setStudentgivenname(String studentgivenname) {
        this.studentgivenname = studentgivenname;
    }

    public String getStudentmail() {
        return studentmail;
    }

    public void setStudentmail(String studentmail) {
        this.studentmail = studentmail;
    }

    @Override
    public String toString() {
        return "Student{" + "studentid=" + studentid + ", studentcode=" + studentcode + ", studentname=" + studentname + ", studentmiddlename=" + studentmiddlename + ", studentgivenname=" + studentgivenname + ", studentmail=" + studentmail + '}';
    }
    
    

}
