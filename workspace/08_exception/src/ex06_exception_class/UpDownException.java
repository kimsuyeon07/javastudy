package ex06_exception_class;

// 예외 클래스는 "직렬화"를 대비해서 serialversionID를 생성하라고 (항상 경고를 띄운다)
// "직렬화" 처리할 필요가 없다면, 경고 메시지를 무시하라는 @SuppressWarnings 애너테이션을 추가합니다.
// 입력 : [ @SuppressWarnings ("Serial") ]  -> JAVA에게 알리는 메시지
//       => 클래스명(UpDownException)에 마우스 가져다 대면 나오는 Add관련메시지 클릭하면 "자동완성"


@SuppressWarnings("serial")
public class UpDownException extends Exception {

	// 예외클래스는 주로 어떤 일을 수행하냐면,
	// 예외메시지(예외가 발생한 이유)를 저장합니다.
	
	
	//constructor : 생성자에서 작업해준다.
	//			  : ** 상속받은 클래스(자식클래스)는 부모클래스의 생성자를 호출해야 한다!!
	public UpDownException() {
		super("1~100사이의 값을 입력해야 합니다.");  // 예외메시지를 Exception에게 전달하면 됩니다.
										   // " "  : 개발자가 넣고 싶은 내용 작성
	}
	
	
	
}
