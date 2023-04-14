package Chapter8.innerClass;



public class 객체배열외부클래스 {
	class Student {
		int sid;
		String name;

		Student(int sid, String name) {
			this.sid = sid;
			this.name = name;
		}
		
		public String toString() {
			return "학번 = " + sid + " 이름 = " + name;
		}

		public void show() {
			System.out.println(this.toString());
//			System.out.println("학번 = " + sid + " 이름 = " + name);

		}
	}
	public static void main(String[] args) {
		int []data = new int[10];
		Student []studata = new Student[10];
		data[0] = 10;
		객체배열외부클래스 myInnerclass = new 객체배열외부클래스();
		studata[0] = myInnerclass.new Student(2023, "양성부");
		studata[1] = myInnerclass.new Student(2022, "양소윤");
		studata[2] = myInnerclass.new Student(2021, "강주희");
		studata[3] = myInnerclass.new Student(2020, "이예진");
		studata[4] = myInnerclass.new Student(2019, "정승길");
		
		for (int i = 0; i < 5; i++) {
			studata[i].show();
		}
		
	}
	
}
