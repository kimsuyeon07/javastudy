package ex01_array;

public class Ex02_advanced_for {

	public static void main(String[] args) {
 
		// advanced_for : 향상된 for문
		// 배열의 순회를 인텍스 없이 처리하는 for문
		
		int [] arr = { 10, 20, 30 };
		
		// (자동화) arr배열의 모든 요소를 변수 n으로 하나씩 전달한다.
		for (int n : arr) {
			System.out.println(n);
		}
		
		// 모든 배열의 요소를 1증가 시키고자 한다.
		// arr[0]++, arr[1]++, arr[2]++
		for (int n : arr) {
			n++; //arr 배열의 요소가 증가? NO! (배열의 요소가 증가된 것이 아닌 배열을 값을 가져온 다른 변수 'n'이 증가한 것)
			System.out.println(n);
		}
		
		
		// advanced-for문은 배열의 요소를 수정할 수 는 없다! (제한적인 방법으로 사용한다.)
		// 인덱스를 활용하는 일반 for문이 배열을 요소를 수정할 수 있다.
		
		
		// 일반 for문으로 배열의 요소를 수정해라.
		for (int i=0 ; i < arr.length ; i++) {
			arr[i]++;
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
	}
}
