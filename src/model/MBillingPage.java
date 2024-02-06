/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class MBillingPage {
    ResultSet rst;
    
    public ResultSet searchById(String book_id)
    {
        
        try
        {
            Statement st=MyDatabaseConnection.getMyConnection().createStatement();
            rst=st.executeQuery("select bname,price from book_table where book_id='"+book_id+"' ");
            
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rst;
    }
    public PreparedStatement insertSales(String proid,int qty,float tot)
    {
        PreparedStatement pstmt=null;
        try{
            Connection con= MyDatabaseConnection.getMyConnection();
            String sql=("insert into book_table values('"+proid+"','"+qty+"','"+tot+"')");
            pstmt=con.prepareStatement(sql);
            }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return pstmt;
            
        
    }
    }
    
    


