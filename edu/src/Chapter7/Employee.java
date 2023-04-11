package Chapter7;
//클래스만들때 superclass 설정해서 만들어도됨!
public class Employee extends Person {
	public String dept;
	
	public Employee() {
		System.out.println("Employee 생성자호출");
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
		System.out.println("Employee 생성자 실행");
	}
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name = " + getName() + ", age = " + getAge() +  ", dept = " + getDept() + "]";
	}

}
