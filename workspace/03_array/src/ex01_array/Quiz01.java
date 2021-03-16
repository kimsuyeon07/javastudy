package ex01_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 길이가 3인 String타입의 배열 선언, 3개 이름을 입력받아 배열에 저장하고 확인하기.
		
		Scanner sc = new Scanner(System.in);
		String [] arr = new String[3];
		
		for(int i = 0; i<arr.length ; i++) {
			System.out.print( (i + 1) + " 이름 : ");
			arr[i] = sc.next();
			
		}
		
		for (String name : arr) {
			System.out.print(name + " ");
		}
			
		
		sc.close();
		
		
		
	}
}
