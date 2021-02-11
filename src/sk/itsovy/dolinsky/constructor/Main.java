package sk.itsovy.dolinsky.constructor;

/**
 * @author Martin Dolinsky
 */
public class Main {
	public static void main(String[] args) {
		MyInterface reference = Cat::new;
		reference.printName("Fufi");
		reference.printName("Barbie");
	}
}
