package ex02_string;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 1. 시간을 입력받아서 출력
		//    시간  :  9
		//    분     :  5
		//    초     :  30
		//    9 : 05 : 30 입니다.
		
		Scanner sc = new Scanner(System.in);
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		System.out.print("시간 : ");
		hour = sc.nextInt();
		
		System.out.print("분 : ");
		minute = sc.nextInt();
		
		System.out.print("초 : ");
		second = sc.nextInt();
		
		String strHour = hour + "";
		String strMinute = minute + "";
		String strSecond = second + "";
		
		if (strMinute.length() == 1) {
			strMinute = "0" + strMinute;
		}
		if (strSecond.length() == 1) {
			strSecond = "0" + strSecond;
		}
		
		String time = strHour + " : " + strMinute + " : " + strSecond + " 입니다.";
		
		
		System.out.println(time);
		
		
		
		
		
		
		
		
	}
}
