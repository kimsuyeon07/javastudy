package quiz01;

/*
 		SuperClass : Weapon
 		SubClass   : Gun
 		
 */

public class Mainclaas {

	public static void main(String[] args) {

		
		// 각각 10발씩 들어있다. : **Thread타입의 객체생성으로 만들어줘야한다.**
		Thread gun1 = new Thread (new Gun("베레타", 10));
		Thread gun2 = new Thread (new Gun("콜트", 10));
		
		// 실행 메서드 : .start();
		gun1.start();
		gun2.start();
		
		// 실행 예시
		// 콜트 1발 쐈다.
		// 콜트 2발 쐈다.
		// 베레타 1발 쐈다.
		// ...
		// 총알이 다 떨어질 때 까지.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
