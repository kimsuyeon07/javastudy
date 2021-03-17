package ex07_recursive;

public class MainClass {

	public static void main(String[] args) {
 
		SayHello sh = new SayHello();
		sh.say(5);  // .say( "n" );  :  n 
		
		
		Adder adder = new Adder();
		adder.calculate(10);  // 1 ~ 10 까지 합계 구해서 보여준다.
		
		// 합계 : total을 출력
		System.out.println( "합계 : " + adder.getTotal());
		
		
		
		// 
		Calculator calc = new Calculator();
		int n = 5;
		System.out.println(n + "! = " + calc.getFactorial(n));
		
		
		
		
		
		
		
		
	}
}
