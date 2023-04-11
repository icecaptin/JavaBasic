package Chapter7;

public class Professor extends Person {
	public String subject;
	
	public Professor() {
		System.out.println("Professor 생성자 호출");
	}
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor 생성자 실행");
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Professor [name = " + getName() + ", age = " + getAge() + ", subject = " + getSubject() + "]";
	}
	
}
