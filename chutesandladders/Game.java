package chutesandladders;

public class Game implements IGame {
	
private static Game game = null;
	
	private static int numberOfPlayers;
	private static Player[] players;
	
	private static int numberOfTurns = 0; 
	
	
	private Game() { 
		
	}
	
	
	private Game(String[] listOfPlayers) throws Exception {
		
		if(listOfPlayers == null || listOfPlayers.length == 0) {
			throw new Exception("At least 2 player names need to be provided at command line to begin the game!!");
		}
		
		numberOfPlayers = listOfPlayers.length;
		
				
		if(numberOfPlayers > maxNumberOfPlayers) {
			throw new Exception("More than 4 players are not allowed!!");
		} else if(numberOfPlayers < defaultNumberOfPlayers) {
			throw new Exception("There has to be at least two players to begin the game!!");
		}
		
		
		players = new Player[numberOfPlayers];
		
		for(int i = 0; i < numberOfPlayers; i++) {
			players[i] = new Player(i + 1, listOfPlayers[i]);			
		}
		
		
		Board.setUpBoard();
	}
	
	
	public static Game gameFactory(String[] playerNames) throws Exception {
		if(game != null) {
			return game;
		} else {
			synchronized(Game.class) {
				game = new Game(playerNames);
			}
			return game;
		}
	}
	
	
	public void playGame() {
		
		boolean foundWinner = false; 
		
		while(!foundWinner) {
			
			for(Player player : players) {
				
				if(player != null) {
					
					numberOfTurns++; 
					
					int currentPosition = player.getCurrentPosition();
					System.out.print(player.getName());
					int spinResult = player.play(); 
					int newPosition = currentPosition + spinResult;
					
					System.out.print(numberOfTurns + ": " + player.getName() + ": " + currentPosition + " --> " + newPosition);
					
					if(newPosition > 100) {
						System.out.print(" <==> " + newPosition + " > 100. Score exactly 100 to WIN!!\n\n");
						continue;
					} else {
						
						
						if(newPosition < 100 && Board.squares[newPosition].getChute() != null) {
							
							
							
							int bottomPos = Board.squares[newPosition].getChute().slide(newPosition);
														
							System.out.print(" -- CHUTE --> " + bottomPos);
							
							newPosition = bottomPos;
						}
						
						
						if(newPosition < 100 && Board.squares[newPosition].getLadder() != null) {
							
							
							
							int topPos = Board.squares[newPosition].getLadder().climb(newPosition);
														
							System.out.print(" -- LADDER --> " + topPos);
							
							newPosition = topPos;
						}						
						
						player.setCurrentPosition(newPosition);
						System.out.println("\n"); 						
						
						if(newPosition == 100) {
							System.out.print("The Winner is " + player.getName() + "!");
							foundWinner = true;
							player.setResult(foundWinner); 
							break;
						}						
						
					}
				}
				
			}
		
		}
	}

}
