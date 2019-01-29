package com.dbtest.DBE.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.dbtest.DBE.Models.Games;

public interface GameDAO {

	public boolean insertGame(Games game) ;
	public boolean updateGame(Games game);
	public boolean deleteGame(int id);
	List<Games> viewAllGame() ;
	List<Games> viewSpecificGame(int id);
	List <Games> getMaxPrice();
	List <Games> getMinPrice();
	
	
}
