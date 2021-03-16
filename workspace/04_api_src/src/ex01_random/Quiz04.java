package ex01_random;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
 
		// 4. 가위바위보
		// 가위 바위 보  : 가위
		// Player : 가위  , Computer : 보, 이겼습니다.
		// 가위 바위 보 : 바위
		// Player : 보  , Computer : 바위, 이겼습니다.
		// 가위 바위 보 : 보
		// Player : 바위  , Computer : 보, 이겼습니다.
		// 1승 1무 (패 시 게임 끝)
		
		Scanner sc = new Scanner(System.in);
		
		// 가위 바위 보 배열
		String[] gababo = {"가위","바위","보"};  // [0] [1] [2]
		
		// 배열의 인덱스 번호
		int idx = 0;
		
		// 이긴횟수, 비긴횟수
		int win = 0;
		int draw = 0;
		
		// 반복문
		loop: //라벨
		while(true) {
			
			// 컴퓨터가 내는 (랜덤) : 배열 인덱스 번호로
			int computer = (int)(Math.random()*3)+1;
			
			// 사용자 입력
			System.out.print("가위 바위 보 : ");
			int playerN = 0;  // "가위" 초기화 값.
			// switch문 사용.
			switch (sc.next()) {
			case "가위" :
				playerN = 0;
				break;
			case "바위" :
				playerN = 1;
				break;
			case "보" :
				playerN = 2;
				break;
			}
			
			// player : 0, 1, 2
			// computer : 0, 1, 2
			
			// diff = player - computer
			// 1. 이긴 경우 : diff = -2, 1
			// 2. 비긴 경우 : diff = 0
			// 3. 진 경우 : diff = 이 외의 값
			switch (playerN - computer) {
			case -2: case 1:
				System.out.println("Player : " + gababo[playerN] + "  , Computer : "+ gababo[computer] + ", 이겼습니다.");
				win++;
				break;
			case 0 :
				System.out.println("Player : " + gababo[playerN] + "  , Computer : "+ gababo[computer] + ", 비겼습니다.");
				draw++;
				break;
			default :
				System.out.println("Player : " + gababo[playerN] + "  , Computer : "+ gababo[computer] + ", 겼습니다.");
				break loop;  // 해당 라벨이 붙어 있는 문을 끝내겠다.
			} 
		} // loop라벨 끝 지점.
		
			
			
			// 승부 결과
			System.out.println(win + "승 " + draw+ "무");
			
			
			
			
			
//			// 반복문
//			while (true) {
//				// 플레이어의 입력값 => 배열의 인덱스번호로 변환 
//				player = gababo[idx];
//				
//				if (idx > computer) {
//					System.out.println("Player : " + player + "  , Computer : "+ gababo[computer] +", 이겼습니다.");
//					win++;
//				} if (idx == computer) {
//					System.out.println("Player : " + player + "  , Computer : "+ gababo[computer] +", 비겼습니다.");
//					draw++;
//				} else {
//					break;
//				}
			
			
//				
//				
//				
//			}
			
			
			
			
			
		
		
		
		
		
		
	}
}
