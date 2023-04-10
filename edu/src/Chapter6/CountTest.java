package Chapter6;

class Count {
	public static int totalCount;
	int num;

	public void setNum(int n) {
		num = n;
	}

	public int getNum() {
		return num;
	}
}

public class CountTest {
	public static void main(String[] args) {
		int num = 0;
		Count.totalCount = 10;
		Count.num = 20;
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.setNum(num);
		Count.totalCount++;
		System.out.println("num = " + c1.getNum());
		c2.set
	}
}