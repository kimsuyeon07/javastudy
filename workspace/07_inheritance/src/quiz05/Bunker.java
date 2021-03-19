package quiz05;

public class Bunker {
	// **Bunker에서 Terran의 배열을 생성한다.**
	
	
	
	// field
	private Terran[] terrans;
	private int idx;

	// constructor
	public Bunker() {
	}
	
	// method
	public void add(Bunkable terran) {
		if (idx < terrans.length) {
			terrans[idx++] = (Terran)terran;
		}
	}
	
	

}
