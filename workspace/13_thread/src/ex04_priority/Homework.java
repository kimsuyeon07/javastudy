package ex04_priority;

public class Homework extends Weekend implements Runnable {
	
	// Thread : run()
	@Override
	public void run() {
		System.out.println("숙제를 합니다.");
	}
	
	
}