package quiz04;

public class Soldier {

	// field
	private String name;
	private Gun gun;
	
	// constructor
	public Soldier(String name, Gun gun) {  //"람보", gun
		this.name = name;
		this.gun = gun;
	}
	
	// shoot method
	public void shoot() {
		gun.shoot();
	}
	
	// reload method
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	
	// info method
	 public void info() {
		 System.out.print(name + ", ");
		 gun.info();
	 }
		 
	
	
	
	
}
