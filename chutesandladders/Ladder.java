package chutesandladders;

public class Ladder {

	private int bottomPosition; 
	private int topPosition; 
	
	Ladder(int bottomPosition, int topPosition) {
		this.bottomPosition = bottomPosition;
		this.topPosition = topPosition;
	}
	
	
	public int getBottomPosition() {
		return bottomPosition;
	}
	
	public void setBottomPosition(int bottomPosition) {
		this.bottomPosition = bottomPosition;
	}
	
	public int getTopPosition() {
		return topPosition;
	}
	
	public void setTopPosition(int topPosition) {
		this.topPosition = topPosition;
	}
	
	
	public int climb(int bottomPosition) {
		return this.topPosition;
	}
}
