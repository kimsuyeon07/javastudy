package ex17_Object.ex02;

public class MainClass {

	public static void main(String[] args) {
 
		
		Dog dog = new Dog("댕댕이");
		
		System.out.println(dog);
		System.out.println(dog.toString());  // 위와 같은 코드입니다. : dog를 문자열로 바꿔서 보여주겠다.
		
		
		
		// Object 클래스의 toString()
		/*
		 * public String toString() {
		 * 		return getClass().getName() + "@" + hashCode();  // 클래스  @ 메모리참조값
		 * }
		 * 
		// Dog 클래스의 toString() [ 오버라이드 ]
		 * @ Override
		 * public String toString() {
		 * 		return "[name : " + name + " ]" ;
		 * }
		 * 
		 * => dog객체에 .toString()을 하게 되면 오버라이드한 데이터값이 호출된다.
		 * 
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
