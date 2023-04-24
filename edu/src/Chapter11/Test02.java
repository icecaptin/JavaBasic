package Chapter11;

import java.io.FileInputStream;

public class Test02 {
	public static void main(String[] args) {
		FileInputStream fi;
		try {
			FileInputStream fi = new FileInputStream("a.txt");
//			System.out.println("1");
//			System.out.println("2");
//			System.out.println("3");
//			string s = null 없으면 지나감
			String s = null;
			s.length();
		} catch(Exception e) {
			System.out.println("Error");
		} finally {
			fi.close();
			System.out.println("OK");
		}
		System.out.println("4");
	}
}
