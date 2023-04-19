package Chapter10;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+"\t");
		}
		
		list.add(1, "LA");  
		list.addFirst("런던");
		list.addLast("서울");
		
		list.offer("파리");
		list.offerFirst("로마");
		list.offerLast("바이에른");
		
		System.out.println("7: " + list.peek());
		System.out.println("8: " + list.peekFirst());
		System.out.println("9: " + list.peekLast());
		
		
	}
}
