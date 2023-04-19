package Chapter10;

class Employee {
	String name;
	int age;
	int height;
	int weight;
	char bloodType;
	String email;
	public Employee (String name, int age, int height, int weight, char bloodType, String email) {
		this.name = name; this.age = age; this.height = height; this.weight = weight; this.bloodType = bloodType; this.email = email;
	}
	public String toString() {
		return name + " , " + age + " , " + height + " , " +  weight + " , " + bloodType + " , " + email;
	}
}

public class Test01 {
	public static void main(String[] args) {
		int [] a = new int[10];
		Employee [] eset = new Employee[10];
		eset[0] = new Employee("yang_sb", 26, 178,  95, 'A', "tjdqn0228@naver.com");
		eset[1] = new Employee("lee_sh", 26, 178, 95, 'A', "tjdqn0228@naver.com");
		eset[2] = new Employee("kim_yj", 26, 178, 95, 'A', "tjdqn0228@naver.com");
		eset[3] = new Employee("park_yw", 26, 178, 95, 'A', "tjdqn0228@naver.com");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(eset[i].toString());
		}
	}
}
