package com.dbtest.DBE.View;

import java.util.List;

import com.dbtest.DBE.DAO.GameDAO;
import com.dbtest.DBE.DAO.GameDaoImplemented;
import com.dbtest.DBE.Models.Games;

public class GameViewImplemented implements GameView 
{
	GameDAO gameDAO = new GameDaoImplemented();
	public boolean insertGameView(Games game)
	{
		return gameDAO.insertGame(game);
	}
	@Override
	public boolean updateGameView(Games game) {
		// TODO Auto-generated method stub
		return gameDAO.updateGame(game);
	}
	public boolean deleteGameView(int id)
	{
		return gameDAO.deleteGame(id);
	}
	@Override
	public List<Games> allGamesView() {
		// TODO Auto-generated method stub
		return gameDAO.viewAllGame();
	}
	@Override
	public List<Games> specificGameView(int id) {
		// TODO Auto-generated method stub
		return gameDAO.viewSpecificGame(id);
	}
	@Override
	public List<Games> getMaxPriceView() {
		// TODO Auto-generated method stub
		return gameDAO.getMaxPrice();
	}
	@Override
	public List<Games> getMinPriceView() {
		// TODO Auto-generated method stub
		return gameDAO.getMinPrice();
	}

}
