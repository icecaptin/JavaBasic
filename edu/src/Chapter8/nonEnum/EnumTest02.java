package Chapter8.nonEnum;

enum Mandarin {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;

	Mandarin(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class EnumTest02 {
	public static void main(String[] args) {
		
		Mandarin man = Mandarin.한라봉;
		if(man == Mandarin.한라봉)
			System.out.println("man은 한라봉 입니다.");
		System.out.println(man + "가격: " + man.getPrice());
		
		Mandarin list[] = Mandarin.values();
		System.out.println("-귤의 종류-");
		for (Mandarin m : list) {
			System.out.println(m + ":" + m.getPrice());
		}
		Mandarin has = Mandarin.한라봉;
		System.out.println(has.hashCode());
		System.out.println(has.toString());
	}
}

//enum Mandarin{ 금귤, 한라봉, 레드향, 천혜향, 황금향 ;}
//public class EnumTest02 {
//	public static void main(String[] args) {
//		Mandarin man = Mandarin.한라봉;
//		
//		System.out.println("이름: " + man.name());
//		System.out.println("위치: " + man.ordinal());
//		System.out.println("황금향과의 상대 위치: " + man.compareTo(Mandarin.황금향));
//		
//		Mandarin man2 = Mandarin.valueOf("레드향");
//		System.out.println(man2);
//		
//		Mandarin list[] = Mandarin.values();
//		System.out.println("-귤의 종류-");
//		for(Mandarin m : list)
//			System.out.println(m);
//	}
//}
