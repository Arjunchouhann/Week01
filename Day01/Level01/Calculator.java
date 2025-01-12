import java.util.Scanner;
//Create Calculator Class to Perform arithmatic operation on two numbers
public class Calculator {
	public static void main (String [] args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc = new Scanner (System.in) ;
		//Create variable number1 to take input from user  
		double number1 = sc.nextDouble();
		//Create variable number2 to take input from user  
		double number2 = sc.nextDouble();
		//Create variable addition to perform addition arithmatic operation
		double addition = number1 + number2 ;
		//Create subtraction addition to perform subtraction arithmatic operation
		double subtraction = number1 - number2 ;
		//Create variable multiplication to perform multiplication arithmatic operation
		double multiplication = number1 * number2 ;
		//Create variable division to perform division arithmatic operation
		double division = number1 / number2 ;
		//Print all Arithematic operations performed on two numbers
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition +" , " + subtraction  + " , " + multiplication + " and " + division);
	}
}	