package com.Board;

import java.util.ArrayList;

import com.Board.Console.Console;
import com.Board.Map.Continent;
import com.Board.Map.Country;
import com.Board.Map.Map;
import com.Player.Player;


public class Board {
	private ArrayList<Continent> continents;
	private ArrayList<Player> players;
	private Console console;
	private Player currentPlayer;
	private int numAI;
	private Map earthMap;
	//Create Dice??
	
	public Board() {
		players  = new ArrayList<Player>();
		console = new Console();
		earthMap = new Map();
		
		initializePlayers();
						
		
	}
	
	private void createBoard() {
		
	}
	
	/**
	 * Return ArrayList of Players
	 * @return
	 */
	public ArrayList<Player> getPlayers() {
		ArrayList<Player> player = new ArrayList<Player>();
		for(Player p: players) {
			player.add(new Player(p));
		}
		return player;
	}

	
	public void playerTurn(Player p) {
		currentPlayer = new Player(p);
		console.println("----------------------- Player " + currentPlayer.getPlayerNumber() + " -----------------------");
		draft();
		attack();
		fortify();
		endTurn(); //Useful??
	}

	//TO DO
	private void printBoardState() {
		/*
		 Prints out current state of the board.
		 for (continent: continents)
		 	for (country: countries) prints players troops on each country/continent		  
		 */
	}
	
	
	//TO DO
	private void draft() {
		printBoardState();
		console.println("--------- Draft ---------");
		int bonusTroops = currentPlayer.getTroopBonus();
		console.println("Player " + currentPlayer.getPlayerNumber() + " has " + bonusTroops + " bonus troops.");
		//option to trade in cards --------TO BE IMPLEMENTED
		//console will print out available countries for player to draft troops(Console)--------TO BE IMPLEMENTED
		console.println("Where would you like to place your troops?");

		
	}

	
	//TO DO
	private void attack() {
		printBoardState();
		console.println("--------- Attack ---------");
		/* console will print out the players occupied countries(Console) -----------Maybe?
		 * console will prompt: Which country would you like to attack from?(Console)
		 * After user input, print out borders of chosen country(Console)
		 * console will prompt: Which country would you like to attack? (Console)
		 * console will prompt: [blitz] [normal] etc...  (Console)
		 * attackingFromCountry.attack(countryBeingAttacked)
		 * If not conquered. Console prompt: attack again?
		 * console prompt: option to move troops (Console)
		 * moveTroops(moveToCountryConquered) --------- (Board/Country) ??
		 * 
		 * TO BE CONTINUED
		 */
		
	}

	// TO DO
	private void fortify() {
		printBoardState();
		console.println("--------- Fortify ---------");
		
		
	}

	// TO DO
	private void endTurn() {
		printBoardState();				
	}
	
	//TO DO
	public void moveTroops(){}
	
	public void initializePlayers() {
		int numPlayers = console.getScannerNumOfPlayers();
		numAI = 4 - numPlayers;
		
		for (int i = 0; i < numPlayers; i ++) {			
			players.add(new Player(i));
		}
		
		currentPlayer = new Player(players.get(0));
	}
	
	public ArrayList<Country> getPlayerCountries(Player p) {
		ArrayList<Country> playerCountries = new ArrayList<Country>();
		
		return null;
		
	}
	
}
