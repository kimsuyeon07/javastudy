package ex05_synchronized;

public class Mama extends Thread {

	// field
	private Dyson dyson;

	// run()
	@Override
	public void run() {
		for (int i = 0; i<10; i++) {
			dyson.floorCleaning();  // 엄마는 바닥 청소 담당
		}
	}
	
	// Getter and Setter
	public Dyson getDyson() {
		return dyson;
	}
	public void setDyson(Dyson dyson) {
		this.dyson = dyson;
	}

	
	// method
	
}
