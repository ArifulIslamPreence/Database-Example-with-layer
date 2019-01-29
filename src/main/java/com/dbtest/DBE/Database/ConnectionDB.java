package com.dbtest.DBE.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;	

public class ConnectionDB {
	
	private static Connection conn;
	
	public Connection MainConnection()
	{
		try
		{
			conn =  DriverManager.getConnection("jdbc:sqlserver://VNTDACWSSQLD002:1433;databaseName=DEV_TEST;"
					+ "user = dev_test_dbo;password = dev_test_dbo123");
			
			if(conn != null )
			{
				System.out.println("Connected");
			}
			else
			{
				System.out.println("Not connected");
			}
			return conn;
			
		}catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		return conn;
		
	}
	

}
