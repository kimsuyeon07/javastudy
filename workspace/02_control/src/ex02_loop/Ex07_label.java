package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		
		// label
		// 1. 소스코드의 특정 위치를 지정하는 방법.
		// 2. 방법
		//    label: 소스코드
 
		// [ 참고용 ] label을 없을 때 사용한 모습
//		for (int dan = 2 ; dan <= 9 ; dan++) {
//			
//			if (dan > 5) {break;}
//			
//			for(int n = 1; n <= 9 ; n++) {
//				
//				System.out.println(dan + "X" + n +"=" + (dan *n));
//				
//				if (dan == 5 && n == 5) {
//					break; // (inner for문에만 적용되기 때문에 적용이 안된다..)
//				}
//			}
//		}
		
		// label 사용
		outer: for (int dan =2 ; dan <= 9 ; dan++) {
			inner: for (int n = 1; n <= 9 ; n++) {
				System.out.println(dan + "X" + n + "=" + (dan * n));
				if (dan == 5 && n==5) {
					break outer;
				}
			}
		}
		
		
		
		
		
		
	}
}
