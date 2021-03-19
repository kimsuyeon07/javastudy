package ex16_interface_extends;

public class Pet {

	// field
	private String name;

	// constructor
	public Pet(String name) {
		super();
		this.name = name;
	}

	
	// method : Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// method : feed()
	public void feed(String food) {
		System.out.println(name + " is eating " + food);
	}
	


	
	
}
