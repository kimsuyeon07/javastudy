package ex02_2d_array;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
 
		// 영한 사전
		// "영어단어"와 "의미"를 배열에 저장해 두고,
	    // 묻고 답하는 프로그램
		
		//실행 예시
		// 봄을 영어로 하면? spring
		// 정답
		// 여름을 영어로 하면? summerrr
		// 오답
		// 가을을 영어로 하면? fall
		// 정답
		// 겨울을 영어로 하면 ? winterr
		// 오답
		// 2문제를 맞히고, 2문제를 틀렸습니다.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String[][] dict = {
				{"봄", "spring"},		// dict[0][0]  dict[0][1]
				{"여름", "summer"},   	// dict[1][0]  dict[1][1]
				{"가을", "fall"},			// dict[2][0]  dict[2][1]
				{"겨울", "winter"}		// dict[3][0]  dict[3][1]				
		};								// => dict[i][0]  =>dict[i][1]
		
		// 틀릴 때 마다 카운트
		int wrong = 0;
		
		
		for (int i = 0 ; i < dict.length ; i++) {
			// 질문 및 답변
			System.out.print(dict[i][0] + "을 영어로 하면? ");
			String answer = sc.next();
			
			// 정답 확인
			if (answer.equalsIgnoreCase(dict[i][1])) {  
				//String은 ==으로 비교할 수 없음. (equals 사용.)
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
				// 오답 카운트
				wrong++;
			}
		}  // <= for(int j = 0 ...) 을 하지 않는 이유 : 1차원배열로 '4'번만 반복 진행하면 되어서. (j까지 굳이 사용하지 않는다.)
		// 최종 확인 
		System.out.println( (dict.length-wrong) + "문제를 맞히고, " + wrong + "문제를 틀렸습니다.");
		sc.close();
				
				
				

				
		
		
		
	}
}
