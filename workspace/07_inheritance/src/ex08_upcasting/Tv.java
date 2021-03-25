package ex08_upcasting;

// Tv
public class Tv extends Elec{

	// field
	private String model;

	// constructor
	public Tv(int watt, String model) {
		super(watt);
		this.model = model;
	}
	
	// method : info() : Override
	@Override
	public void info() {
		System.out.print("Tv 모델명 : " + model + ", ");
		super.info();
	}
	
	
	
	// method : Getter and Setter
	
	
	
	
	
	
	
	
	
	
}
