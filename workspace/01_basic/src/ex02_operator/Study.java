package ex02_operator;

public class Study {

	public static void main(String[] args) {
		// 문제1. 평균이 85점이상 이거나, 국어와 영어 점수가 모두 80점 이상이면 합격, 아니면 불합격
		
		int kor = 80;
		int eng = 80;
		
		boolean isPass = (kor + eng)/2 >= 85 || ( kor >= 80 && eng >= 80) ;
		System.out.println(isPass ? "합격" : "불합격");
		
		
		// 문제2. 2자리(10~99) 정수 중에서 하나를 임의로 선언하고,
		// 그 값이 '카프리카 수'이면 "맞다", 아니면 "아니다"
		// 45, 55, 99 가 카프리카 수.
		
		int n = 55;
		int square = n * n;
		
		int front = square / 100 ;
		int end = square % 100 ;
		
		boolean isKaprekar = front + end == square;
		
		System.out.println(isKaprekar ? "맞다" : "아니다");
		
		
		

	}

}
