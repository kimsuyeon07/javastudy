package ex02_2d_array;

public class Quiz03 {

	public static void main(String[] args) {
 
		// 3. 369  결과 저장하고 출력 (1 ~ 99 사이의 정수 대상)
		// 1 2 짝 4 5 짝 7 8 짝 10
		// 11 12 짝 14 15 짝 17 18 짝 20
		// 21 22 짝 24 25 짝 27 28 짝 짝
		// 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40
		
		
		String [][] game = new String[10][10];
		
		for (int i = 0 ; i < game.length ; i++) {
				for (int j = 0 ; j < game[i].length ; j++) {
//					game[i][j] = i*10+j+1 + "" ;
					
					// game[i][j]의 값 : n
					int n = (i*10) + (j+1);  // n은 1~100
					
					// 일의 자리와 십의 자리로 분리
					int units = n % 10;
					int tens = n / 10;
					
					// 369 검사
					boolean check1 = units == 3 || units == 6 || units == 9;  // 일의 자리가 369인지 확인
					boolean check2 = tens == 3 || tens == 6 || tens == 9;     // 십의 자리가 369인지 확인
					
					// 실제 369검사 후 저장
					if(check1 && check2) {
						game[i][j] = "짝짝";
					} else if (check1 || check2) {
						game[i][j] = "짝";
					} else {game[i][j] = String.valueOf(n);}
					
					// 출력
					System.out.print(game[i][j] + "\t");
				}System.out.println();
		}
					
					
					
					
					
					
					
					
		
		
		
	}
}
