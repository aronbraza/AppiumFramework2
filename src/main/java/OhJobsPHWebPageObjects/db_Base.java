package OhJobsPHWebPageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_Base {
	public Connection con ;
	
	public String  dbUrl = "jdbc:mysql://wogbetadb-do-user-715921-0.db.ondigitalocean.com:25060/db_ohjobs_ph2020";					


	public String username = "wogadmin";	
    

	public String password = "adminadmin123";
	
	public Connection dbConnection(String dbURL, String username, String password) throws SQLException
	{
		return con= DriverManager.getConnection(dbUrl,username,password);
	}
}
