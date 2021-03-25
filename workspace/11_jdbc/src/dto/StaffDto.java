package dto;

import java.sql.Date;

import lombok.Data;

// DB Table에 저장된 행(Row)을 저장하는 클래스
// VO  : Value Object
// DTO : Data Transfer Object

// * 데이터베이스의 칼럼이름은 '대문자'
// 테이블 칼럼             클래스 필드
// BOARD_NO     board_no 또는 boardNo(선호)
// BNO          bNo

// ** 디폴트 생성자 필수 : 생성자를 안 만들거나, 디폴트 생성자와 필드를 이용한 생성자를 모두 만든다.
// ** Getter and Setter 필수

// Lombok사용.
@Data  // -> Getter, Setter, 디폴드생성자를 만들어준다. (생성자값이 있는 생성자는 따로 만들어야 한다.)
public class StaffDto {

	// field
	private int no;
	private String name;
	private String department;
	private Date hireDate;
	
	// constructor
	// 생성자값이 있다는 것은 생성방법이 이것 하나뿐이다 : 디폴드 생성자를 사용할 수 없다.
	
	
	// method 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
