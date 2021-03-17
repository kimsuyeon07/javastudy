package ex02_loop;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
 
		// 5. 10,000원 모두 사용하기
		//    현재 10,000원이 있습니다.
		//    결제금액 : 5,000원
		//    현재 5,000원 있습니다.
		//    결제금액 : -100원
		//    -100원은 결제할 수 없습니다.
		//    현재 5,000원 있습니다.
		//    결제금액 : 10,000원
		//    5,000원이 부족합니다.
		//    현재 5,000원 있습니다.
		//    결제금액 : 5,000원
		//    현재 0원이 있습니다.
		//    종료.
		
		Scanner sc = new Scanner(System.in);
		// 현재 금액
		int money = 10000;
		
		while (true) {
			System.out.println("현재 "+ (money) +"원 있습니다.");
			// 현재 0원이 있습니다.
			if (money == 0) {
				break;
			}
			
			// 결제 금액 입력
			System.out.println("결제 금액 : ");
			int useMoney = sc.nextInt();
			
			// 결제금액이 음수일 때,
			if (useMoney < 0) {
				System.out.println(useMoney + "원은 결제할 수 없습니다.");
				continue;
				
			  // 5,000원이 부족합니다. (결제 금액이 남은 돈보다 많을 때)
			} else if (useMoney > money) {
				System.out.println((useMoney - money) + "원이 부족합니다.");
				continue;
				
			} else {
				// 남은 금액 계산
				money -= useMoney;
			}			
		}
		
		sc.close();
		
		
		
	}
}
