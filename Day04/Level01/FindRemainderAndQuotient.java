import java.util.Scanner;
//Creating class FindRemainderAndQuotient to find the number's quotient and reminder
public class FindRemainderAndQuotient{
	//create method findRemainderAndQuotient to calculate quotient and reminder
	public static int[] findRemainderAndQuotient(int number, int divisor){
		// for printing quotient
		int quotient = number / divisor;
		
		// for printing reminder
		int reminder = number % divisor;
		
		//return int[] 
		return new int[]{quotient, reminder};
	
	}
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input = new Scanner(System.in);
        //Creating variable number and divisor for input user
		System.out.print("Enter number: ");
        int number = input.nextInt(); 
		System.out.print("Enter divisor ");
        int divisor = input.nextInt(); 
		
		// method call 
		int[] result = findRemainderAndQuotient(number, divisor);
		// display the quotient and reminder
		System.out.println("The quotient is: " + result[0]);
        System.out.println("The reminder is: " + result[1]);
	}
	
}