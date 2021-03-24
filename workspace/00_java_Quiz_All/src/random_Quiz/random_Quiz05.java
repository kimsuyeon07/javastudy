package random_Quiz;

import java.util.Scanner;

public class random_Quiz05 {

	public static void main(String[] args) {
		// 로또 구매
		// 1000원에 번호 6개 1세트 나옴. : 45까지의 숫자
		// 구매 금액 입력 : 5000
		// 5줄의 로또 번호 출력

		// [0][0]  [0][1]  [0][2]  [0][3]  [0][4]  [0][5]
		// [1][0]  [1][1]  [1][2]  [1][3]  [1][4]  [1][5]
		// [2][0]  [2][1]  [2][2]  [2][3]  [2][4]  [2][5]
		// [3][0]  [3][1]  [3][2]  [3][3]  [3][4]  [3][5]
		// [4][0]  [4][1]  [4][2]  [4][3]  [4][4]  [4][5]
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 구매 금액 입력
		System.out.print("구매 금액 입력 : ");
		int money = sc.nextInt();
		
		// 배열 생성
		int set = money/1000 -1;
		final int SIZE = 6;
		int[][] lotto = new int[set][SIZE];
		
		// lotto번호 랜덤으로
		int lottoNo = (int)(Math.random() * 45) +1;
		
		// 로또 번호 만들기
		for (int i = 0 ; i<SIZE ; i++) {
			
			// 1~45까지 순서대로 나열 : 배열 생성
			int lottoMax = 45;
			int[] lottoMaxArr = new int[lottoMax];
			for (int j = 0 ; j < lottoMax ; j++) {
				lottoMaxArr[j] = j+1;
			}
			
			
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
