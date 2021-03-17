package ex05_constructor;

public class Coord {

	// field
	private int x, y;
	
	// constructor
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}


	
	// method : Getter and Setter
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
	
	
	// 중심 좌표 info()
	public void xyInfo() {
		System.out.println("중심좌표  [ " + x + ", " + y + " ]");
	}
	
	
	
}
