package array_Quiz;

import java.util.Scanner;

public class Array_Quiz02 {
	public static void main(String[] args) {
		
		
		// 2. 성적 관리 프로그램
		// 학생들의 점수 입력받아서 
		// 평균 구하기, 최대값, 최소값 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 학생 배열, 점수배열 생성
		String[] students = {"짱구","철수","유리","맹구","훈이"};
		int[] score = new int[students.length];
		
		// 학생들의 점수 입력
		for (int i = 0 ; i < students.length ; i++) {
			System.out.print(students[i] + "의 점수 : ");
			score[i] = sc.nextInt();
		}
		
		// 평균, 최대값, 최소값 구하기. (초기화 먼저)
		int total = score[0];
		int max = score[0];
		int min = score[0];
		
		// 최대값 인덱스 번호
		int maxN = 0;
		// 최소값 인덱스 번호
		int minN = 0;
		
		// for문 사용
		// 배열 인덱스번호 
		for (int i = 1 ; i < students.length ; i++) {
			// 평균 : 합계 구하기
			total += score[i];

			// 최대값
			if (max < score[i]) {
				max = score[i];
				maxN = i;
			}
			
			// 최소값
			if (min > score[i]) {
				min = score[i];
				minN = i;
			}
			
		}
		
		// 출력
		System.out.println("총 학생들의 평균 : " + ((double)total / students.length));
		System.out.println("높은 점수를 받는 학생 : " + students[maxN] + ", 점수 : " + max + "점");
		System.out.println("낮은 점수를 받는 학생 : " + students[minN] + ", 점수 : " + min + "점");
		
		
		
		
		
		

		
		
	
	
	
	}
}
