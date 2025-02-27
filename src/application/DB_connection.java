package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connection {

  public static Connection connect() throws SQLException {
    Connection con = null;
    String db_name = "lms";
    String user_name = "root";
    String psw = "1234";
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name,user_name,psw);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return con;
    
  }
}