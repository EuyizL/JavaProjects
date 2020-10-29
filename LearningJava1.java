import java.awt.Point;
import java.util.Date;

public class LearningJava1 {
	
	public static void main(String[] args) {
		// Public method so it is accessible elsewhere in this program
		// Main method should always be Static
		// Return type is Void so it is not going to return a value
		// codes inside () are parameters for this function
		// can use psvm as shortcut, not in eclipse
		// args means arguments
		// Static can means that it is a global variable
		System.out.println("Hello World");
		byte age = 30;
		System.out.println(age);
		age += 5;
		System.out.println(age);
		float num = 123_456.90F;
		/* Java sees decimal number by default as Double so need to use F as a suffix to make it float
		Java can spilt large numbers using _
		Byte, Short, Int, Long, Float, Double, Char, Boolean (Primitive types - For storing simple data)
		Referencing - For storing complex data */
		System.out.println(num);
		long count = 3_123_456_789L;
		// Use L to indicate Long as a suffix
		char letter = 'A';
		// Single characters with '', multiple characters with ""
		boolean isEligible = false;
		Date now = new Date();
		// new operator is for allocating memory for the variable - Differences between Referencing and Primitive types	
		System.out.println(now);
		// out is a field
		// can use sout as shortcut, not in eclipse
		Point point1 = new Point(1, 1);
		final Point point2 = point1;
		// is for single line comment, /* and ends with */ is for multi-line comments
		// Final is to prevent others from changing the variable making it unchangeable
		/* Widening Casting (automatically) - converting a smaller type to a larger type size
		Narrowing Casting (manually) - converting a larger type to a smaller size type */
		// Java Logical Operators - && , ll , !
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		// toUpperCase() , toLowerCase(), indexof(), concat(), use \ for special characters into Strings
		// switch , break, default
		
		
		
		
	}

	
}