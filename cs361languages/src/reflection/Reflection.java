/**
 * 
 */
package reflection;
import java.lang.reflect.Method;

/**
 * @author ADD YOUR NAME 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

public class Reflection {
	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		System.out.print("Inheritance chain: ");
		Class<?> currentClass = o.getClass();
		
		while (currentClass != null) {
			System.out.print(currentClass.getName());
			currentClass = currentClass.getSuperclass();
			if (currentClass != null) {
				System.out.print(" inherits from ");
			}
		}
		System.out.println();
	}

	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		Method[] methods = o.getClass().getMethods();

		// List of methods
		System.out.println("\nMethods:");
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an object of type String
		// TODO To complete
		String str = "Hello, World!";
		System.out.println("Demonstrating reflection on String:");
		r.correspondingClass(str);
		r.inheritanceChain(str);
		r.listMethods(str);
		
		// Demonstration of the methods on an object of type ColoredCircle
		// TODO To complete
		ColoredCircle circle = new ColoredCircle();
		System.out.println("\nDemonstrating reflection on ColoredCircle:");
		r.correspondingClass(circle);
		r.inheritanceChain(circle);
		r.listMethods(circle);
	}
}

class ColoredCircle {
	private String color;
	private int radius;

	public ColoredCircle() {
		this.color = "Red";
		this.radius = 5;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
