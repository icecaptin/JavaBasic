package Chapter7_1;

public interface Messenger {
	
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	public abstract String getMessage();
	
	public abstract void setMessage(String msg);
	
	public default void setLogin(boolean login) {
		log();
		if(login) {
			System.out.println("Login");
		}else {
			System.out.println("Logout");
		}
	}
	
	public static void getConnection() {
		System.out.println("Connecting Network");
	}
	
	private void log() {
		System.out.println("Start Job!");
	}
}
