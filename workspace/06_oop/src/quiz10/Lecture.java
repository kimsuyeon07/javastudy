package quiz10;

import java.text.DecimalFormat;

public class Lecture {

	// field
	private String lectureName;
	private Student[] students;
	
	
	// constructor
	public Lecture(String lectureName, String[] names) {
		this.lectureName = lectureName;
		students = new Student[names.length];
		// 각 학생 생성
		for (int i = 0 ; i < names.length; i++) {
			students[i] = new Student(names[i]);
		}
	}
	
	
	// method : exam()
	public void exam(int scoreCount) {
		System.out.println("시험을 봅니다.");
		for (Student student : students) {
			student.setScores(scoreCount);
		}
	}
	
	// 강좌 합계 평균 (총 학생의 평균 점수를 더해서 학생수로 나누어준 값)
	public double getLectureAverage() {
		double total = 0.0;
		for (Student student : students) {
			total += student.getAverage();
		}
		return total / students.length;
	}
	
	// method : info()
	public void info() {
		System.out.println("강좌명 : " + lectureName);
		System.out.println( "강좌평균 : " + ( new DecimalFormat("0.00").format(getLectureAverage()) ));
		System.out.println("====학생별 성적 현황 ====");
		for (Student student : students) {
			student.info();
			System.out.println("-----------------------------");
		}
		
		
		
System.out.println("강좌명 : " + lectureName);
	}
	
	
	
}
