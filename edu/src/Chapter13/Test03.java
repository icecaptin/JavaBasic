package Chapter13;
class Solid{}
class Liquid{}
class Book extends Solid{}
class Pencil extends Solid{}
class Note extends Solid{}
class Water extends Liquid{}
class coffee extends Liquid{}
class Bag<T extends Solid> {
	T item;
	public Bag(T thing) {
		item = thing;
	}
}
public class Test03 {
	public static void main(String[] args) {
		Bag<Book> book = new Bag<>(new Book());
		Bag<Water> water = new Bag<>(new Water());
		
	}
}
