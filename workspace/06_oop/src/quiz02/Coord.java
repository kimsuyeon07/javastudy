package quiz02;

// Coordinates : 좌표

public class Coord {

	// field
	private int x;
	private int y;
	
	// constructor
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// info 메서드
	public void info() {
		System.out.print("["+ x +", "+ y +"]");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// 필수 메서드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
}
