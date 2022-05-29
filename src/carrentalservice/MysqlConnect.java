/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalservice;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user pc
 */
public class MysqlConnect  {
    
    Connection con =null;
    public static Connection Connectdb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pickacar","root",null);
            JOptionPane.showMessageDialog(null,"connected to Database");
            return conn;
            
            
            
            
            
            
            
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"connected to Database");
          return null;
        }
        
        
        
        
    }
    
    
}
