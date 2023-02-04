// main file 
//Note: First connect to Oracle Database. 

package package_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AuctionBackend1 {
	
	 public static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	 public static String driver = "oracle.jdbc.OracleDriver";
	 public static String user = "auction";
     public static String pass = "abc";

	public static void main(String[] args) {
    
    LoginFrame lf = new LoginFrame();
    lf.setVisible(true);
	}
	static Connection connection() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	}

}
