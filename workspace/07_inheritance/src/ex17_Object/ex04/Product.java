package ex17_Object.ex04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Product {

	
	// field
	private String model;         // 모델명
	private String manufacturer;  // 제조사
	private String date;          // 제조일자

	
	// method : equals() : Override
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {  // p1.equals(p1) => 일 때 실행된다.
			return true;
		}
		if (obj instanceof Product) { // p1.equals(p2)
			Product p = (Product)obj; // Product객체를 오류가 나지 않도록 하기 위해서 [ 캐스팅 ] 후 사용한다.
			// 모델과 제조사를 배교해서 동일하면 true 반환, 아니면 false 반환
			// p1.equals(p2)인 경우
			// p1의 모델 : this.model
			// p2의 모델 : p.model
			// 이 코드에서 equals()는 String의 메서드 사용. ( model, manufacturer은 문자열타입의 변수이기 때문에 )
			if(this.model.equals(p.model) && this.manufacturer.equals(p.manufacturer)) {
				return true;
			} else { 
				return false;
			}
		}
		return false;  // obj가 Product이 아니다.
	}
	
	
	
	
	
	
	
	
	
	
	
}
