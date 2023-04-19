package Chapter9;

public class Test01 {
	class MyObject{
		public String toString() {
			return "MyObject";
		}
	}
	public static void main(String[] args) {
		Test01 t = new Test01();
		MyObject mo = t.new MyObject();
		mo.equals(mo);
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		Class c = obj1.getClass();
		
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(c.getName());
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj1.equals(obj3));
	}
}
