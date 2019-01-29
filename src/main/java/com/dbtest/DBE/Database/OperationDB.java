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
	Statement st;
	
	public boolean insert(Games game)
	{
		try (PreparedStatement ps= conn.MainConnection().prepareStatement("INSERT INTO Ariful_Gamelist(name,genre,publisher,price)"
				+"VALUES(?,?,?,?)"))
		{
		
			
			
			ps.setString(1,game.getName() );
			ps.setString(2, game.getGenre());
			ps.setString(3, game.getPublisher());
			ps.setInt(4, game.getPrice());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		
		return false;
		}
	
		
	}
	
	public boolean update(Games game) 
	{
		try(PreparedStatement ps= conn.MainConnection().prepareStatement(
				"UPDATE Ariful_Gamelist SET name = ?,genre = ?,publisher = ? price = ? WHERE id = ?"))
		{
			
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
		
	 }
	
	public boolean delete(int id)
	{
			
		
			try(PreparedStatement ps = conn.MainConnection().prepareStatement(
										"DELETE FROM Ariful_Gamelist  WHERE id = "+id+";")) {
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
			
			return true;
		
			
			
	 }
	
	public  ResultSet viewAll()
	{
		
		ResultSet rs;
		try(Statement st = conn.MainConnection().createStatement()) 
		{
	
		rs = st.executeQuery("SELECT * FROM Ariful_Gamelist");
		
		}catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		return rs;
	}
		
	public ResultSet viewSpecific(int id)
		{
			try (Statement st = conn.MainConnection().createStatement())
			{
			
			ResultSet rs = st.executeQuery("SELECT * FROM Ariful_Gamelist WHERE id = "+id+";");
			
			return rs;
			
			}catch(SQLException e)
			{
				e.printStackTrace();
				return null;
			}
			
	
		}
	
	public ResultSet getMaxPrice()
	{
		try(Statement st = conn.MainConnection().createStatement())
		{
			
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
		try(Statement st = conn.MainConnection().createStatement())
		{
			
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
