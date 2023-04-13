package Chapter08.polymorphism;

import java.util.*;

public class Mission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 :");
		int num = sc.nextInt();

		String binary = Integer.toBinaryString(num);
		String hexaDecimal = Integer.toHexString(num);
		System.out.println(binary);
		System.out.println(hexaDecimal); // 16진수
	}

}
