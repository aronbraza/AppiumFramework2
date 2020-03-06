package OhJobsPHWebPageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_Base {
	public static Connection con ;
	
	public static String dbUrl = "jdbc:mysql://ohjobsphdb-do-user-715921-0.db.ondigitalocean.com:25060/db_ohjobs_beta";					


	public static String username = "wogadmin";	
    

	public static String password = "adminadmin123";
	
	public static Connection dbConnection() throws SQLException
	{
		return con= DriverManager.getConnection(dbUrl,username,password);
	}
}
