package Chapter5;

public class Mission {

	public static void main(String[] args) {
		int count = 40;

		for (int year = 2023; year < 2200; year++) {
			if (count == 0) {
				break;
			}
			if ((year % 4) == 0 && (year % 100) != 0 || year % 400 == 0) {
				count--;
				System.out.println(year);
				System.out.println(count);
			}

		}
	}
}

// && OR
// || AND

