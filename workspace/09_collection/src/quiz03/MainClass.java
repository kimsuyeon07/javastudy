package quiz03;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		// lotto 번호 6개를 HashSet에 저장하기
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		// 번호 6개 추가 : lotto가 6개가 될때 까지. while문으로 
		while (lotto.size() != 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
			
		System.out.println(lotto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
