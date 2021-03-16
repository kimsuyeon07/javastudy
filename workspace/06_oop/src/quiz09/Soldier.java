package quiz09;

public class Soldier {

	// field
	private String name;
	private Gun[] guns;
	private int idx;
	
	
	// constructor
	public Soldier(String name, int gunCount) {
		this.name = name;
		guns = new Gun[gunCount];
	}
	
	
	// method : addGun
	public void addGun(Gun gun) {
		if (idx < guns.length) {
			guns[idx++] = gun;
		} else {
			System.out.println("더이상 총을 추가할 수 없습니다.");
		}
	}
	
	
	// 1) method : shoot 
	public void shoot() {
		
		for(int i = 0; i<idx ; i++) {
			guns[i].shoot();
		}
		System.out.println( "모든 총을 한 발씩 쏜다." );
	}
	
	// 2) method : shoot 
	public void shoot(int gunNo) {
		guns[gunNo - 1].shoot();
//		System.out.println(gunNo + "번 총만 한 발 쏜다. ( " + guns[gunNo - 1].getModel() + " 사용 )");
	}
		
	
	// 3) method : shoot 
	public void shoot(String model) {
		for(int i = 0; i<idx ; i++) {
			if (guns[i].getModel().contentEquals(model)) {
				guns[i].shoot();
			}
		}
//		System.out.println( model +"를 한 발 쏜다.");
	}
		
	
	
	
	
	
	
	// info method
	public void info() {
		System.out.println("이름 : " + name);
		for (int i = 0 ; i < guns.length ; i++) {
			guns[i].info();
		}
	}
	
	
	
	
	
	// 1) reload method
	public void reload() {
		for (int i = 0; i < guns.length ; i++) {
			guns[i].reload(6);
		}	
	}
	
	// 2) reload method
	public void reload(int gunNo, int bullet) {
		guns[gunNo - 1].reload(bullet);
	}
	// 3) reload method
	public void reload(String model, int bullet) {
		// 향상 for문
		for(Gun gun : guns) {
			if (gun != null && gun.getModel().equals(model)) {
				gun.reload(bullet);
			}
		}
	}
			
		
	
	
	
	
}
