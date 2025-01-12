import java.util.Scanner;
//Create QuotientRemainder Class to find the quotient and reminder of two numbers
public class QuotientRemainder{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variables number1 and number2 to take input from user
		System.out.println("Enter Two Numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		//Create reminder and quotient variable to calculate reminder and quotient
		int reminder = number1%number2;
		int quotient = number1/number2;
		//Print quotientand reminder of two numbers
		System.out.println("The Quotient is "+quotient+" and Reminder is " +reminder+" of two number "+number1+" and "+number2);
	}
}