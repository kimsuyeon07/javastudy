package ex07_recursive;

public class SayHello {

	public void say(int n) {
		
		if( n > 0 ) {
			System.out.println("Hello");
			
			// 재귀적 호출 : 자기 자신을 호출한다.
			// 값을 전달 할 때, " n - 1 " 로 전달하게 한다.
			say(n-1);  
		}
	}
			
		
	
	
	
}
