package ex02;

public class Player implements Runnable {

	// field
	private String name;

	
	// constructor
	public Player(String name) {
		super();
		this.name = name;
	}
	
	
	// method : implements 경우는 run()메서드를 '반드시' 오버라이딩 해줘야 한다.
	@Override
	public void run() {
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(name + "이(가) 게임 중입니다.");
			
		}
	}
		
	
	
	
	
	
	
	
	
}
