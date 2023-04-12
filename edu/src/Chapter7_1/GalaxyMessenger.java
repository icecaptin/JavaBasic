package Chapter7_1;

public class GalaxyMessenger implements Messenger {

	@Override
	public String getMessage() {
		return "Galaxy";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("Typing on Galaxy: " + msg);

	}
	
	public void clearMessage() {
		System.out.println("Touch Keyboard Icon Then Change Keyboard");
	}

}

