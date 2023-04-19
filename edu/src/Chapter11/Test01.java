package Chapter11;

public class Test01 {
	public static void main(String[] args) {
		try {
		int arr[] = new int[3];
		arr[3] = 30;
		System.out.println("OK");
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Wrong");
	}
		System.out.println("Good");
	}
	
//	public static void main(String[] args) {
//		try {
//			String s = new String("java");
//			int len = s.length();
//			s = null;
//			s.length(); // new NullPointerException()
//			int arr[] = new int[3];
//			arr[3] = 30; // new ArrayIndexOutOfBoundsException()
//			System.out.println("OK");
//		} catch (ArrayIndexOutOfBoundsException e1) {
//			System.out.println(e1.getMessage());
//		} catch (NullPointerException e2) {
//			e2.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("Wrong : " + e);
//		}
//		System.out.println("GOOD");
//	}
}
