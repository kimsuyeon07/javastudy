package quiz03;

public class Student {

	// field (필드)
	String name;
	int kor;
	int eng;
	int math;
	
	// method : 정보 저장 메서드
	void set(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
		
		System.out.println("이름 : " +  name);
		System.out.println("국어 점수 : " +  kor);
		System.out.println("영어 점수 : " +  eng);
		System.out.println("수학 점수 : " +  math);
		
	}
	
	// method : 평균값 구하는 메서드
	double getAverage() {
		return (kor + eng + math) / 3.0;
	}
	
	
	// method : 합격,불합격 체크 메서드
	//          => 60점 이상 "합격", 나머지는 "불합격"
	String getPass() {
		boolean check = getAverage() >= 60 ;  // 메서드 재사용이 가능하다.
		
		return  check ? "합격" : "불합격";
	}
		
	
	
	
	
	
}
