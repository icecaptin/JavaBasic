package Chapter6;

class Student_Mission2 {
	static int countStudents; // 생성된 객체의 수
	int sid; // 학번
	String name; // 학생 이름
	String city; // 주소 도시

	public String toString() {
		return "Student sid=" + this.sid + " / " + this.name + " / " + this.city;
	}

	// 인스턴스 메소드: 학생 정보 출력
	void showStudent() {
		System.out.println(this.toString());
	}

	static void showNumberObjects() { // 생성된 객체 수 출력
		System.out.println("생성된 학생 객체의 수: " + countStudents);
	}

	public Student_Mission2(int sid) {
		this(sid, "", "");
	}

	// 학번과 이름을 인수로 받는 생성자
	public Student_Mission2(int sid, String name) {
		this(sid, name, "");
	}

	// 학번, 이름, 도시를 인수로 받는 생성자
	public Student_Mission2(int sid, String name, String city) {
		this.sid = sid;
		this.name = name;
		this.city = city;
		countStudents++;
	}

	public Student_Mission2() {
		this(202300);
	}
}

public class StudentMission2 {
	public static void main(String[] args) {
		int[] a = new int[5];
		Student_Mission2[] arry = new Student_Mission2[5];
		Student_Mission2.showNumberObjects();
		arry[0] = new Student_Mission2();
		arry[1] = new Student_Mission2(202301);
		arry[2] = new Student_Mission2(202302, "Hong");
		arry[3] = new Student_Mission2(202303, "Lee", "Busan");
		arry[4] = new Student_Mission2(202304, "Na", "jeju");
		Student_Mission2.showNumberObjects();
		for (int i = 0; i < arry.length; i++) {
			arry[i].showStudent();// 생성된 객체 모두를 출력한다.
		}
	}

}
