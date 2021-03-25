package ex02_method;

public class MainClass {

	public static void main(String[] args) {

		Person p = new Person();
		
		// 인수가 4개  : 인수 -> 매개변수 에 '전달'한다!
		p.set("alice", 30, '여', false, 170.5, 70.5);  
		
		
//		System.out.println(p.name);
//		System.out.println(p.age);
//		System.out.println(p.gender);
//		System.out.println(p.isKorean ? "한국인" : "외국인");
		
		
		// 출력 메서드 사용
		p.info();  // 인수가 0개
		
		double bmi = p.getBMI();  // getBMI메서드를 호출.
		System.out.println(bmi);
		// 실행 순서 : 1) getBMI메서드 호출
        //             2) 메서드 실행
		//             3) 메서드 변환
		//             4) 변환된 메서드 값이 bmi로 전달
		//             5) bmi출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
