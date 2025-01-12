import java.util.Scanner;
//Create Class PositiveNegativeZero to find number is positive, negative, or zero
public class PositiveNegativeZero{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable number to take input
	System.out.println("Enter number");
	int number =sc.nextInt();
	//check whether a number is positive, negative, or zero
	if(number>0){
		System.out.println("Positive");
	}
	else if(number<0){
		System.out.println("Negative");
	}
	else{
		System.out.println("Zero");
	}
	}
}