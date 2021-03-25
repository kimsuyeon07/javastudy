package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
 
		// 1) out == 1 일 때, in 10 ~ 50 까지 반복    2) out == 2 일 때, in 10~50 까지 반복    ...  10) 까지 반복!
 		for (int out = 1; out <= 10 ; out++) {
			for (int in = 10; in <= 50 ; in += 10) {
				System.out.println(out + ", " + in);
			}
		}
 		
 		
 		// 1주차 1일차 1교시입니다.
 		// 1주차 1일차 2교시입니다.
 		// ...
 		// 총 3주차 . 총 5일 . 총 8교시
 		
 		for (int week = 1 ; week <= 3 ; week++) {
 			for(int day = 1 ; day <= 5 ; day++) {
 				for (int num = 1 ; num <= 8 ; num ++) {
 					System.out.println(week + "주차 " +  day + "일차 " + num + "교시입니다.");
 				}
 			}
 		}
		
		
	}
}
