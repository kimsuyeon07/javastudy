package random_Quiz;

import java.util.Scanner;

public class random_Quiz03 {

	public static void main(String[] args) {

		// 3. 가위바위보
		// 가위 바위 보  : 가위
		// Player : 가위  , Computer : 보, 이겼습니다.
		// 가위 바위 보 : 바위
		// Player : 보  , Computer : 바위, 이겼습니다.
		// 가위 바위 보 : 보
		// Player : 바위  , Computer : 보, 이겼습니다.
		// 1승 1무 (패 시 게임 끝)
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 초기화
		int idx = 0;  // 인덱스번호
		int win = 0;  // 이긴 횟수
		int draw = 0; // 비긴 횟수
		
		// 배열 생성
		String[] gababo = { "가위","바위","보" };
		//					 [0]  [1]  [2]
		
		
		// 가위바위보
		// 무한반복문
		
		loop :
		while(true) {
			
			// 컴퓨터 :  랜덤 출력
			int computer = (int)(Math.random()*3)+0;
			
			// 사용자 입력 
			System.out.print("Player : ");
			int playerN = 0;  // 가위로 초기화
			
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
			} //switch문 종료
			
			
			// player : 0, 1, 2
			// computer : 0, 1, 2
			
			// diff = player - computer
			// 1. 이긴 경우 : diff = -2, 1
			// 2. 비긴 경우 : diff = 0
			// 3. 진 경우 : diff = 이 외의 값
			
			switch (playerN - computer) {
			case -2: case 1:
				System.out.println("Player : "+ gababo[playerN] +", Computer : "+ gababo[computer] +" , 이겼습니다.");
				win++;
				break;
			case 0:
				System.out.println("Player : "+ gababo[playerN] +", Computer : "+ gababo[computer] +" , 비겼습니다.");
				draw++;
				break;
			default :
				System.out.println("Player : "+ gababo[playerN] +", Computer : "+ gababo[computer] +" , 겼습니다.");
				break loop;  // 해당 라벨이 붙어 있는 문을 끝내겠다.
			}
			
		} //loop 끝나는 지점 

		
		System.out.println(win + "승 "+ draw +"무");
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
