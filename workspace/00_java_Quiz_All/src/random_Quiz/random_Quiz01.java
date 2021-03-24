package random_Quiz;

public class random_Quiz01 {
	
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
		

		// 방법 1
		// 비밀번호 : 초기화는 빈 문자열로.
		String tempPw = "";
		
		// 비밀번호 6자리 랜덤생성 (임시 비밀번호)
		for (int n = 0 ; n < 6 ; n++) {
			// 인덱스번호를 랜덤하게 뽑는다.
			int idx = (int)(Math.random() * charSet.length) + 0;
			// 임시 비밀번호를 tempPw변수에 저장
			tempPw += charSet[idx];
		}
		System.out.println("임시 비밀번호 발급  [ " + tempPw + " ]");
		
		
		// 방법 2.
		// 문자 == 정수
		// '0' ~ '9' == 48 ~ 57  == 0+48 ~ 9+48
		// 'A' ~ 'Z' == 65 ~ 90
		// 'a' ~ 'z' == 97 ~ 122
		
		// 비밀번호 : 초기화는 빈 문자열로
		String tempPw2 = "";
		
		// 임시비밀번호 6자리
		for (int n = 0 ; n < 6 ; n++) {
			// 영문대문자 + 아라비아숫자 6자리  : 약 5:5 비율로
			if (Math.random() < 0.5) {
				// 숫자
				int arabia = (int)(Math.random() * 10) + '0';  // char:'0' = int:48 과 같은 값 : 10 + 48을 한 값
				tempPw2 += (char)arabia;
			} else {
				int alphabet = (int)(Math.random() * 26) + 'A';  // char:'A' = int:65  :  
				tempPw2 += (char)alphabet;
			}
		}
		System.out.println("임시비밀번호 [ " + tempPw2 + " ]");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
