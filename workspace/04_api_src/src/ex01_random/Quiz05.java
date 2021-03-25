package ex01_random;

public class Quiz05 {

	public static void main(String[] args) {
 
		// 5. 5 x 5 크기의 빙고 생성
		// 1) 1 ~ 25를 bingo 배열에 순서대로 저장
		// 2) 섞는다.
		
		
		// final 상수 : 변하지 않는 값을 저장해두는 경우 (변수는 "대문자"로 지정해준다!)
		final int SIZE = 5;
		
		// (순서대로 저장) 1 ~ 25를 bingo 배열
		int [][] bingo = new int[SIZE][SIZE];
		for (int i = 0 ; i < SIZE; i++) {
			for (int j = 0 ; j<SIZE ; j++) {
				bingo[i][j] = (i * SIZE) + (j+1);
			}
		}
		
		// (순서가 섞인) 배열로  수정
		for (int i = 0 ; i < SIZE ; i++) {
			for (int j = 0 ; j<SIZE ; j++) {
				int x = (int)(Math.random() * SIZE) + 0;
				int y = (int)(Math.random() * SIZE) + 0;
				
				int temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}
		
		// 출력
		for(int i = 0 ; i < SIZE ; i++) {
			for (int j = 0 ; j<SIZE ; j++) {
				System.out.print(bingo[i][j] + "\t");
			} System.out.println();
		}
		
		
		
		
		
	}
}
