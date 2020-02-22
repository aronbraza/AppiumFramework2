package OhJobsPHWebPageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTestingBase {
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
			
        String dbUrl = "jdbc:mysql://wogbetadb-do-user-715921-0.db.ondigitalocean.com:25060/db_ohjobs_ph2020";					


		String username = "wogadmin";	
        

		String password = "adminadmin123";				

			
		//String query = "SELECT * FROM `tbl_information`";	
		String query = "DELETE FROM `tbl_user` WHERE `user_email` = 'wog.aron@zetmail.com'";	
		
		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		
	   Statement stmt = con.createStatement();					

		stmt.executeUpdate(query);		
 		//ResultSet rs= stmt.executeQuery(query);							
		System.out.println("Success delete.");
 /*
		while (rs.next()){
	        		String myName = rs.getString(1);								        
                    String myAge = rs.getString(2);					                               
                    System. out.println(myName+"  "+myAge);		
            }		*/
				
			con.close();	
	}


}
