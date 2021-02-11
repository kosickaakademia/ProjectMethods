package sk.itsovy.dolinsky.staticmethod;

import java.time.LocalDate;
import java.util.function.BiFunction;

/**
 * @author Martin Dolinsky
 */

public class Cat {
	private String name;
	private int annualFoodConsumption;

	public Cat(String name, int annualFoodConsumption) {
		this.name = name;
		this.annualFoodConsumption = annualFoodConsumption;
	}

	public static void main(String[] args) {
		LocalDate lastYear = LocalDate.parse("2020-12-31");
		int daysInYear = lastYear.lengthOfYear();
		BiFunction<Integer, Integer, Integer> conversion = Conversion::convertKilogramsToGrams;
		Cat cat = new Cat("Fufi",54750);

		System.out.println("Cat's name: " + cat.name + "\nAnnual food consumption: "
				+ conversion.apply(cat.annualFoodConsumption, 1000) + " kg\n" + "Days in year: " + daysInYear
				+ "\nDaily food consumption: " + cat.annualFoodConsumption / daysInYear + " g/day");
	}
}
