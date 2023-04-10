package Chapter6;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
 * 생성자 함수 구현 - this(); 호출 사용
 * static 데이터 멤버 사용
 * static 멤버 함수 구현
 * toString() 함수 구현과 사용
 * 객체 배열 사용
 */
public class Student_Mission {
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

	public Student_Mission(int sid) {
		this(sid, "", "");
	}

	// 학번과 이름을 인수로 받는 생성자
	public Student_Mission(int sid, String name) {
		this(sid, name, "");
	}

	// 학번, 이름, 도시를 인수로 받는 생성자
	public Student_Mission(int sid, String sname, String city) {
		this.sid = sid;
		this.name = sname;
		this.city = city;
		countStudents++;
	}

	public Student_Mission() {
		this(202300);
	}

	// 생성자 구현한다.
	public static void main(String[] args) {

		int[] a = new int[5];
		Student_Mission arry[] = new Student_Mission[5];
		showNumberObjects();
		arry[0] = new Student_Mission();
		arry[1] = new Student_Mission(202301);
		arry[2] = new Student_Mission(202302, "Hong");
		arry[3] = new Student_Mission(202303, "Lee", "Busan");
		arry[4] = new Student_Mission(202304, "Na", "jeju");
		showNumberObjects();
		for (int i = 0; i < arry.length; i++) {
			arry[i].showStudent();// 생성된 객체 모두를 출력한다.
		}

	}
}
