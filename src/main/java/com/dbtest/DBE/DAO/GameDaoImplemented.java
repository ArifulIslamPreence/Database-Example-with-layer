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
	

	public boolean insertGame(Games game) {
		
		return opdb.insert(game);
	}

	public boolean updateGame(Games game)  {
		// TODO Auto-generated method stub
		return opdb.update(game);
	}

	@Override
	public boolean deleteGame(int id)  {
		// TODO Auto-generated method stub
		return opdb.delete(id);
	}

	
	@SuppressWarnings("unchecked")
	public List<Games> viewAllGame() {
		try{// TODO Auto-generated method stub
		ResultSet rs = opdb.viewAll();
		List<Games> gamelist = new ArrayList<>(); 
		
		if(rs == null)
		{
			return null;
		}
		
		
	 while(rs.next())
		 {
			 
		 
			 game =  new Games(rs.getString("name"),rs.getString("genre"),rs.getString("publisher"),
					 							rs.getInt("price"));
			 gamelist.add(game);
		 }
	  return gamelist;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;	 
		
	}
	

	@Override
	public List<Games> viewSpecificGame(int id) {
		// TODO Auto-generated method stub
		try {
		ResultSet rs = opdb.viewSpecific(id);
		List<Games> gamelist = new ArrayList<>();
		
		if(rs == null)
			return null;
	
		while(rs.next())
		{
			 game =  new Games(rs.getString("name"),rs.getString("genre"),rs.getString("publisher"),
						rs.getInt("price"));
			 game.setId(rs.getInt("id"));
			 gamelist.add(game);			 
			 
		}
		return gamelist;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
		
		
	}

	@Override
	public List<Games> getMaxPrice() {
		// TODO Auto-generated method stub
		try{// TODO Auto-generated method stub
			ResultSet rs = opdb.getMaxPrice();
			List<Games> gamelist = new ArrayList<>(); 
			
			if(rs == null)
			{
				return null;
			}
			
			
		 while(rs.next())
			 {
				 
			 
				 game =  new Games(rs.getString("name"),rs.getString("genre"),rs.getString("publisher"),
						 							rs.getInt("price"));
				 gamelist.add(game);
			 }
		  return gamelist;
			}catch (Exception e) {
				// TODO: handle exception
			}
			return null;	 
			
		}
	
	

	@Override
	public List<Games> getMinPrice() {
		// TODO Auto-generated method stub
		try{// TODO Auto-generated method stub
			ResultSet rs = opdb.getMinPrice();
			List<Games> gamelist = new ArrayList<>(); 
			
			if(rs == null)
			{
				return null;
			}
			
			
		 while(rs.next())
			 {
				 
			 
				 game =  new Games(rs.getString("name"),rs.getString("genre"),rs.getString("publisher"),
						 							rs.getInt("price"));
				 gamelist.add(game);
			 }
		  return gamelist;
			}catch (Exception e) {
				// TODO: handle exception
			}
			return null;	 
			
		}
	}


