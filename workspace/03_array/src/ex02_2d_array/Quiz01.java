package ex02_2d_array;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 1. 인구 조사
		// apt에 사는 인구를 초기화 해놓고,
		// 전체 사람의 수를 출력
		// 출력 : 
		// 1층에 3명이 삽니다.
		// 2층에 7명이 삽니다.
		// 3층에 6명이 삽니다.
		// 4층에 5명이 삽니다.
		// 5층에 7명이 삽니다.
		// apt에 28명이 삽니다.
		
		// 5층 , 2호
		int [][] apt = {
				{ 1, 2 },
				{ 5, 2 },
				{ 3, 3 },
				{ 1, 4 },
				{ 5, 2 },
		};
		
		// 총 인원
		int total = 0;
		
		// 각 층 마다의 총인원
		int floorP = 0;
		
		// 층
		int floor = 0;
		
		
		for (int i = 0 ; i < apt.length ; i++) {         // i : 층을 의미
			
			// [j]의 계산이 끝나고 [i]로 다시 반복이 시작될 때 초기화해준다.
			floorP = 0;
			
			for (int j = 0 ; j < apt[i].length ; j++) {  // j : 호을 의미
				
				// 각 층 마다의 총 인원 구하기
				floorP += apt[i][j];
				floor = i+1;
			} 
			System.out.println(floorP + "층에 "+ floorP +"명이 삽니다.");
			total += floorP;
		}
		System.out.println("apt에 " + total + "명이 삽니다.");
		
		
		
		
		
		
		
	}
}
