package ex03_input;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz04 {

	public static void main(String[] args) {
 
		
		// int 타입의 매출액 + 등급("VIP", "일반") 입력받아서 실매출액 출력
		Scanner sc = new Scanner(System.in);

		// 매출액 입력
		System.out.println("매출액을 입력하세요.");
		int salesMoney = sc.nextInt();
		
		// 등급 입력
		System.out.println("등급을 입력하세요.");
		String grade = sc.next();
		
		// grade == "VIP" : grade.equals("VIP")
		// equalsIgnoreCase("VIP") => 영문 한에서 소문자, 대문자 구분없이 확인
//		double disCountRate = grade.equals("VIP") || grade.equals("vip") ? 0.2 : 0.05;
		double disCountRate = grade.equalsIgnoreCase("VIP") ? 0.2 : 0.05;
		
		// 실매출액 계산
		salesMoney -= (salesMoney * disCountRate);
		
		// 출력
		System.out.println("실 매출액 : " + salesMoney);
		
		
		
		
		
		
		
		
		
		
//		// JOptionPane 클래스 사용
//		String num1 = JOptionPane.showInputDialog("매출액을 입력하세요.");
//		
//		// 문자열화 한 num1를 int형으로 변환
//		int n1 = Integer.parseInt(num1);
//		
//		// 등급 구분 조건문
//		boolean grade = n1 >= 100000;
//		
//		// vip일 때 실매출액, 일반일 때 실매출액 계산
//		int vip = (int)(n1 - (n1 * 0.2));
//		int regular = (int)(n1 - (n1 * 0.05));
//		
//		// 
//		int answer = grade ? vip : regular;
//		
//		String ans = "실 매출액 : " + answer ;
//		
//		
//		JOptionPane.showMessageDialog(null, ans);
//		
//		System.out.println(grade ? vip : regular);
		
		
	}
}
