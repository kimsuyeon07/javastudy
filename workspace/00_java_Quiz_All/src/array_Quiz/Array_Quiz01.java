package array_Quiz;

import java.util.Scanner;

//String[] friendList = {"타요", "짱구", "스폰지밥"};
//새로 사귄 친구의 수를 입력 받아서, friendList배열의 길이를 늘이기

public class Array_Quiz01 {
	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 현재 친구 배열
		String[] friendList = {"짱구", "타요", "스폰지밥"};
		
		// 새로 사귄 친구의 수 입력
		System.out.print("새로 사귄 친구의 수 : ");
		int friendCount = sc.nextInt();
		
		// 새로운 배열 생성 : 현재 친구와 새로운 친구 수를 합 : 배열의 길이
		String[] friendList2 = new String[friendList.length + friendCount];
		
		// 현재 친구를 새로운 배열에 전달
		for(int i = 0 ; i < friendList.length ; i++) {
			friendList2[i] = friendList[i];
		}
		
		// 새로운 친구를 입력받는다.
		for(int i = 0 ; i < friendList2.length ; i++) {
			
			//배열 안의 데이터값이 없을 때 입력받겠다.ㅓ 
			if(friendList2[i] == null) {
				System.out.print("새로운 친구 이름 : ");
				String friendName = sc.next();
				friendList2[i] = friendName;
			}
		}
		
		// 현재 배열의 길이를 늘린다. (새로운 배열의 주소값을 현재 배열에 전달)
		friendList = friendList2;
		
		// 배열 출력 : for 향상문
		for (String friends : friendList) {
			System.out.print(friends + " ");
		}
		
		
		sc.close();
		
		
	
		
		
		
		
		
		
		
		
	}
}
