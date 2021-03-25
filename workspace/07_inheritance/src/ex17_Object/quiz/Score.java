package ex17_Object.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Score {

	
	// field
	private int kor, eng, mat;  // 국,영,수


	
	// method : toString() : Override
	@Override
	public String toString() {
		return "[ 국어 : "+ kor +", 영어:"+ eng +", 수학:"+ mat +" ]";
	}
	
	
	
	//method : equals() : Override
	@Override
	public boolean equals(Object obj) {
		
		// this와 obj의 주소값이 같다면 true;
		if (this == obj) {
			return true;
		}
		
		// kor / eng / mat 각각 성적이 같은지 확인
		// 내 성적 : this.kor
		// 상대방 성적 : s.kor
		if (obj instanceof Score) {  // 같은 클래스의 2개의 객체일 때 비교하겠다.
			Score s = (Score)obj;  // 비교 대상 변수 : s (캐스팅)**
			return (kor == s.kor  &&  eng == s.eng  &&  mat == s.mat);
		}
		
		return false;
	}
		
			
				
			

	
	
	
	
	
	
	
	
	
	
	
	
	
}
