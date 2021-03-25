package ex16_interface_extends;

public class Person {

	
	// method
	// 1. Pet에게 food주기
	public void feed(Pet pet, String food) {
		pet.feed(food);
	}
	
	// 2. Pet과 산책하기
	public void walking(Walkable pet) {  
		System.out.println( "Walking with " + ((Pet)pet).getName()); 
	}
	// public void walking(Pet pet) : new Dog() + new Snake() [ 둘 다 가능하다 ]
	// ↓
	// public void walking(Walkable pet) 로 써주는 이유
	//		: [ implement Walkable ] 이 쓰여진 클래스만을 호출하겠다는 의미!
	//		**  pet.getName() ==> ((Pet)pet).getName() [ 캐스팅(casting) ]
	
	
	
	
	
	
	
	
}
