package com.dbtest.DBE;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dbtest.DBE.Controller.GameController;

public class ViewData {
	
	GameController gc = new GameController();
	
	public void GameAdd() {
		Scanner stringInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		System.out.println();
		
		String name = stringInput.nextLine();
		String genre = stringInput.nextLine();
		String publisher = stringInput.nextLine();
		int price = intInput.nextInt();
		boolean insertion = gc.insertGameController( name, genre, publisher, price);
		if(insertion = false) {
			System.out.println("Insertion failed");
		}
		else {
			System.out.println("Successfully inserted");
		}
//		stringInput.close();
//		intInput.close();
	 }
	}



