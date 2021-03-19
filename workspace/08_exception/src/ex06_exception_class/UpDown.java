package ex06_exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpDown {

	// field
	private int answer;  // 발생된 난수
	private int count;   // 시도 횟수
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public UpDown() {
		answer = (int)(Math.random() * 100) +1 ;  // 1 ~ 100 사이의 난수 발생
	}
	
	
	
	// method : challenge() : 숫자 입력
	public int challenge() throws UpDownException, InputMismatchException {
		count++; // 잘못 입력해도 count하겠다.
		System.out.println("1 ~ 100 사이의 정수를 입력하세요 >>>");
		int n = sc.nextInt();    // 입력이 int가 아니면 InputMismatchException이 발생합니다. 
								 // (throws에서 자동완성되는 Exception)
								 // -
		if (n < 1 || n > 100) {  // 범위를 벗어난 값 (예외 발생)
			throw new UpDownException();  // throw를 던지는 행위.  
		} //if문 종료						  // ** throws 도 같이 작성해줘야 오류가 나지 않는다.
		return n;
	} //challenge() 메서드 종료
	
	
	
	
	// method : play() : 입력받은 값으로; 오답이라면 힌트 출력, 정답이라면 정답! 확인.
	public void play() {
		while (true) {
			try {
				int n = challenge();  // UpDownException, IntputMismatchException이 발생되는 곳입니다.
									  // : challenge()를 호출하면 throws 중 한개의 Exception을 던진다.
				// ↓
				// 오류나면 if문이 실행되지 않는다. => catch문으로 이동.
				// ↓
				// 큰 수를 입력하면 DOWN! 작은 수를 입력하면 UP! 정답이라면 play()메서드 종료.
				if (n < answer) {
					System.out.println("UP!");
				}else if (n > answer) {
					System.out.println("DOWN!");
				} else {
					System.out.println("정답! " + answer + "를 맞혔습니다. ( " + count + "번 만의 정답 )");
					return;
				} 
				// ↓
			} catch (UpDownException e) {
				// 1 ~ 100 사이의 값을 입력해야 합니다.
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				// 정수가 아닌 값이 입력되는 경우
				// 그 값은 어디에도 저장되지 못하고 게속 입력에 남아있기 때문에 '제거'가 필요하다!
				sc.next();  // 입력 받은 변수는 없어도 된다. 어파피 사용이 목적이 아니다.
				System.out.println(e.getMessage());
			}// try의 catch문 종료
		} //while문 종료
	} //paly() 메서드 종료
	
				
				
				
			
	
	
	
	
	
	
	
	
	
	
	
	
}
