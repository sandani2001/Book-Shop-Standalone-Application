/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;
public class MAddUpdateBook {
  ResultSet rst;
public void saveBookdetails(String bcode, String bname,String author,String category,Float price,int qty)
    
    {
        try{
            Statement st=MyDatabaseConnection.getMyConnection().createStatement();
            int rowcount=st.executeUpdate("insert into book_table values('"+bcode+"','"+bname+"','"+author+"','"+category+"','"+price+"','"+qty+"')");
            if(rowcount>0)
            {
                JOptionPane.showMessageDialog(null,"successfully submitted");
                
            }
        }
            catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        
        
    }
public ResultSet searchById(String book_id)
    {
        
        try
        {
            Statement st=MyDatabaseConnection.getMyConnection().createStatement();
            rst=st.executeQuery("select bname,author,category,price,qty from book_table where book_id='"+book_id+"' ");
            
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rst;
    }
public void updateBookdetails(String bcode, String bname,String author,String category,Float price,int qty)
{
    
    
    try {
        PreparedStatement pst = MyDatabaseConnection.getMyConnection().prepareStatement(
                "UPDATE book_table SET bname=?, author=?, category=?, price=?, qty=? WHERE book_id=?"
        );
        pst.setString(1, bname);
        pst.setString(2, author);
        pst.setString(3, category);
        pst.setFloat(4, price);
        pst.setInt(5, qty);
        pst.setString(6, bcode);

        int updatedRows = pst.executeUpdate();
        if (updatedRows > 0) {
            JOptionPane.showMessageDialog(null, "Successfully updated");
        } else {
            JOptionPane.showMessageDialog(null, "No record found with the given book code");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
}