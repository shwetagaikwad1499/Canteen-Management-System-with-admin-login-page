/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */

import java.sql.*;
import javax.swing.*;

public class ConnectionCMS {
    Connection conn= null;
    public static Connection ConnecrDb(){
    
    try{
    Class.forName("org.sqlite.JDBC");
    
    Connection conn = DriverManager.getConnection("jdbc:sqlite:CMSdb.sqlite");
    //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\bapon\\Documents\\NetBeansProjects\\CMS\\CMSdb.sqlite");
    //JOptionPane.showMessageDialog(null, "Connection Established");C:\\Users\\bapon\\Documents\\NetBeansProjects\\CMS
    return conn;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       return null;
       
       }
    
    }
}
