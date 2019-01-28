package com.dbtest.DBE.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.dbtest.DBE.Models.Games;

public interface GameDAO {

	public boolean insertGame(Games game) throws SQLException;
	public boolean updateGame(Games game) throws SQLException;
	public boolean deleteGame(int id) throws SQLException;
	List<Games> viewAllGame();
	List<Games> viewSpecific(int id);
	List <Games> getMaxPrice();
	List <Games> getMinPrice();
	
	
}
