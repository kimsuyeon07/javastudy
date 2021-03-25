package ex02_2d_array;

public class Ex03_advance_for {

	public static void main(String[] args) {
 
		//  향상된 for문으로 형성
		int [][] a = {
				{ 1, 2 },
				{ 3, 4, 5}
		};
		
		// a -> a[0], a[1] 의 주소값
		// a[0] : 1, 2 / a[1] : 3, 4, 5 값이 저장되어있음
		
		for (int[] arr : a) {     // a[i]
			for( int n : arr) {   // a[j]
				System.out.print(n + " ");
			}System.out.println();
		}
		
		
		
		
	}
}
