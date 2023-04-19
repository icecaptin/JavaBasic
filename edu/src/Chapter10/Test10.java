package Chapter10;

import java.util.*;

public class Test10 {

	public static void main(String[] args) {

		lotto_generator(10);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<Integer> lotto = null;
		for (int i = 1; i <= n; i++) {

			lotto = new HashSet<Integer>();

			for (int j = 0; lotto.size() <= 6; j++) {
				lotto.add(number.nextInt(1 ,46));
			}

			List<Integer> L = new ArrayList<Integer>(lotto);
			Collections.sort(L);
			System.out.println(L);
		}
	}
}