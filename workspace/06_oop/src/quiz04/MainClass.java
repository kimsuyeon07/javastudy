package quiz04;

public class MainClass {

	public static void main(String[] args) {

		Gun gun = new Gun("K2", 2);
		Soldier soldier = new Soldier("람보", gun);
		
		soldier.shoot();  // 빵야! 1발 남았다.
		soldier.shoot();  // 빵야! 0발 남았다.
		soldier.shoot();  // 헛빵!
		// "bullet값으로 값이 만들어기 때문에" < Gun클래스에서 작업 >
		// * Soldier클래스에서 gun.shoot()을 호출하는 방식으로 작업한다. * 
		
		soldier.reload(2); // 2발이 장전되었다. 현재 2발
		soldier.reload(6); // 4발이 장전되었다. 현재 6발.
		soldier.reload(6); // 0발이 장전되었다. 현재 6발.
		
		soldier.info();    // 람보, K2에 6발 남았다.
		
		
		
		
		
		
		
		
		
	}
}
