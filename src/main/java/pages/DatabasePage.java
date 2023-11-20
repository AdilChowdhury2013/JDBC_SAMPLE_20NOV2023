package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	Connection connection; //interface 1
	Statement statement;   //interface 2
	ResultSet resultSet;   //interface 3
	String columnValue;
	
	public String getDataFromDb(String columnName) {
	
		
		try {
			//set properties for mysql with the jdbc path from Dbeaver connection setting 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String sqlUrl= "jdbc:mysql://44.195.13.80:3306/april_2023";
			//String sqlUrl= "jdbc:mysql:// hostname+: port number+/databaseName";
			//jdbc:mysql://by default
			
			String sqlUserName= "student";
			//username from DBeaver
			String sqlPassword= "Student@123";
			//username from DBeaver
			String sqlQuery= "Select * from users";
			//unique sql command
			
			connection= DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassword);
			//create connection to the required database
			 
			statement=connection.createStatement();
			//empower connection to the reference variable to execute queries
			
			resultSet=statement.executeQuery(sqlQuery);
			//execute the queries
			
			while(resultSet.next()) {
			columnValue= resultSet.getString(columnName);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			if (resultSet!= null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (connection!=null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return columnValue;
		
	}
		
	 

}
