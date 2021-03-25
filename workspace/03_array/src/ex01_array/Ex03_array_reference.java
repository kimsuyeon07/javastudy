package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
 
		// array - reference(참조)  (01_basic : Ex01_variable : Ex04_reference_type *참고)
		// reference type : 주소를 저장할 때 사용한다.
		// 배열은 reference(레퍼런스) type 이다.
		
		int [] arr = new int [3];
		
		System.out.println(arr);
		// new int[3]을 통해서 생성된 배열요소들의 주소가 저장되어있다.
		// 값 : [I@15db9742    (@ : 'at' 어디에 있는. / '15'번지에 있는   / 'db9742'16진수로 되어있는 주소값)

		System.out.println();
		
		// * 배열의 길이를 조정하는 (일반적으로 늘이는 작업) 코드 *
		int[] a = { 1, 2, 3 } ; // 배열 a의 길이 : 3
		int[] b = new int[10];  // 배열 b의 길이 : 10
		
		// b[0] = a[0],  b[1] = a[1],  b[2] = a[2]
		for (int i = 0; i<a.length ; i++) {
			b[i] = a[i];
			// a = 1, 2, 3
			// b = 1, 2, 3, 0, 0, 0, 0, 0, 0, 0 
			
			// a에는 { 1, 2, 3 }이 저장된 주소가 있다.
			// b에는 [ 1, 2, 3, 0, 0, 0, 0, 0, 0, 0 ]이 저장된 주소가 있다.
			
			a = b;  // a가 수정되는 것 (b의 값을 a에게 대입한다.)
			        // a = { 1, 2, 3, 0, 0, 0, 0, 0, 0, 0 }
			
			// 방금까지의 연산을 통해서 : * 배열 a의 길이가 증가했다! *);
		}
		
		for (int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		
		
		// 메모리 누수 : 데이터를 만들었지만 아무도 쓰지 않아 버려진?잊혀진? 데이터 {초기의 a배열의 데이터값}
		// => "JVM"이 알아서 제거해준다. : Garbage Collection (쓰레기 수집)
		// System.gc(); : 해당 코드를 사용할 수 도 있다. (바로 삭제가 되는 것은 아님. 개발자가 할 수 있는 독촉 정도)
		
		
		
		
		
	}
}
