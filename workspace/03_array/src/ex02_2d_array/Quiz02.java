package ex02_2d_array;

public class Quiz02 {

	public static void main(String[] args) {
 
		// 2. 구구단의 결과만 2차원 배열에 저장하고 출력
		//    2 4 6 ... 18
		//    3 6 9 ... 27
		//    ...
		//    9 18 27 ... 81
		
		int [][] num = new int[8][9];
		
		for (int i = 0 ; i < num.length ; i++) {
			for (int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = (i + 2) * (j+1);
				
				System.out.print(num[i][j] + " ");
			}System.out.println();
		}
		
		for (int[] a : num) {
			for (int n : a) {
				System.out.print(n + "\t");
			} System.out.println();
		}
		
		
		
		
		
		
	}
}
