package Chapter7;

public class Person {
	public String name;
	int age;
	
	public Person() {
		System.out.println("person 생성자 호출");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 생성자 실행");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public static void main(String[] args) {
//		Person ps = new Person();
//		ps.setAge(26);
//		ps.setName("아대");
//		
//		System.out.println(ps);
//		}
	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
}
