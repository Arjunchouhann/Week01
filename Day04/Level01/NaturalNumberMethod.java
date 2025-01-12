import java.util.*;
//Creating class NaturalNumberMethod to calculate sum of natural numbers 
public class NaturalNumberMethod{
	//create method loopNumber to calculate sun of natural number
	public int loopNumber(int number , int sum){
		//using for loop 
		for (int i = 0 ; i<=number ; i++){
			sum+=i; 
		}
		return sum; //return sum of natural numbers
		}
	public static void main (String[]args){
		//create Scanner object
		Scanner sc = new Scanner (System.in);
		//creating variable number to take input from user
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		//creating sum variable and assign value 0
		int sum = 0;
		//creating object of class NaturalNumberMethod
		NaturalNumberMethod obj = new NaturalNumberMethod();
		//using obj to call method loopNumber
		int sumofNaturalNumber = obj.loopNumber(number,sum);
		//Print Sum of natural number 
		System.out.println(sumofNaturalNumber);
	}
}
			