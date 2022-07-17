/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ngo Tung Son
 */
public abstract class DBContext1{

    protected Connection connection;

    public DBContext1() {
        try {
            String user = "vucq";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AttendedProject";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
}
