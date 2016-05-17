package corejava.collections;

import java.util.*;
import corejava.collections.shapes.*;

/**
 * Collection type: List
 * Make a List of Circle objects. Use a random radius. Keep adding circles
 * to the list until Math.random() returns < 0.01. Then, loop down the
 * list and print out each area.
 * @author m
 */

public class CircleListTest {

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
			System.out.println("circle #" + count + " area: " + c.getArea());
		}
	}
}
