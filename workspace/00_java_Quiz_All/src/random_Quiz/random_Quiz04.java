package random_Quiz;

public class random_Quiz04 {

	public static void main(String[] args) {

		
		// 5. 5 x 5 크기의 빙고 생성
		// 1) 1 ~ 25를 bingo 배열에 순서대로 저장
		// 2) 섞는다.
		
		//  1  2  3  4  5  [0][1][2][3][4]
		//  6  7  8  9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		
		final int SIZE = 5; // 상수 지정. 
		int[][] bingo = new int[SIZE][SIZE];
		
		for(int i = 0 ; i<SIZE ; i++) {
			for (int j = 0 ; j<SIZE; j++) {
				bingo[i][j] = (i*5)+(j+1) ;
//				System.out.print(bingo[i][j] + " "); // 확인용
			}
//			System.out.println();
		}
		
		// 순서가 섞인 배열 생성
		for (int i = 0 ; i<SIZE ; i++) {
			for (int j = 0 ; j <SIZE ; j++) {
				int x = (int)(Math.random()*SIZE) + 0;  // 인덱스번호를 랜덤으로 준다. 
				int y = (int)(Math.random()*SIZE) + 0;  // 인덱스번호를 랜덤으로 준다.
				
				// 배열 교환 
				int temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}
		
		// 출력
		for (int i = 0 ; i < SIZE ; i++) {
			for (int j = 0 ; j < SIZE ; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
