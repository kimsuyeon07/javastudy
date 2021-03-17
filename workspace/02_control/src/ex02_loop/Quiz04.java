package ex02_loop;

public class Quiz04 {

	public static void main(String[] args) {

		// 2X1 = 2   3X1=3   ... 9X1=9
		// ...
		
		// 2=dan  ,  1=n 일 때, 
		outer: for (int n = 1; n <= 9 ; n++) {
			inner: for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + " X " + n + " = " + (dan*n) + "\t");
			}
			System.out.println();
		}

			
		
		
		
		
	}
}
