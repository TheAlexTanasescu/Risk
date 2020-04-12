package com.Player;
import java.util.ArrayList;
import java.util.Random;
import com.Board.Board;
import com.Board.Map.Continent;
import com.Board.Map.Country;

public class Player {
	private Alliance alliance;
	private int playerNumber;
	private String[] possibleNames = {"Jefferson Bot", "Billy Bot", "Suzan Bot", "Kong Bot", "Makenzy Bot", "Lora Bot", "Kitten Bot", "Dogo Bot", "Izzy Bot", "Poppy Bot", "Lisa Bot", "John Bot", "Callie Bot", "Shadow Bot", "Whiskers Bot", "Lily Bot", "Charlotte Bot", "Sylvester Bot", "Gamer99 Bot", "Kid Bot", "Alexander_The_Great Bot"};
	private String playerName;
	private Board board;// = new Board();
	private boolean isAI;
	private int bonusTroops;

	public Player(int playerNumber, boolean isai, Board b) {
		this.playerNumber = playerNumber;
		this.isAI = isai;
		board = new Board(b);
		setAlliance();
	}

	public Player(Player p) {
		this.playerNumber = p.playerNumber;
		this.isAI = p.isAI;
		this.board = p.board;
	}

	private void setAlliance() {
		switch (playerNumber) {
		case 1:
			this.alliance = Alliance.RED;
			break;
		case 2:
			this.alliance = Alliance.GREEN;
			break;
		case 3:
			this.alliance = Alliance.BLUE;
			break;
		case 4:
			this.alliance = Alliance.YELLOW;
			break;
		}
	}


	public boolean isDefeated(Board board) {
		boolean defeated = true;
		for (Continent cont : board.getContinents()) {
			for (Country c : cont.getCountries()) {
				if (c.getPlayerOccupantOfCountry() == this.playerNumber) {
					return false;
				}
			}
		}
		return defeated;
	}
	
	
	public boolean equals(Player p) {
		return this.getPlayerNumber() == p.getPlayerNumber();
	}
	
	public Alliance getAlliance() {
		return alliance;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public void setPlayerNumber(int i) {
		this.playerNumber = i;
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String name) {
		if(isAI == true) {
			Random r = new Random();
			playerName = new String(possibleNames[r.nextInt(possibleNames.length)]);
		}
		else {
			playerName = name;
		}
	}

	public String getPlayerName(int PlayerNumber) {
		return playerName;
	}

	public boolean getIsAI() {
		return isAI;
	}

	public void setBonusTroops(int n) {
		this.bonusTroops = n;
	}
	
	public int getBonusTroops() {
		return bonusTroops;
	}
	
	public void subtractBonusTroops(int numToSubtract) {
		bonusTroops -= numToSubtract;
	}
	
	public Country getCountryToAddTroops(Board b, ArrayList<Country> c) {
		ArrayList<Continent> continents = b.getContinents();
		int num1 = 0;
		Random random = new Random();
		Continent contWithMostTroops = continents.get(0);
		Country temp = contWithMostTroops.getCountries().get(random.nextInt(contWithMostTroops.getCountries().size()));
		while(temp.getPlayerOccupantOfCountry() != this.playerNumber) {
			for(Continent cont : continents) {
				int contTroopNum = 0;
				for(Country country : cont.getCountries()) {
					if(country.getPlayerOccupantOfCountry() == this.playerNumber) {
						contTroopNum = contTroopNum + country.getNumTroops();
					}
					if(contTroopNum > num1) {
						contWithMostTroops = cont;
						num1 = contTroopNum;
					}
				}
				temp = contWithMostTroops.getCountries().get(random.nextInt(contWithMostTroops.getCountries().size()));
			}
		}
		return temp;
	}

	public boolean getAttackChoice(Board b, ArrayList<Country> c) {
		ArrayList<Continent> continents = b.getContinents();
		for(Continent cont : continents) {
			for(Country country : cont.getCountries()) {
				if(country.getPlayerOccupantOfCountry() == this.playerNumber) {
					ArrayList<Country> borders = country.getBorders();
					for(Country bord : borders) {
						if(country.getNumTroops() > bord.getNumTroops() + bord.getNumTroops() * 0.25) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public Country getCountryToAttackFrom(Board b, ArrayList<Country> c) {
		ArrayList<Continent> continents = b.getContinents();

		for(Continent cont : continents) {
			for(Country country : cont.getCountries()) {
				if(country.getPlayerOccupantOfCountry() == this.playerNumber) {
					ArrayList<Country> borders = country.getBorders();
					for(Country bord : borders) {
						if(country.getNumTroops() > bord.getNumTroops() + bord.getNumTroops() * 0.25) {
							System.out.println(country.getName());
							return country;
						}
					}
				}
			}
		}
		return null;
	}

	public Country getCountryToAttack(Board b, ArrayList<Country> c) {
		ArrayList<Continent> continents = b.getContinents();

		for(Continent cont : continents) {
			for(Country country : cont.getCountries()) {
				if(country.getPlayerOccupantOfCountry() == this.playerNumber) {
					ArrayList<Country> borders = country.getBorders();
					for(Country bord : borders) {
						if(country.getNumTroops() > bord.getNumTroops() + bord.getNumTroops() * 0.25) {
							System.out.println(bord.getName());
							return bord;
						}
					}
				}
			}
		}
		return null;
	}
}
