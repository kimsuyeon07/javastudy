package ex01_array;

		 /*
		 array 배열
		 1. 변수가 여러 개 필요할 때 사용
		 2. 같은 이름 + 식별번호를 통해서 표현
		 3. 선언 : 
		    방법.1) int[] a(배열이름) = new int[n]; <= 변수를 'n'개 생성하겠다.(int타입 변수 'n'개를 사용할 수있는 배열 a 생성)
		    방법.2) int[] a;
		           a = new int[n];
		    방법.3) int a[] = new int[n];  <= 추천하지 않는 방법. (과거에 사용했던 방법)
		 4. 초기화
		    1) int[] a = {10, 20, 30};
		    2) 주의사항 : 아래는 안 됩니다.(*초기화는 반드시 선언할 때 같이 진행한다!*)
		       int[] a;
		       a = { 10, 20, 30 };
		 5. 생성되는 변수
		    int[] a = new int[3];
		    a[0] : '0'으로 초기화가 되어 있는 상태 (자동)
		    a[1] : '0'으로 초기화가 되어 있는 상태 (자동)
		    a[2] : '0'으로 초기화가 되어 있는 상태 (자동)
		 6. 용어
		    int[] a = new int[3];
		    1) 배열이름 : a
		    2) 배열길이 : 3 (a.length)
		    3) 인덱스    : 0, 1, 2 (식별번호 : 0부터 시작한다.)
		                사용이 불가능한 인덱스를 사용하면 "ArrayIndexOutOfBoundsException" 예외가 발생한다. [정해진 인덱스번호만 사용할 수 있다!]
		 */

public class Ex01_array {

	public static void main(String[] args) {
 
		
		// 1. 배열의 선언 및 생성   < *암기* >
		int[] a = new int[3];
		
		// 2. 확인 : 자동으로 초기화값은 '0'이 저장되어있음.
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// 3. 배열의 순회 (for문 : 반복문으로 출력할 수 있다.) < *암기* >
		// 인덱스가 기준!
		// 인덱스 : 0 ~ 길이 -1  --- ( 0 <= 인덱스 < 길이  )
		for (int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]);
		}
		
		// 4. 가용 범위를 벗어난 인덱스를 사용
		System.out.println(a[3]);
		// -> 오류) ArrayIndexOutOfBoundsException: 3
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
