package ex02_2d_array;

/*
		 2차원 배열
		 1. 2차원 배열은 "테이블(표)" 형태로 이해하면 된다.
		 2. 고정형 2차원 배열과 가변형 2차원 배열이 존재
		 3. (고정형)선언
		    1) int[][] arr = new int [3][2]; => 3행 2열의 배열이다.
		    2) int[][] arr;
		       a = new int[3][2];
		 4. (가변형)선언
		    1) int [][] arr = new int[3][];  => 3행 N열의 배열 (행마다 길이가 다를 수 있다.)
		       arr[0] = new int[2];  // 첫 번째 행 (인덱스 0)은 2열이다.
		       arr[1] = new int[4];  // 두 번째 행 (인덱스 1)은 4열이다.
		       arr[2] = new int[3];  // 세 번째 행 (인덱스 2)은 3열이다.
		       => 열은 따로 지정해주어야 한다.
		 5. 초기화
		    int[][] arr = {
		    			{ 1, 2 },
		    			{ 3, 4 },
		    			{ 5, 6 }
		    };
		    2) int [][] arr = {
		    				{ 1,2 },
		    				{ 3, 4, 5, 6, 7 },
		    				{ 8, 9, 10 }
		    };
		    => 전제를 묶어주는 { } , 각각의 배열의 초기화값을 넣는 { }가 분리되어있다.
 */

public class Ex01_2d_array {

	public static void main(String[] args) {
		
		// 2차원 배열 선언 및 생성
		int [][] a = new int[3][2];
		
		// 첫 번째 행
		a[0][0] = 10;
		a[0][1] = 20;
		
		// 두 번째 행
		a[1][0] = 30;
		a[1][1] = 40;

		// 세 번째 행
		a[2][0] = 50;
		a[2][1] = 60;
		
		// *  a[i][j] : i(행) , j(열) *
		
		// 1) 출력 : 테이블형태로 출력
		System.out.print(a[0][0] + " ");
		System.out.print(a[0][1] + " ");
		System.out.println();
		System.out.print(a[1][0] + " ");
		System.out.print(a[1][1] + " ");
		System.out.println();
		System.out.print(a[2][0] + " ");
		System.out.print(a[2][1] + " ");
		System.out.println();
		System.out.println();
		
		// 2) 출력 : for문을 이용한 순회 (2중 for문)
		for(int i = 0 ; i<3 ; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print(a[i][j] + " ");
			} System.out.println(); // [j]의 for문이 끝나고나서 줄바꿈을 넣어준다!
		}
		
		
		
		
	}
}
