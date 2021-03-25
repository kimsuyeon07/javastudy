package quiz04;

public class MainClass {

	public static void main(String[] args) {

		Fighter fighter1 = new KoreanFighter("정찬성");  // 에너지, 공격력 = 랜덤 생성
		Fighter fighter2 = new GolbalFighter("애드가");  // 에너지, 공격력 = 랜덤 생성
		
		fighter1.info();
		fighter2.info();
		
		// 선빵 결정
		boolean myTurn = Math.random() < 0.5 ;
		
		
		// 공격 순서 : 기준 - fighter1
		do {
			if (myTurn) {
				fighter1.attack(fighter2);  // fighter1의 공격
				myTurn = false;
			} else {
				myTurn = true;
				fighter2.attack(fighter1);  // fighter2의 공격
			}
		} while (fighter1.isAlive() && fighter2.isAlive());
		// fighter1과 fighter2가 모두 살아있으면
		// fighter1.getEnergy() > 0 && fighter2.getEnergy() > 0
		
		System.out.println("FIGHTER OVER!");
		
		// 결과 확인 : 
		if(fighter1.isAlive()) {
			System.out.println(fighter1.getName() + " VICTORY! 남은 에너지 : " + fighter1.getEnergy());
		} else {
			System.out.println(fighter2.getName() + " VICTORY! 남은 에너지 : " + fighter2.getEnergy());
		}
		
		
		
		
		
		
	}
}
