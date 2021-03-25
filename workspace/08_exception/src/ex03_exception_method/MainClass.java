package ex03_exception_method;

public class MainClass {

	public static void main(String[] args) {

		
		try {
//			int a = 2/ 0;             // => ArithmeticException
			Integer.parseInt("1.5");  // => NumberFormatException
		} catch (ArithmeticException e) {
			
			// e에는 무엇이 들어있는지 획인해봅시다.
			// ↓
			// (Throwable)method : String 타입 (사용자를 위해서 안내해주는)
			System.out.println("예외메시지 : " + e.getMessage());
			// ↓
			// (Throwable)method : void 타입
			e.printStackTrace();  // 개발자가 넣어 두는 코드
			// ↓
			
			

		}
		

		// push  /  pop
		// 1, 2, 3(순서)  :  넣을 땐(push) - 1,2,3  |  빼올 댄(pop) - 3,2,1
		// 예) 사이트 들어갔던 순서  => 1.구글    2.네이버    3.다음       //    이전으로 가기(← Back) => 3.다음   2.네이버   1.구글  
		// Last In First Out : LIFO
		
		
		
		
		
		
		
		
		
		
		
	}
}
