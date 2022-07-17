/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vu
 */
public class StudentGroup {
    private String studentid;
    private int groupid;

    public StudentGroup() {
    }

    public StudentGroup(String studentid, int groupid) {
        this.studentid = studentid;
        this.groupid = groupid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    @Override
    public String toString() {
        return "StudentGroup{" + "studentid=" + studentid + ", groupid=" + groupid + '}';
    }
    
    
}
