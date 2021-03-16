package ex06_access;

public class MainClass {

	public static void main(String[] args) {
 
		// 클래스에 생성자가 없는 경우 : "디폴드 생성자" 가 자동 생성
		// Person 클래스에 " public Person() { } " 가 자동으로 생성 (숨겨져있는 상태라고 본다.)
		Person p = new Person();
		
		p.setName("david");
		p.setAge(25);
		p.setKorean(false);
		
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("국적 : " + ( p.isKorean() ? "한국인" : "외국인" ) );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
