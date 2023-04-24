package Chapter11;
import java.io.*;

public class Test03 {
	
	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("a.txt")) {
			int c = fi.read();
			System.out.println((char) c);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
