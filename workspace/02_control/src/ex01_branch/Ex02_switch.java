package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {
 
		
		// switch문
		
		int choice = 1;
		
		switch (choice) {
		case 1: 
			System.out.println("1이다.");
			break; // ==> switch문을 종료합니다. 라는 의미
		case 2:
			System.out.println("2이다.");
			break;
		default:
			System.out.println("default : 모두 해당하는 경우가 없다면 실행한다.");
			break; //(넣지 않는게 좋음. => 오류가 나지는 않음.) ; 
			       // default처리가 끝나면 알아서 switch문이 끝나기 때문에 굳이 적을 필요 없다.(불필요.)
		}
		
		
		
		
		
		
		
		
	}
}
