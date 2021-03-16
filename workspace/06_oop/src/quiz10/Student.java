package quiz10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {

	// field
	private String name;
	private int[] scores;   // 점수들
	private double average; // 평균							     : scores의 종속적인 데이터
	private char grade;     // 학점 (A ~ F) 					 : scores의 종속적인 데이터
	private boolean isPass; // 합격 유무 : 평균 60점 이상 "합격" : scores의 종속적인 데이터
	
	// constructor
	public Student(String name) {
		this.name = name;
	}
	
	// ** public : 누구나 메서드를 부를 수 있도록 동작하게끔 만든다.
	//   가능 : setAverage(0.0);
	//   가능 : setGrade('A');
	//   가능 : setPass(false);  (따로 지정이 된다 : 만들어놓은 값에 어긋나는 값이라서.)
	//   < 다른 곳에서 부르지 못하도록 해당 메서드의 public => private으로 고쳐준다> (하나의 방법.)
	
	
	
	// method : 필수 : Getter and Setter
	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int[] getScores() {return scores;}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public void setScores(int scoreCount) {
		// scoreCount만큼 임의의 점수를 scores 배열에 저장
		// 30% 확률 :  0 ~  49 임의로 생성
		// 40% 확률 : 50 ~  79 임의로 생성
		// 30% 확률 : 80 ~ 100 임의로 생성
		scores = new int[scoreCount];
		for(int i = 0 ; i < scores.length ; i++) {
			if(Math.random() < 0.3) {
				scores[i] = (int)(Math.random() * 50) + 0; 
			} else if (Math.random() < 0.7) {
				scores[i] = (int)(Math.random() * 30) + 50;
			} else {
				scores[i] = (int)(Math.random() * 21) + 80;
			}
		}
		
		// 평균 구하기
		int total = 0;
		for (int score : scores) {
			total += score;
		}
		double average = (double)total / scores.length; 
		setAverage(average);  // 평균값은 : 실수형태의 데이터값이 되어야한다.
		
		// 학점 구하기 && 합격유무
		setPass(true); // 합격으로 초기화
		if (average >= 90) {setGrade('A');}
		else if (average >= 80) {setGrade('B');}
		else if (average >= 70) {setGrade('C');}
		else if (average >= 60) {setGrade('D');}
		else {setGrade('F'); setPass(false);}
	}
	

	public double getAverage() {return average;}

	private void setAverage(double average) {this.average = average;}

	public char getGrade() {return grade;}

	private void setGrade(char grade) {this.grade = grade;}

	public boolean isPass() {return isPass;}

	private void setPass(boolean isPass) {this.isPass = isPass;}
	
	
	// method : info
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + Arrays.toString(scores));  // [50, 72, 95, 84, 60]
		System.out.println("평균 : " + new DecimalFormat("0.00").format(average) + "점"); // 소수 2자리만 출력  : DecimalFormat("0.00")
		System.out.println("성적 : " + grade + "학점");  
		System.out.println("합격유무 : " + (isPass ? "합격" : "불합격"));
	}
	
	
	
	
	
}
