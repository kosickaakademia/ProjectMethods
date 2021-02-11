package sk.itsovy.dolinsky.functionalinterface;

/**
 * @author Martin Dolinsky
 */
public class Cat {

	public void printSound(String sound) {
		System.out.println(sound);
	}

	public static void main(String[] args) {
		Cat cats = new Cat();
		//comment
		MyInterface reference = cats::printSound;
		reference.printSound("Meow!");
	}
}
