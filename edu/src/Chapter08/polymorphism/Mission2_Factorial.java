package Chapter08.polymorphism;

import java.util.Scanner;

public class Mission2_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 :");
		int num = sc.nextInt();

		int pactorial = 1;
		System.out.print(num+ "!= " );
		for (int i = num; i >= 1; i--) {
			pactorial *= i;
			System.out.print(i);
			if (i != 1) {
				System.out.print(" * ");
			}
		}
		System.out.print(" = " + pactorial);
	}
}
