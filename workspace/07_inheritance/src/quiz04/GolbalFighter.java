package quiz04;

public class GolbalFighter extends Fighter {

	// field
	
	
	// construct
	public GolbalFighter(String name) {
		super(name, (int)(Math.random()*100)+1, (int)(Math.random()*10)+1);
	}
	
	// method
	// attack() : 10% 확률로 한 방에 KO 시킬 수 있다.
	@Override
	public void attack(Fighter fighter) {
		// 공격(power)하면 상대편fighter의 에너지(energy)가 줄어든다.
		// 나 : this   |   상대편 : fighter
		
		// 10%확률로 상대편의 에너지가 0
		if(Math.random() < 0.1) {
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + " KO!");
		} else {
			// 공격한 만큼 데미지를 입는다.
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println("공격 : " + this.getName() + " [ " + fighter.getName() + " 남은 에너지 : " + fighter.getEnergy() + " ]");
		}
	}
	
	
	
	
	
}
