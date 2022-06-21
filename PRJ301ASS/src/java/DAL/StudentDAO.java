/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vu
 */
public class StudentDAO extends DBContext1 {

    public List<Student> getAll() {
        List<Student> lists = new ArrayList<>();

        String sql = " select * from  Student";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setStudentId(rs.getInt(1));
                s.setStudentName(rs.getString(2));
                s.setStudentCode(rs.getString(3));
                s.setGroupName(rs.getString(4));
                lists.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;

    }

    public static void main(String[] args) {
        StudentDAO s = new StudentDAO();
        List<Student> s1 = s.getAll();
        for (Student student : s1) {
            System.out.println(student);
        }

    }
}
