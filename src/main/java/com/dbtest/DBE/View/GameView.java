package com.dbtest.DBE.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.dbtest.DBE.Models.Games;

import java.lang.*;



public interface GameView {
	
	boolean insertGameView(Games game);
	boolean updateGameView(Games game);
	List<Games>allGamesView();
	List<Games>specificGameView(int id);
	List<Games>getMaxPriceView();
	List<Games>getMinPriceView();
	boolean deleteGameView(int id);

}
