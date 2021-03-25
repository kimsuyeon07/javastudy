package ex08_exception_class;

@SuppressWarnings("serial")
public class BankAccountException extends Exception {

	
	// field
	private int errorCode;
	
	// constructor
	public BankAccountException(String message, int errorCode) {
		super(message);  // Exception클래스로 message를 전달하면 "예외메시지"로 생성됩니다.
		this.errorCode = errorCode;
	}
	

	// method : Getter and Setter
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	
	
	
	
	
	
	
	
}
