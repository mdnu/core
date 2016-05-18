package corejava.generics;

import java.util.*;
import corejava.collections.shapes.Circle;

/**
 * printf exercise.
 * Copy your circle-list code from previous, where you looped down a
 * List<Circle> object and printed out the areas. Modify the code so
 * that the areas are printed with decimal points and with exactly
 * three digits after the decimal point.
 * @author m
 */

public class CircleListTestTwo {

	public static void main(String[] args) {
		List<Circle> circles = new ArrayList<>();
		
		/**
		 * generates list of circles of random radius given the
		 * specified condition.
		 */
		while (Math.random() > 0.01) {
			circles.add(new Circle(10 * Math.random()));	// invokes Circle constructor inside argument.
		}
		
		/**
		 * Loops down the completed list, printing out each Circle area.
		 */
		int count = 0;
		for (Circle c : circles) {
			count++;
			//System.out.println("circle #" + count + " area: " + c.getArea());
			System.out.printf("circle %2d area: %,8.3f.%n", count, c.getArea());
		}
	}
}
