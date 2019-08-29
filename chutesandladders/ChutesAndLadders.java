package chutesandladders;

public class ChutesAndLadders {

public static void main(String[] args) throws Exception {
		
		if(args == null || args.length == 0) {
			throw new Exception("At least 2 player names need to be provided at command line to begin the game!!");
		}
		
		IGame game = Game.gameFactory(args);
		
		try {
			game.playGame();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
