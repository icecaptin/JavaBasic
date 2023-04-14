package Chapter8.innerClass;

public class 익명클래스 {
	interface Messenger {
		String getMessage();

		void setMessage(String msg);
	}

	class GalaxyMessenger implements Messenger {
		public String getMessage() {
			return "good";
		}

		public void setMessage(String msg) {
			System.out.println("my data = " + msg);
		}

		public void changeMode() {
			System.out.println("changed");
		}
	}

	public static void main(String[] args) {
		Messenger gm = new Messenger() {
			};
		}

}
