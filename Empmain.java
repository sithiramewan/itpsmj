/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newitpsmj;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jaya
 */
public class Empmain {
        public static Connection connect(){
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpsmj?","root","");
            return conn;
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        return null;
        
        }   
}
        
        

    

