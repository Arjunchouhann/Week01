import java.util.Scanner;
//create Class ArmstrongNumber to find whether no. is armstrong number or not
public class ArmstrongNumber{
	public static void main (String[]args){
		//creating Scanner object
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt(); //creating number variable for user input
		int sum = 0; //Creating variable sum and assign value 0
		int originalNumber = number ; 
		while(originalNumber!=0){
			int remainder = originalNumber%10; // last digit calculation
			int remainderCube = remainder*remainder*remainder; // cube of last digit
			sum += remainderCube; // adding in sum
			originalNumber = originalNumber/10;
		}
		if(number==sum){
			System.out.println( number +" is Armstrong Number");
		}
		else {
			System.out.println( number +" is not Armstrong Number");
		}
	}
}