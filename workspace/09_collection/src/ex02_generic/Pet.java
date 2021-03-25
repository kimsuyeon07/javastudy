package ex02_generic;

public class Pet {

	// field
	private String name;
	private int age;
	
	// constructor
	public Pet(String name, int age) {
		this.age = age;
		this.name = name;
	}

	// method : Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	// method : toString() : Override
	@Override
	public String toString() {
		return "[ "+ name +", "+ age +"살 ]";
	}



	
	
	
	
	
	
	
}
