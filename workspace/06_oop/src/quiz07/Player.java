package quiz07;

import java.util.Scanner;

public class Player {

	// field
	private String name;
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public Player(String name) {
		this.name = name;
	}

	// 필수 method
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// method : 플레이의 시작 & 결과
	public int play() {
		System.out.println(name + "'s game start!");
		System.out.println("Press Enter!");
		
		// Enter입력 : nextLine();  { nextLine() : 엔터가 입력될 때까지 문자열로 인식되는 메서드! }
		sc.nextLine();
		long start = System.currentTimeMillis();  // 밀리초단위로 현재 시간 확인
		System.out.println("After 10seconds Press Enter!");  // 안내문자
		sc.nextLine();
		long end = System.currentTimeMillis();    // 밀리초단위로 현재 시간 확인
		
		// 경과 시간 반환
		return (int)((end - start)/1000) ;  // 소수점은 없애고, 초만 살리기 위해서 사용 (int).
		
	}
	
	
	
	
	
	
	
}
