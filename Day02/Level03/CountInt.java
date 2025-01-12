import java.util.Scanner;
//create Class CountInt to count the digits in integer
public class CountInt{
	public static void main (String[]args){
		//creating Scanner object
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt(); //creating number variable for user input
		int count = 0; //Creating variable count and assign value 0
		while(number!=0){
			number = number/10;
			count++;
		}
		System.out.println("Number of digits is "+count);
		
	}
}