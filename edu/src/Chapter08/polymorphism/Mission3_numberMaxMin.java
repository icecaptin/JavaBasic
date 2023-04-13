package Chapter08.polymorphism;
import java.util.Scanner;

public class Mission3_numberMaxMin {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("입력: ");
		int maxnum = sc.nextInt();
		System.out.println("입력: ");
		int minnum = sc.nextInt();
		
		int gcd = getGCD(maxnum, minnum);
        int lcm = maxnum * minnum / gcd;
        
        System.out.print("최대공약수: " + gcd);
        System.out.print("최소공배수: " + lcm);
        }
	
	public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
