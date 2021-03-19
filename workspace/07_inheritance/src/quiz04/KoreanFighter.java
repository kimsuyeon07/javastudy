package quiz04;

public class KoreanFighter extends Fighter {

	// field
	
	
	// constructor
	public KoreanFighter(String name) {
		super(name, (int)(Math.random()*100)+1, (int)(Math.random()*10)+1);
	}
		
		
	// method
	// attack() : 20% 확률로 한 방에 KO 시킬 수 있다.
	@Override
	public void attack(Fighter fighter) {  
		// * Golbal, Korean 모두 담을 수 있는 Fighter로 지정 *
		// 공격(power)하면 상대방fighter의 에너지(energy)에 데미지를 입힌다.
		// 나 : this  |  상대방 : fighter
		
		// 상대편의 에너지를 20%확률로 제로로 만들 수 있다.
		if(Math.random() < 0.2) {
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + " KO!");
			fighter.setAlive(false);
		  // 아니면 내 power만큼 상대편 energy가 줄어든다.
		} else {
			fighter.setEnergy( (fighter.getEnergy()) - (this.getPower()) );
			System.out.println("공격 : " + this.getName() + " [ " + fighter.getName() + " 남은 에너지 : " + fighter.getEnergy() + " ]");
		}
		// 살아있다.
	}

	
	
	
}
