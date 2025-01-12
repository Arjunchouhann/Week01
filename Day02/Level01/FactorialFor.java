import java.util.Scanner;
//Create Class FactorialFor to find number is natural and also sum of natural number  
public class FactorialFor{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable number to take input
	System.out.println("Enter Number");
	int number =sc.nextInt();
	int factorial = 1; //Creating variable factorial and assign 1
	//check if the number is natural or not and compare it
	
	if(number>0){
		for (int i=number;i>0;i--){
			factorial=factorial*i;
			}
			System.out.println("Factorial = "+ factorial);
	}
	else{
		System.out.println("The number "+number+" is not positive number");
	}
	}
}