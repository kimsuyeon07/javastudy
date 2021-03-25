package quiz03;

public class Staff {

	// field
	private String name;

	// constructor
	public Staff(String name) {
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
	
	// method : info()
	public void info() {
		System.out.println();
		System.out.println("직원명 : " + name);
	}

	
	
}
	
