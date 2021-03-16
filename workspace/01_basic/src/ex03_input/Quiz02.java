package ex03_input;

import javax.swing.JOptionPane;

public class Quiz02 {

	public static void main(String[] args) {
			
		// double 타입의 실수 2개 입력 받아서 값을 교환하기
		// JOptionPane 클래스 사용
		String num1 = JOptionPane.showInputDialog("1) 실수를 입력하세요.");
		String num2 = JOptionPane.showInputDialog("2) 실수를 입력하세요.");

		// 문자열화 된 num1, num2를 실수형으로 변환
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		
		// 값을 교환하기
		double temp = n1;
		n1 = n2;
		n2 = temp;
		
		// 내용 입력
		String message = "n1 : " + n1 + ", n2 : " + n2 ;
		
		// 출력 
		JOptionPane.showMessageDialog(null, message);
		
		
		
		
		
		
	}
}
