// Java program to take an integer
// as input and print it
import java.util.Scanner;

// Driver Class
class GFG {
	// main function
	public static void main(String[] args)
	{
		// Declare the variables
		int num;

		// Input the integer
		System.out.println("Enter the current hours: ");

		// Create Scanner object
		Scanner s = new Scanner(System.in);

		// Read the next integer from the screen
		num = s.nextInt();
		
		if(num<12) {
			System.out.println("Hello, Good Morning ");
		} else if(num<12 && num>17) {
			System.out.println("Hello, Good Afternoon ");
		} else {
			System.out.println("Hello, Good Evening ");
		}
		
		
		
	}
}
