package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
 
		// 점수를 입력 받아서 해당하는 학점을 출력하시오
		// char grade : 'S'  'A'  'B'  'C'  'F'
		// char point : '+'  '0'  '-'  ''
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
//		99 / 97    96 / 94    93 / 90    89 / 87    86 / 83  
		
		char point = '-';
		
		switch (score % 10) {
			case 9: case 8: case 7:
				point = '+';
				break;
			case 6: case 5: case 4:
				point = '0';		
		}
		
		char grade = 'F';
		switch (score / 10) {
		case 10:
			grade = 'S';
			point = ' ';
			break;
		case 9: 
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			point = ' ';
		}
		
		System.out.println("" + grade + point);
//		System.out.println(grade + point + "");  // grade + point 가 먼저 연산되기 때문에  ""  를 앞에 놔두어야 한다.
		
		// (grade + point); 만 하게 되면 출력 값 : 115  ==> char는 연산되면 코드값으로 계산하기 때문에.
		// ** ("" + grade + point); 로 해야 한다. 
		
		sc.close();
		
	}
}
