package ex01_user_type;
/*
 	클래스 구성
 	1. 필드 (field)
 	   : 클래스에 선언한 변수 (값)
 	2. 메서드 (method)
 	   : 클래스에 정의한(;만들어진) 함수 (기능)
 * */
public class Person {

	
	// 필드 선언 (변수 선언) ; 
	// => 클래스에서는 변수를 "필드"라고 부른다. <변수 != 필드>
	
	// 일반 변수와는 달리, 필드는 자동으로 초기화가 된다. ( 0(= true)이나 false, null 값을 가진다.)
	String name;       // (초기화 값) String : null
	int age;           // (초기화 값) int : 0
	double height;     // (초기화 값) double : 0.0
	char gender;       // (초기화 값) char : '\0' (널 문자)
	boolean isKorean;  // (초기화 값) boolean false
	
	
	
}
