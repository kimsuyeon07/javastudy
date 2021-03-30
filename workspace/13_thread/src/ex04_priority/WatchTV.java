package ex04_priority;

public class WatchTV extends Weekend  implements Runnable {

	// Thread : run()
	@Override
	public void run() {
		System.out.println("TV를 봅니다.");
	}
	
	
}
