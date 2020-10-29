import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args)
	{
		// Declare 2 double variables for the user to decide the values
		double num1;
		double num2;
		
		// Define a new variable that holds the character that represents the operator
		char operator;
		
		double answer = 0.0;
		
		// Declare a new Scanner object called eval and set it to take in to the console input
		Scanner eval = new Scanner(System.in);
		
		// Prompt the user for the 1st number
		System.out.println("Enter the 1st number: ");
		// Set num1 to the next double value the user enters
		num1 = eval.nextDouble();
		
		// Prompt the user for the operator
		System.out.println("Enter the operator: ");
		// Set operator to the character the user wants
		operator = eval.next().charAt(0);
				
		// Prompt the user for the 2nd number
		System.out.println("Enter the 2nd number: ");
		// Set num2 to the next double value the user enters
		num2 = eval.nextDouble();
		
				
		// Close the eval to prevent memory leakage
		eval.close();
		
		// Take different actions depending on the operator passed to the function
		switch(operator)
		{
			// If the operator is a +
			case '+':
				answer = num1 + num2;
				break;
			
			// If the operator is a -
			case '-':
				answer = num1 - num2;
				break;
				
			// If the operator is a *
			case '*':
				answer = num1 * num2;
				break;
				
			// If the operator is a /
			case '/':
				answer = num1 / num2;
				break;
				
				
			default:
				break;
		}
		
		// Output the 2 values, the operator and result to the user
		System.out.println("Answer: " + num1 + " " + operator + " " + num2 + " = " + answer);
	}
}
