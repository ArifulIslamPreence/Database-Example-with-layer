package com.dbtest.DBE.Models;

public class Games {
	
	private int id;
	private String name;
	private String genre;
	private String publisher;
	private int price;
	
	public Games(int id,String name,String genre,String publisher,int price)
	{
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.publisher = publisher;
		this.price = price;
		
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public void setPublisher()
	{
		this.publisher = publisher;
	}
	public void setPrice()
	{
		this.price = price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGenre()
	{
		return genre;
	}
	public String getPublisher()
	{
		return publisher;
	}
	
	public int getPrice()
	{
		return price;
	}

}
