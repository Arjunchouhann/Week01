import java.util.Scanner;
//create Class HarshadNum to the number is harshad number or not
public class HarshadNum{
	public static void main (String[]args){
		//creating Scanner object
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt(); //creating number variable for user input
		int n=number;
		int sum = 0; //Creating variable sum and assign value 0
		while(n!=0){
			int rem = n%10;
			sum+=rem;
			n=n/10;
		}
		if(number%sum==0){
			System.out.println(number + " is a Harshad Number");
		}
		else{
			System.out.println(number + " is not a Harshad Number");
			}
			
	}
}