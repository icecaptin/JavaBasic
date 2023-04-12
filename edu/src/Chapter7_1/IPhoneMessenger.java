package Chapter7_1;

public class IPhoneMessenger implements Messenger {

	@Override
	public String getMessage() {
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("Typing on iPhone: " + msg);

	}
	
	public void clearMessage() {
		System.out.println("Shake for remove messages");
	}
}
