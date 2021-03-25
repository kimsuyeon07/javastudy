package quiz04;

public abstract class Fighter {

	// field
	private String name;
	private boolean isAlive;  // energe가 0이면 false
	private int energy;  // 에너지 (1~100)
	private int power;   // 공격력 (1~10)

	// constructor
	public Fighter(String name, int energy, int power) {
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive = true;  // 살아있다 = true
	}
	
	// method
	public abstract void attack(Fighter fighter);  // 내가 누구에게 공격한다.

	
	// method : Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		// energy가 음수로 떨어지면 0을 주겠다.  
		this.energy = (energy < 0) ? 0 : energy;
		// energy가 0보다 커야 살아있다고 본다.
		setAlive(this.energy > 0);
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}

	// method : info()
	public void info() {
		System.out.println("[ 이름 : " + name + ", 에너지  : " + energy + ", 공격력 : " + power + " ]");
	}






	
	
	
	
	
}
