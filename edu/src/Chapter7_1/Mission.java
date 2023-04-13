package Chapter7_1;

public class Mission {
	public static void main(String[] args) {
		int price = 327540;
		int fiftythousands = price % 50000;
		int tenthousands = price % 10000;
		int fivethousands = price % 5000;
		int thousands = price % 1000;
		
		System.out.println("5만원권 갯수 : " + (price /50000));
		System.out.println("1만원권 갯수 : " + (fiftythousands /10000));
		System.out.println("5천원권 갯수 : " + (tenthousands /5000));
		System.out.println("1천원권 갯수 : " + (fivethousands /1000));
		
	
	}
}
