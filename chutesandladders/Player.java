package chutesandladders;

import util.Spinner;

public class Player {
	
	private int playerID;
	private String name;
	private int currentPosition;
	private boolean result;
	
	public Player() {
		this.currentPosition = 0;
		this.result = false;
	}
	
	public Player(int playerID, String name) {
		this.playerID = playerID;
		this.name = name;
		this.currentPosition = 0;
		this.result = false;		
	}
	
	
	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCurrentPosition() {
		return currentPosition;
	}
	
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	public boolean isResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	
	public int play() {		
		return Spinner.spin();
	
	}
	
	
	public String toString() {
		return this.getPlayerID() + " " + this.getName() + " " + this.getCurrentPosition();
	}

}
