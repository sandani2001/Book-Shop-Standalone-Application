/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MBillingPage;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class CBillingPage {
    ResultSet rst;
    PreparedStatement pstmt;
    
    public ResultSet searchById(String book_id)
    {
        MBillingPage mbilling = new MBillingPage();
        rst=mbilling.searchById(book_id);
        return rst;
    }
    public PreparedStatement insertSales(String proid,int qty,float tot){
        MBillingPage mbill=new MBillingPage();
        pstmt= mbill.insertSales(proid,qty,tot);
        return pstmt;
    }

   
}
