package ex16_interface_extends;

public class MainClass {

	public static void main(String[] args) {

		Dog dog = new Dog("댕댕이");
		Snake snake = new Snake("뱜");
		Person person = new Person();
		
		// 1. 음식 주기
		person.feed(dog, "닭고기");
		person.feed(snake, "소고기");
		
		// 2. 산책
		person.walking(dog);
//		person.walking(snake);  // 컴파일 에러
		
		
		
		
		
		
		
	}
}
