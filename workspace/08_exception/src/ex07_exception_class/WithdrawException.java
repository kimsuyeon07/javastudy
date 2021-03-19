package ex07_exception_class;

@SuppressWarnings("serial")
public class WithdrawException extends Exception {
	
	// field
	private int errorCode;
	
	// constructor
	public WithdrawException(String message, int errorCode) {
		super(message);
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
