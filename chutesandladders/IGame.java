package chutesandladders;

import util.Constants;

public interface IGame {

	public static final int defaultNumberOfPlayers = Constants.getTwo();
	public static final int maxNumberOfPlayers = Constants.getFour();
	
	public void playGame();
}
