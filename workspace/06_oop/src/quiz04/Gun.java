package quiz04;

public class Gun {

	
	// field
	private String model;
	private int bullet;  // 총알 개수
	private final int FULL_BULLET = 6;  // 최대 6발
	
	// constructor
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}

	 public void shoot() {
		 if (bullet > 0) {
				bullet--;
				System.out.println("빵야! "+ bullet +"발 남았다.");
			} else {
				System.out.println("헛빵!");
			}
	 }
	
	 public void reload(int bullet) {
		 if (this.bullet + bullet <= FULL_BULLET ) {
			 this.bullet += bullet;
			 System.out.println( bullet + "발이 장전되었다. 현재 "+ this.bullet +"발");
		 } else {
			 int realBullet = FULL_BULLET - this.bullet;
			 this.bullet = FULL_BULLET;
			 System.out.println( realBullet + "발이 장전되었다. 현재 "+ this.bullet +"발.");
		 }
	 }
	 
	 public void info() {
		 System.out.println( model + "에 " + this.bullet +"발 남았다.");
	 }
	 

	
	// addBullet method 
//	public int addBullet() {
//		return ;
//	}
//	

	
	
	
	// 필수 메서드
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
		
	}

	public int getFULL_BULLET() {
		return FULL_BULLET;
	}

	
	
	
	
	
	
	
}
