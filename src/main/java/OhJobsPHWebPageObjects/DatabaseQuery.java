package OhJobsPHWebPageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseQuery extends db_Base {
	
	public static Statement stmt;
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		System.out.println(getID("info@weboutsourcing-gateway.com"));
	}
	
	
	public static int getID(String email) throws SQLException, ClassNotFoundException
	{
					
			int id = 0;
			String query = "SELECT * FROM `tbl_information` WHERE `email` = '"+email+"'";
			 stmt = dbConnection().createStatement();						
	 		ResultSet rs= stmt.executeQuery(query);							
			System.out.println("Successfully get the ID of "+email+" on the tbl_user.");
			while (rs.next())
			{
		       id = rs.getInt("ID");
	        }		
					
			dbConnection().close();
				return id;
	}
	
	public void deleteQuery(String email) throws ClassNotFoundException, SQLException
	{
			String query = "DELETE FROM `tbl_user` WHERE `user_email` = '"+email+"'";	
		    stmt = dbConnection().createStatement();
			stmt.executeUpdate(query);				
			System.out.println("Successfully deleted "+email+" on the tbl_user.");
			dbConnection().close();
	}
	
	public void deleteQuerySignUpEmployer(String email, int id) throws ClassNotFoundException, SQLException
	{
			String query = "DELETE FROM `tbl_information` WHERE `email` = '"+email+"'";	
			String queryMeta = "DELETE FROM `tbl_informationmeta` WHERE `ID` = '"+id+"'";	
		    stmt = dbConnection().createStatement();					
			stmt.executeUpdate(query);	
			stmt.executeUpdate(queryMeta);	
			System.out.println("Successfully deleted "+email+" on the tbl_information.");
			System.out.println("Successfully deleted "+id+" on the tbl_informationmeta.");	
			dbConnection().close();
	}


}
