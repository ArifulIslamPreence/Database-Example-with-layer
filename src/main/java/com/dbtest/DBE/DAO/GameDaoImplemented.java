package com.dbtest.DBE.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbtest.DBE.Database.OperationDB;
import com.dbtest.DBE.Models.Games;

public class GameDaoImplemented implements GameDAO{
	
	OperationDB opdb = new OperationDB();
	Games game;
	

	public boolean insertGame(Games game) throws SQLException {
		
		return opdb.insert(game);
	}

	public boolean updateGame(Games game) throws SQLException {
		// TODO Auto-generated method stub
		return opdb.update(game);
	}

	@Override
	public boolean deleteGame(int id) throws SQLException {
		// TODO Auto-generated method stub
		return opdb.delete(id);
	}

	
	@SuppressWarnings("unchecked")
	public List<Games> viewAllGame() {
		// TODO Auto-generated method stub
		ResultSet rs = OperationDB.viewAll();
		List<Games> gamelist = new ArrayList<Games>(); 
		
		if(rs != null)
		{
			return null;
		}
		
		try
		{
		 while(rs.next())
		 {
			 gamelist = (List<Games>) new Games(rs.getInt("id"),rs.getString("name"),rs.getString("genre"),rs.getString("publisher"),
					 							rs.getInt("price"));
			 gamelist.add(game);
			 
		 }catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		
		
		return gamelist;
	}

	@Override
	public List<Games> viewSpecific(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Games> getMaxPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Games> getMinPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
