package chutesandladders;

public class Chute {

	private int topPosition;
	private int bottomPosition;
	
	public Chute(int topPosition, int bottomPosition) {
		this.topPosition = topPosition;
		this.bottomPosition = bottomPosition;
	}
	
	
	public int getTopPosition() {
		return topPosition;
	}
	
	public void setTopPosition(int topPosition) {
		this.topPosition = topPosition;
	}
	
	public int getBottomPosition() {
		return bottomPosition;
	}
	
	public void setBottomPosition(int bottomPosition) {
		this.bottomPosition = bottomPosition;
	}
	
	
	public int slide(int topPosition) {
		return this.bottomPosition;
	}
}
