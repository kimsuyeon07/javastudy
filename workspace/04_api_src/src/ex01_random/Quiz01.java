package ex01_random;

public class Quiz01 {

	public static void main(String[] args) {
 
		// 1. 임시비밀번호 발급하기
		// 영문대문자 + 아라비아숫자 6자리
		// 약 5:5 비율로
		
		
		char [] charSet = { 
				'0','1','2','3','4','5',
				'6','7','8','9','A','B',
				'C','D','E','F','G','H',
				'I','J','K','L','M','N',
				'O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'
		};
		
		// 인덱스를 랜덤하게 생성.
		String tempPw = "";  // (빈 문자열로 초기화)
		// 6자리 비밀번호
		for(int n = 0 ; n < 6 ; n++) {
			int idx = (int)(Math.random() * charSet.length) + 0;
			// (tempPw에 값을 계속 저장한다)
			// tempPw = charSet[idx], charSet[idx], charSet[idx], charSet[idx], charSet[idx], charSet[idx];
			tempPw += charSet[idx]; 
		}
		System.out.println(tempPw);
		
		
		
		// 방법 2.
		// 문자 == 정수
		// '0' ~ '9' == 48 ~ 57  == 0+48 ~ 9+48
		// 'A' ~ 'Z' == 65 ~ 90
		// 'a' ~ 'z' == 97 ~ 122
		
		String tempPw2 = "";
		for (int n = 0 ; n < 6 ; n++) {
			
			if (Math.random() < 0.5) {
				int arabia = (int)(Math.random() * 10) + '0';  // char:'0' = int:48 과 같은 값
				tempPw2 += (char)arabia;
			} else {
				int alphabet = (int)(Math.random() * 26) + 'A';
				tempPw2 += (char)alphabet;
			}
			
		}
		System.out.println(tempPw2);
			
		
		
		
		
		
		
		
		
		
		
	}
}
