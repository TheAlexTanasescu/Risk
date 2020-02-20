package com.Player;

public class Player {
	private Alliance alliance;
	private int playerNumber;
	// private string playerName?

	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
		setAlliance();
	}

	public Player(Player p) {
		this.playerNumber = p.playerNumber;
	}

	private void setAlliance() {
		switch (playerNumber) {
		case 1:
			this.alliance = Alliance.RED;
		case 2:
			this.alliance = Alliance.BLUE;
		case 3:
			this.alliance = Alliance.GREEN;
		case 4:
			this.alliance = Alliance.YELLOW;
		}
	}

	public int getTroopBonus() {
		return 0;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public boolean compareplayerNumber(Player p) {
		return this.getPlayerNumber() == p.getPlayerNumber();
	}
	
	

}
