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
    private int studentid;
    private String studentname;
    private boolean gender;

    public Student(int studentid, String studentname, boolean gender) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.gender = gender;
    }

    public Student() {
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "studentid=" + studentid + ", studentname=" + studentname + ", gender=" + gender + '}';
    }
    
}
