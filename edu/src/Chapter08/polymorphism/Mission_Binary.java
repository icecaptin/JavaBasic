package Chapter08.polymorphism;

import java.util.*;


public class Mission_Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 입력하세요:");
		int before_num = sc.nextInt();
		
		String after_num = "";
		int temp = 0;
		
		while (before_num >= 1)	{
			temp = before_num / 2;
			after_num = after_num + Integer.toString(before_num % 2);
			before_num = temp;
			
			if (before_num == 1)	{
				after_num = after_num + "1";
				break;
			}

		}
		StringBuffer sbr = new StringBuffer(after_num);
		String result = sbr.reverse().toString();
		
		System.out.println(result);
		
	}

}
//public class Mission_Binary {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력 :");
//		int num = sc.nextInt();
//
//		String binary = Integer.toBinaryString(num);
//		String hexaDecimal = Integer.toHexString(num);
//		System.out.println(binary);
//		System.out.println(hexaDecimal); // 16진수
//	}
//
//}
