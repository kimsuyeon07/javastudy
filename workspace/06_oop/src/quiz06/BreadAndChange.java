package quiz06;

public class BreadAndChange {

	// field
	private int bread;
	private int change;
	
	// constructor
	public BreadAndChange(int bread, int change) {
		this.change = change;
		this.bread = bread;
		
	}

	
	// 필수 매서드
	public int getBread() {
		return bread;
	}

	public void setBread(int bread) {
		this.bread = bread;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
	
	
	
	
}
