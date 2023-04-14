package Chapter8.innerClass;

class Student {
	int sid;
	String name;

	Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public void show() {
		System.out.println("학번 = " + sid + " 이름 = " + name);

	}
}

public class 객체배열 {
	public static void main(String[] args) {
		int []data = new int[10];
		Student []studata = new Student[10];
		data[0] = 10;
		studata[0] = new Student(2023, "양성부");
		studata[1] = new Student(2022, "양소윤");
		studata[2] = new Student(2021, "강주희");
		studata[3] = new Student(2020, "이예진");
		studata[4] = new Student(2019, "정승길");
		
		for (int i = 0; i < 5; i++) {
			studata[i].show();
		}
		
	}
}
