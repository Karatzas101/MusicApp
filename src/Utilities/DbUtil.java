/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUtil {
    
      private static String url = "jdbc:mysql://localhost:3306/mymusic";
      private static String user = "root";
      private static String password = "pigaspitimou1";
      
      
      
      public static Connection getConnection() {
          
          Connection con = null;
          
          try {
              con = DriverManager.getConnection( url ,user ,password);
          } catch (SQLException ex) {
              Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          return con;
      }
      
    
}
