package Chapter7;

public class LMSTest {
	
	public static void main(String[] args) {
		Employee emp = new Employee("양성부", 26, "컴공");
		Professor pro = new Professor("강주희", 26, "자바");
		Student stu = new Student("이예진", 26, "어흥");
		
		System.out.println(emp.toString());
		System.out.println(pro.toString());
		System.out.println(stu); //.toString(); 안해도 무관
	}

}
//	public static void main(String[] args) {
//		Employee emp = new Employee();
//		Professor pro = new Professor();
//		Student stu = new Student();
//		
//		emp.setName("양성부");
//		emp.setAge(26);
//		emp.setDept("컴공");
//		
//		pro.setName("강주희");
//		pro.setAge(26);
//		pro.setSubject("자바");
//		
//		stu.setName("이예진");
//		stu.setAge(26);
//		stu.setMajor("어흥");
//		
//		System.out.println(emp.toString());
//		System.out.println(pro.toString());
//		System.out.println(stu.toString());
//	}
//
//}

