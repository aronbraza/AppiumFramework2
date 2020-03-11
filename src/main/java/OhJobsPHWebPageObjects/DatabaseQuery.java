package OhJobsPHWebPageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseQuery extends db_Base {
	
	public static Statement stmt;
	public static ResultSet rs;
	
	
	
	
	public  int getIDEmployer(String columnName) throws SQLException, ClassNotFoundException
	{
					
			int id = 0;
			String query = "SELECT * FROM `tbl_information` WHERE `email` = '"+columnName+"'";
			 stmt = dbConnection().createStatement();						
	 		 rs= stmt.executeQuery(query);							
			System.out.println("Successfully get the ID of "+columnName+" on the tbl_user.");
			while (rs.next())
			{
		       id = rs.getInt("ID");
	        }		
					
			dbConnection().close();
				return id;
	}
	
	public  int getIDJob(String columnName) throws SQLException, ClassNotFoundException
	{
					
			int id = 0;
			String query = "SELECT * FROM tbl_jobs WHERE title = '"+columnName+"'";
			stmt = dbConnection().createStatement();						
	 		rs= stmt.executeQuery(query);							
			while (rs.next())
			{
		       id = rs.getInt("ID");
	        }		
			System.out.println("The id of the "+columnName+" is "+id+"");		
			dbConnection().close();
				return id;
	}
	
	public int getIDJobseeker(String columnName) throws SQLException
	{
		int id = 0;
		String query = "SELECT * FROM tbl_user WHERE user_email = '"+columnName+"'";
		stmt = dbConnection().createStatement();
		rs = stmt.executeQuery(query);
		while(rs.next())
		{
			id = rs.getInt("ID");
		}
		System.out.println("The id of the "+columnName+" is "+id+"");
		dbConnection().close();
		return id;
	}
	
	public void deleteQueryJobseekerAccount(String email, int id) throws ClassNotFoundException, SQLException
	{
			String query = "DELETE FROM tbl_user WHERE user_email = '"+email+"'";
			String queryMeta = "DELETE FROM tbl_jobsmeta WHERE ID = "+id+"";
		    stmt = dbConnection().createStatement();
			stmt.executeUpdate(query);
			stmt.executeUpdate(queryMeta);
			System.out.println("Successfully deleted Email Address: "+email+" on the tbl_user.");
			System.out.println("Successfully deleted ID: "+id+" on the tbl_usermeta.");
			dbConnection().close();
	}
	
	public void deleteQueryJob(String jobTitle, int id) throws SQLException
	{
		String query = "DELETE FROM tbl_jobs WHERE title = '"+jobTitle+"'";
		String queryMeta = "DELETE FROM tbl_jobsmeta WHERE ID = "+id+"";
		stmt = dbConnection().createStatement();
		stmt.executeUpdate(query);
		stmt.executeUpdate(queryMeta);
		System.out.println("Successfully deleted Job Title: "+jobTitle+" on the tbl_jobs");
		System.out.println("Successfully deleted ID: "+id+" on the tbl_jobsmeta");
		dbConnection().close();
	}
	
	public void deleteQueryEmployerAccount(String email, int id) throws ClassNotFoundException, SQLException
	{
			String query = "DELETE FROM tbl_information WHERE email = '"+email+"'";	
			String queryMeta = "DELETE FROM tbl_informationmeta WHERE `ID` = '"+id+"'";	
		    stmt = dbConnection().createStatement();					
			stmt.executeUpdate(query);	
			stmt.executeUpdate(queryMeta);	
			System.out.println("Successfully deleted Email Address: "+email+" on the tbl_information.");
			System.out.println("Successfully deleted ID: "+id+" on the tbl_informationmeta.");	
			dbConnection().close();
	}


}
