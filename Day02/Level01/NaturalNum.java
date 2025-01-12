import java.util.Scanner;
//Create Class NaturalNum to find number is natural and also sum of natural number 
public class NaturalNum{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable number to take input
	System.out.println("Enter Number");
	int number =sc.nextInt();
	//check if the number is natural or not
	if(number>=0){
		int sum = number*(number+1)/2;
		System.out.println("The sum of "+number+" natural numbers is "+sum);
	}
	else{
		System.out.println("The number "+number+" is not a natural number");
	}
	}
}