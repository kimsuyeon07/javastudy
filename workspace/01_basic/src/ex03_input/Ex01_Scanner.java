package ex03_input;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
 
		// Scanner 클래스
		// 1. 패키지 : java.util
		// 2. import가 필요. 
		//    - import가 필요없는 패키지 : java.lang (자바랭 = 자바언어)
		//      - (첫번째글자가 '대문자'이면 클래스를 의미) : String, System.out.println() 같은 경우
		// 3. 메소드
		//    1) nextInt()    : int 입력
		//    2) nextLong()   : long 입력
		//    3) nextDouble() : double 입력
		//    4) next()       : String 입력 (공백 없는 String)
		//    5) nextLine()   : String 입력 (공백 있는 String)
		
		
		// 입력을 위해서는 "표준 입력 스트림"을 사용합니다.
		// 표준 입력 스트림 : System.in
		
		// 자동 완성 : Ctrl + Space bar  (import를 자동으로 완성시켜줄 때 사용.)
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 이름 입력하기
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();  // 이름에 공백이 가능
		
		// 2. 나이 입력하기
		System.out.println("나이를 입력하세요.");
		int age =  sc.nextInt();
		
		// 3. 키 입력하기
		System.out.println("키를 입력하세요.");
		double height = sc.nextDouble();
		
		// 4. 성별 입력하기
		System.out.println("성별을 입력하세요.");
		char gender = sc.next().charAt(0);  // charAt("index")  
		                                    // => index : 문자의 순서라고 보면 됨. (남 , 여) 한단어로 입력할 것이라 [ charAt(0); 로 처리 ]
		
		// 5. 입력 정보 확인하기
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(gender);
		
		// 6. 스트림 닫기
		sc.close(); // 생략이 가능. (알아서 닫아주기 때문에.)
		
		
		
		
		
	}
}
