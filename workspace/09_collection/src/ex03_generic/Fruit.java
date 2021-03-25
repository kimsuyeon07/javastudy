package ex03_generic;

public class Fruit {

	// field
	private String name;
	private int price;
	
	// constructor
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// method : Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	
	// method : toString() : Override
	@Override
	public String toString() {
		return "Fruit [ 과일 : "+ name +", 가격  : "+ price +" ] \n";
	}



	
	
	
	
	
	
	
	
}
