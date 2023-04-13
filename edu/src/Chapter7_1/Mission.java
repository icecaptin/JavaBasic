package Chapter7_1;

public class Mission {
	public static void main(String[] args) {
		int price = 254454;
		int fiftythousands = 50000;
		int tenthousands = 10000;
		int fivethousands = 5000;
		int thousands = 1000;
		
		
		
		int result1 = (price / fiftythousands);
		int result1_1 = (price - (result1 *50000)); 
		System.out.println(result1_1);
		int result2 = (result1_1 / tenthousands);
		int result2_1 = (result1_1 - (result2 * 10000));
		System.out.println(result2_1 - (result2 * 10000));
	
	}
}
