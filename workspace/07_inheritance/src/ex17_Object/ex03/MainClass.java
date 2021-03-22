package ex17_Object.ex03;

public class MainClass {

	public static void main(String[] args) {

		Dog dog = new Dog();
		
		// lombok으로 추가한 setter
		dog.setName("댕댕이");
		dog.setAge(5);
		
		// lombok으로 추가한 getter
		System.out.println("강아지 이름 : " + dog.getName());
		System.out.println(dog.getAge() + "살");
		
		// lombok으로 추가한 toString()
		System.out.println(dog);
		
		
		
		
		
		
		
		
		
		
	}
}
