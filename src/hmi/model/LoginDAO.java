package hmi.model;

import java.sql.*;
import java.sql.SQLException;

import application.DB_connection;


public class LoginDAO {
  public static boolean check_credential(String user_name,String psw) throws SQLException {
    Connection con = null;
    try {
      con = DB_connection.connect();
      if (con != null ) {
        System.out.println("Conneciton Successful!");
        System.out.println(user_name);
        String sql = "select * from users where user_name like ? and password like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, user_name);
        stmt.setString(2, psw);
        ResultSet r_set = stmt.executeQuery();
        if (r_set.next()) {
          return true;
        }
        else {
          return false;          
        }
        
      }
    }
    catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return false;
    
  }
}