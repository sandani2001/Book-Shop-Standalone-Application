
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class MyDatabaseConnection {
    static Connection con;
    public static Connection getMyConnection()
    {
        try{
            String dbpath="jdbc:mysql://localhost/book_shop";
            con=DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return con;
    
    }
}
