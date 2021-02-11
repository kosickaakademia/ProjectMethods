package sk.itsovy.dolinsky.functionalinterface;

/**
 * @author Martin Dolinsky
 */
public class Cat {

	public void printSound(String sound) {
		System.out.println(sound);
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		MyInterface reference = cat::printSound;
		reference.printSound("Meow!");
	}
}
