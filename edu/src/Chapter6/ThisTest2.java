package Chapter6;

public class ThisTest2 {
	private String name;
	
	public void setName(String name) {
		name = name;
//		this.name = name; 이게 정답
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		ThisTest2 exam = new ThisTest2();
		exam.setName("Amy");
		
		System.out.println(exam.getName());

	}

}
