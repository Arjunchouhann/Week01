import java.util.Scanner;
//Create SwapNum Class to Swap two Numbers
public class SwapNum {
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variables number1 and number2 for taking input from user  
		System.out.println("Enter two Numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		//Create variable temp assign with 0
		int temp = 0;
		//Swapping process
		temp = number1;
		number1=number2;
		number2=temp;
		//Print Swapped Numbers
		System.out.println("The swapped numbers are "+ number1 +" and "+number2);
		
	}
}