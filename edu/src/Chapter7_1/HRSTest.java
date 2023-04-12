package Chapter7_1;

abstract class Employee {
	String name;
	int salary = 8720;
//	int saled = 3000;
//	int consulting = 2000;
//	int teamsalary = 5000;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("세일즈맨 급여 = 기본급 + 판매수당 = ");
	}

	public void calcBonus() {
		System.out.println("세일즈맨 보너스 = 기본급 * 12 * 4 = ");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("컨설턴트 급여 = 기본급 + 컨설팅 수당 = ");
	}

	public void calcBonus() {
		System.out.println("컨설턴트 보너스 = 기본급 * 12 * 2 = ");
	}
}
class Manager extends Employee {
	public void calcSalary() {
		System.out.println("매니저 = 기본급 + 팀 성과 수당 = ");
	}

	public void calcBonus() {
		System.out.println("매니저 보너스 = 기본급 * 12 * 6");
	}
}


class/*abstract*/ Director extends Manager {
	public void calcSalary() {
		System.out.println("디렉터 = 기본급 + 컨설팅 수당");
	}
	public void calcBonus() {
		System.out.println("디렉터 보너스 = 기본급 * 12 * 6");
	}
}
public class HRSTest {
	public static void main(String[] args) {
		Salesman sm = new Salesman();
		Consultant cst = new Consultant();
		Director dir = new Director();
		Manager mg = new Manager();
		
		sm.calcBonus();
		cst.calcBonus();
		dir.calcBonus();
		mg.calcBonus();
	}
}
