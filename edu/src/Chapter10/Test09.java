package Chapter10;
import java.util.*;

public class Test09 {
	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<String, String>();

		users.put("20080319", "최혜린");
		users.put("20070620", "팔칠삼");
		users.put("20050817", "양성부");
		users.put("20120728", "김잘구");
		users.put("20120924", "미라클");

		System.out.println(users);

		Map.Entry<String, String> entry = null;

		entry = users.firstEntry();
		print("입사일자가 가장 빠른 사람 ", entry);

		entry = users.lastEntry();
		print("입사일자가 가장 늦은 사람", entry);

		entry = users.lowerEntry("20121231");
		print("2012년도에 가장 늦게 입사한사람", entry);

		entry = users.higherEntry("20120101");
		print("2012년도에 가장 빠르게 입사한 사람", entry);

		while (!users.isEmpty()) {
			entry = users.pollFirstEntry();
			print("퇴직한 사람", entry);
			System.out.println("남아잇는 직원 수 : " + users.size());
		}
	}

	public static void print(String s, Map.Entry<String, String> entry) {
		System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
	}
}
