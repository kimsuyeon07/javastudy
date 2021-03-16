package ex02_2d_array;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
 
		// 4. 성적 관리 프로그램
		// 각 점수는 입력을 받는다.
		// 학생별 총점과 과목별 총점
		
		// (스펀지밥의 국어 점수 : 10
		//  스펀지밥의 영어 점수 : 10
		//  스펀지밥의 수학 점수 : 10
		// ...
		// 브레드의 수학 점수 : 20
		
		//        국어    영어    수학    학생총점  (열)
		// 스펀지밥     10  10  100  30     [0][0]  [0][1]  [0][2]  [0][3]
		// 타요           10  10  10   30     [1][0]  [1][1]  [1][2]  [1][3]
		// 브레드        10  10  10   30     [2][0]  [2][1]  [2][2]  [2][3]
		// 합계           30  30  30   90     [3][0]  [3][1]  [3][2]  [3][3]
		// (행)
		
		
		
		String[] names = {"스펀지밥", "타요", "브레드", "과목합계" };
		String[] subjects = {"국어", "영어", "수학", "학생합계"};
		int [][] scores = new int [names.length][subjects.length];
		
		Scanner sc = new Scanner(System.in);
		
		
		// 입력 및 계산 
		for (int i = 0 ; i < scores.length-1 ; i++) {
			for (int j = 0; j < scores[i].length-1 ; j++) {
				// 성적 입력
				System.out.println(names[i] + "의 " + subjects[j] + " 점수 : ");
				// 총 합을 제외한 배열 값 저장
				scores[i][j] = sc.nextInt();
				
				// 각각의 점수 : scores[i][j]
				// 과목의 합계 : scores[3][0,1,2,3]  : scores[names.length-1][j]
				// 학생의 합계 : scores[0,1,2,3][3]  : scores[i][subjects.length-1]
				// 전체의 합계 : scores[i][j]++
				
				scores[names.length-1][j] += scores[i][j];
				scores[i][subjects.length-1] += scores[i][j];
				scores[names.length-1][subjects.length-1] += scores[i][j];
			}
		}


		// 출력
		
		// 첫 줄 출력
		System.out.print("\t");
		for (String subject : subjects) {
			System.out.print(subject + "\t");
		}
		/*두번째줄로 넘어가기 위한 줄바꿈*/System.out.println();
		// 두 번째 줄 출력
		for (int i = 0 ; i<scores.length ; i++) {
			System.out.print(names[i] + "\t");
			
			for (int j = 0 ; j < scores[i].length ; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			/*줄바꿈*/System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
