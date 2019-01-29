package com.dbtest.DBE.Controller;

import java.util.List;

import com.dbtest.DBE.Models.Games;
import com.dbtest.DBE.View.GameView;
import com.dbtest.DBE.View.GameViewImplemented;

public class GameController {
	
	Games game;
	GameView gmvw = new GameViewImplemented();
	
	public boolean insertGameController(String name,String genre,String publisher,int price)
	{
		game = new Games( name,genre,publisher,price);
		return gmvw.insertGameView(game);
	
	}
	
	public boolean updatetGameController(int id,String name,String genre,String publisher,int price)
	{
		game = new Games( name,genre,publisher,price);
		return gmvw.updateGameView(game);
	
	}
	
	public boolean deleteGameController(int id)
	{
		return gmvw. deleteGameView( id);
	}
	
	public List<Games>viewAllGamesController()
	{
		return gmvw.allGamesView();
	}
	public List<Games>viewSpecificGamesController(int id)
	{
		return gmvw.specificGameView(id);
	}
	
	public List<Games>getMaxPriceController()
	{
		return gmvw.getMaxPriceView();
	}
	public List<Games>getMinPriceController()
	{
		return gmvw.getMinPriceView();
	}

}
