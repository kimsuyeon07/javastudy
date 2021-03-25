package ex03_input;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz06 {

	public static void main(String[] args) {

		
		// 주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력
		Scanner sc = new Scanner(System.in);
		
		// 주민번호 입력
		System.out.println("주민번호(하이픈 제외)를 입력하세요.");
		String id = sc.next();
		
		// 특정 문자 추출
		char genderNum = id.charAt(6);
		
		//  "남", "여" 구분하는 조건식
		boolean gender = genderNum == '1' || genderNum == '3' ;  // char 데이터값으로 입력해야 한다.
		
		// boolean gender = genderNum % 2 == 1 ;
		/* genderNum % 2 == 1 (되는 것처럼 보인다.)
		 * 문자는 코드값을 가지고 있음.
		 * 문자를 연산하는 경우 "코드값"이 연산된다.
		 * '1' % 2 --> 49 % 2 로 계산된 것
		 * '2' % 2 --> 50 % 2 
		 * -------
		 * 알아두면 좋은 코드 값
		 * '0' : 48 (코드값)
		 * 'A' : 65
		 * 'a' : 97
		 * */
		
		String answer = gender ? "남 " : "여" ;
		
		// 출력
	    System.out.println("성별은 " + answer + "입니다." );
		
		
		
		
		
		
		/*
		 * 
		// 주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력
		String num = JOptionPane.showInputDialog("주민번호(하이픈 제외)를 입력하세요.");
		char n =num.charAt(6);

		// "남", "여" 구분 출력
		boolean gender = n % 2 == 1 ;
		String answer = gender ? "남 " : "여" ;
		
		// 출력
		JOptionPane.showMessageDialog(null, answer);
		
		*/
		
		
		
				
				
		
		
		
	}
}
