/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vu
 */
public class Lecture {
    private String lectureid;
    private String lecturename;
    private String lectureemail;

    public Lecture() {
    }

    public Lecture(String lectureid, String lecturename, String lectureemail) {
        this.lectureid = lectureid;
        this.lecturename = lecturename;
        this.lectureemail = lectureemail;
    }

    public String getLectureid() {
        return lectureid;
    }

    public void setLectureid(String lectureid) {
        this.lectureid = lectureid;
    }

    public String getLecturename() {
        return lecturename;
    }

    public void setLecturename(String lecturename) {
        this.lecturename = lecturename;
    }

    public String getLectureemail() {
        return lectureemail;
    }

    public void setLectureemail(String lectureemail) {
        this.lectureemail = lectureemail;
    }

    @Override
    public String toString() {
        return "Lecture{" + "lectureid=" + lectureid + ", lecturename=" + lecturename + ", lectureemail=" + lectureemail + '}';
    }
    
}
