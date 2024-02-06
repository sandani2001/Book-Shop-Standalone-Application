/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MAddUpdateBook;
import java.sql.ResultSet;

public class CAddUpdateBook {
    ResultSet rst;
    public void saveBookdetails(String bcode, String bname,String author,String category,Float price,int qty)
    {
        MAddUpdateBook mAddbook=new MAddUpdateBook();
        mAddbook.saveBookdetails(bcode,bname,author,category,price,qty);
        
    }
    public ResultSet searchById(String book_id)
    {
        MAddUpdateBook msrch = new MAddUpdateBook();
        rst=msrch.searchById(book_id);
        return rst;
    }
    public void updateBookdetails(String bcode, String bname,String author,String category,Float price,int qty)
    {
        MAddUpdateBook mUpdatebook=new MAddUpdateBook();
        mUpdatebook.updateBookdetails(bcode,bname,author,category,price,qty);
    }
    
}
