package ex01_branch;

public class Ex01_if {

	public static void main(String[] args) {
 
		// if문
		
		/*
		if (true) {
			System.out.println("만족합니다");
		}
		if (false) {
			System.out.println("만족하지 않습니다");
		}
		*/
		
//		int score = 50;
//		boolean isPass = score >= 60 ;
//		if(isPass) {
//			System.out.println("합격");
//		} else { System.out.println("불합격"); }
// 		(= 같은 의미)
		int score = 50;
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		
		// 80이상 : "상", 79 ~ 60 : "중", 59 이하 : "하"
		if (score>=80) {
			System.out.println("상");
		} else {
			if(score>=60) {
				System.out.println("중");
			} else {
				System.out.println("하");
			}
		}
		// -> 같은 코드 (밑에 코드를 더 선호 - 간결하니까)
		if(score >= 80) {
			System.out.println("상");
		} else if (score >= 60) {
			System.out.println("중");
		} else {
			System.out.println("하");
		}
		
		
		
		
		
		
		
	}
}
