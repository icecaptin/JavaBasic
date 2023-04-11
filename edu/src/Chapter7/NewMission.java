package Chapter7;

public class NewMission {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;
		int sum2 = 0;
		
		for (i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum + sum2);
	}

}
