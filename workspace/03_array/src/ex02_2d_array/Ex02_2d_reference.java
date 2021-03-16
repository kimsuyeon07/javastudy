package ex02_2d_array;

public class Ex02_2d_reference {

	public static void main(String[] args) {
 
		
		int [][] a = {
				{ 1, 2 },
				{ 3, 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		System.out.println(a);  // a[0], a[1], a[2] 참조값이 모여 있는 주소.
		// 2차원 배열 메모리 주소값
		
		System.out.println(a[0]);  //a[0]는 {1,2}입니다. (1차원 배열을 모아놓은 것)
		System.out.println(a[1]);  //a[1]는 {3,4,5,6}입니다.
		System.out.println(a[2]);  //a[2]는 {7,8,9}입니다.
		// 1차원 배열이 3개있는 것
		
		System.out.println(a.length);    // 값 : 3  (a[0], a[1], a[2])
		System.out.println(a[0].length); // 값 : 2  (1,2)
		System.out.println(a[1].length); // 값 : 2  (3,4,5,6)
		System.out.println(a[2].length); // 값 : 2  (7,8,9)
		
		/*줄바꿈*/ System.out.println();
		
		//** for문으로 순회 **
		for(int i = 0 ; i < a.length ; i++) {
			for (int j = 0 ; j < a[i].length ; j++) {
				System.out.print(a[i][j] + " ");
			} System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
