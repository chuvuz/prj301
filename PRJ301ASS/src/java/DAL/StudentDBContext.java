/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Attendance;
import Model.Course;
import Model.Group;
import Model.Lecture;
import Model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vu
 */
public class StudentDBContext extends DBContext {

    public List<Student> getAll() {
        List<Student> lists = new ArrayList<>();

        try {
            String sql = "SELECT StudentID,StudentCode,StudentSurname,StudentMiddlename,StudentGivenname,StudentEmail FROM Student";
            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, "studentid");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setStudentid(rs.getString("StudentID"));
                s.setStudentcode(rs.getString("StudentCode"));
                s.setStudentsurname(rs.getString("StudentSurname"));
                s.setStudentmiddlename(rs.getString("StudentMiddlename"));
                s.setStudentgivenname(rs.getString("StudentGivenname"));
                s.setStudentmail(rs.getString("StudentEmail"));                      
                lists.add(s);
            }
        } catch (Exception e) {
            
        }
        return lists;

    }
    public static void main(String[] args) {
        StudentDBContext s1 = new StudentDBContext();
        List<Student> s = s1.getAll();
        for (Student student : s) {
            System.out.println(student);
        }
    }

}
