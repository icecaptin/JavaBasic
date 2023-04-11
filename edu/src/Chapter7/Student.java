package Chapter7;

public class Student extends Person {
	public String major;
	
	public Student() {
		System.out.println("Student 생성자 호출");
	}
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student 생성자 실행");
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name = " + getName() + ", age = " + getAge() + ", major = " + getMajor() + "]";
	}
	
}
