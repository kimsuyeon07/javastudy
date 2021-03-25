package ex01_array;

import java.util.Scanner;

public class Qiuz02 {

	public static void main(String[] args) {
 
//		String[] friendList = {"타요", "짱구", "스폰지밥"};
//        새로 사귄 친구의 수를 입력 받아서, friendList배열의 길이를 늘이기
		
		
		Scanner sc = new Scanner(System.in);
		
		// (배열 : friendList) 현재 저장된 배열 초기화
		String [] friendList = {"타요" , "짱구" , "스폰지밥" };
//		String [] friendListPlus = new String[10];
		
		// 새로 사귄 친구의 수 : 입력
		System.out.print("새로 사귄 친구가 몇 명 ? ");
		int newFriend = sc.nextInt();
		
		// (배열 : temp) 새로운 배열 생성 : 배열의 길이 증가
		String[] temp = new String[friendList.length + newFriend];
		
		// temp의 배열에 friendList 배열값을 넘겨온다.
		for (int i = 0 ; i < friendList.length ; i++) {
			temp[i] = friendList[i];
		}
		
		// 새 친구들을 입력 받습니다.
		for (int i = friendList.length ; i < temp.length ; i++) {
			System.out.print("새로 사귄 친구 이름 : ");
			temp[i] = sc.next(); 
		}
		
		// 새로운 배열로 기존 친구 명단을 넘깁니다. 
		// (friendList배열에 새로운 주소값이 담겼다.)
		friendList = temp;
		
		// 확인
		for (String friend : friendList) {
			System.out.print(friend + " ");
		}
		
		
		sc.close();
		
		
	}
}
