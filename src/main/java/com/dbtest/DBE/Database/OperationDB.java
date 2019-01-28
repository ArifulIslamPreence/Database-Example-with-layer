package com.dbtest.DBE.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;

import com.dbtest.DBE.Models.Games;



public class OperationDB 
{
	ConnectionDB conn = new ConnectionDB();
	PreparedStatement ps ;
	Statement st;
	
	public boolean insert(Games game) throws SQLException
	{
		try 
		{
			ps = conn.MainConnection().prepareStatement("INSERT INTO Ariful_Gamelist(name,genre,publisher,price)"
										+"VALUES(?,?,?,?)");
			ps.setInt(1,game.getId());
			ps.setString(2,game.getName() );
			ps.setString(3, game.getPublisher());
			ps.setInt(4, game.getPrice());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		
		return false;
		}
		finally
		{
			if(conn.MainConnection() != null)
			{
				conn.MainConnection().close();
			}
			else
			{
				System.out.print("Error");
			}
		}
		
	}
	
	public boolean update(Games game) throws SQLException
	{
		try
		{
			ps = conn.MainConnection().prepareStatement("UPDATE Ariful_Gamelist SET name = ?,genre = ?,publisher = ? price = ? WHERE id = ?");
			ps.setInt(1, game.getId());
			ps.setString(2,game.getName() );
			ps.setString(3, game.getPublisher());
			ps.setInt(4, game.getPrice());
			
			ps.executeUpdate();
			
			return true;
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
			
			return false;
			
		}
		finally
		{
			if(conn.MainConnection() != null)
			{
				conn.MainConnection().close();
			}
			else
			{
				System.out.println("Connection didnt close");
			}
		}
	 }
	
	public boolean delete(int id) throws SQLException
	{
		try
		{
			ps = conn.MainConnection().prepareStatement("DELETE FROM Ariful_Gamelist  WHERE id = "+id+";");
			
			
			ps.executeUpdate();
			
			return true;
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
			
			return false;
			
		}
		finally
		{
			if(conn.MainConnection() != null)
			{
				conn.MainConnection().close();
			}
			else
			{
				System.out.println("Connection didnt close");
			}
		}
	 }
	
	public  ResultSet viewAll() throws SQLException
	{
		try 
		{
		st = conn.MainConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Ariful_Gamelist");
		
		return rs;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			if(conn.MainConnection() != null)
			{
				conn.MainConnection().close();
			}
			else
			{
				System.out.println("Connection didnt close");
			}
			
		}
	}
		
	public ResultSet viewSpecific(int id) throws SQLException
		{
			try 
			{
			st = conn.MainConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Ariful_Gamelist WHERE id = "+id+";");
			
			return rs;
			
			}catch(SQLException e)
			{
				e.printStackTrace();
				return null;
			}
			finally
			{
				if(conn.MainConnection() != null)
				{
					conn.MainConnection().close();
				}
				else
				{
					System.out.println("Connection didnt close");
				}
				
			}
	
		}
	
	public ResultSet getMaxPrice()
	{
		try
		{
			st = conn.MainConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Ariful_Gamelist WHERE price ="
										+ " (SELECT max(price) FROM Ariful_Gamelist);");
			return rs;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	public ResultSet getMinPrice()
	{
		try
		{
			st = conn.MainConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Ariful_Gamelist WHERE price ="
										+ " (SELECT min(price) FROM Ariful_Gamelist);");
			return rs;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
		
		
	
	
	

	
	
		
	
}
