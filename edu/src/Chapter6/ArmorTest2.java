package Chapter6;

import Chapter5.Armor;

public class ArmorTest2 {
	public static void main(String[] args) {
		Armor suit = new Armor();
		suit = null;
		suit.setName("Mark 6");
		suit.setHeight(180);
		System.out.println(suit.getName() + ":" + suit.getHeight());
	}
}
