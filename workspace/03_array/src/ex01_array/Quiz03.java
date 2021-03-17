package ex01_array;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
 
		// 3. 성적 관리 프로그램
		// 학생들의 점수 입력받아서 
		// 평균 구하기, 최대값, 최소값 출력


		Scanner sc = new Scanner(System.in);
		
		String [] students = {"타요", "브레드", "스폰지밥", "짱구", "구하리"};
		int [] scores = new int[students.length];
		
		// 학생들의 점수 입력받아서 
		for (int i = 0 ; i<students.length ; i++) {
			System.out.print(students[i] + "의 성적 : ");
			scores[i] = sc.nextInt();
		}
		
		// 평균 구하기
		int total = scores[0]; // 합계
		int min = scores[0];   // 최소값
		int max = scores[0];   // 최대값
		
		int minN = 0;
		int maxN = 0;
		// ** 첫 번째 학생의 점수를 초기화값으로 사용합니다!
		
		// 첫 번째 학생의 점수는 제외하고 합계, 최소, 최대값을 구한다.
		// 인덱스 [1] 부터 사용
		for (int i = 1 ; i<scores.length ; i++) {
			// 합계
			total += scores[i];
			// 최소
			if(min > scores[i]) {  // 현재 저장된 최소값보다 작은 점수가 나타난다면, 
				min = scores[i];   // 그 작은 점수를 최소값으로 사용한다.
				minN = i;
			}
			// 최대
			if (max < scores[i]) {
				max = scores[i];
				maxN = i;
			}			
		}

		// 결과 출력
		System.out.println("평균 : " + ((double)total / scores.length) + "점");
		System.out.println("(최소값)  가장 낮은 점수를 받은 학생 : " + students[minN] + ", "+ min +"점");
		System.out.println("(최대값)  가장 높은 점수를 받은 학생 : " + students[maxN] + ", "+ max +"점");

		
		
		
		
		
	}
}
