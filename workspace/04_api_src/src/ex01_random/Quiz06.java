package ex01_random;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
 
		// 로또 구매
		// 1000원에 번호 6개 1세트 나옴.
		// 구매 금액 입력 : 5000
		// 5줄의 로또 번호 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int money = sc.nextInt();
		
		// 2차원 배열의 '행'정의 및 배열 생성
		int set = money/1000;
		int[][] lotto = new int[set][6];   // [0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
		
		// lotto 숫자 뽑기
		int lottoNumber = (int)(Math.random() * 45) + 1;
		
		// 배열에 채워넣기
		for(int i = 0 ; i<set; i++) {
			
			// 1 ~ 45까지 순서대로 준비
			int ballCount = 45;
			int [] balls = new int[ballCount];
			for(int j = 0 ; j < balls.length ; j++) {
				balls[j] = j + 1;
			}
			
			// balls 배열  --> lotto배열
			// 1. balls 배열의 인덱스를 랜덤 생성
			// 2. 해당 인덱스의 값을 lotto 배열로 보낸다
			// 3. balls 배열의 마지막 요소를 랜덤 생성한 인덱스로 보낸다.
			for(int j = 0 ; j < lotto[i].length ; j++) {
				int idx = (int)(Math.random()*ballCount) + 0;
				lotto[i][j] = balls[idx];
				int lastIdx = 44 - j;
				if (idx != lastIdx) {
					balls[idx] = balls[lastIdx];
				}
				ballCount--;
			}
		} //배열에 채워넣기 종료
		
		
		// 세트별로 정렬(오름차순)해서 출력하기
		for(int[] line : lotto) {
			Arrays.sort(line);  //한 줄만 빼서 오름차순 정렬
			for(int n : line) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
