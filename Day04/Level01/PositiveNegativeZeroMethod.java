import java.util.*;

//Creating Class PositiveNegativeZeroMethod for finding whether a number is positive, negative, or zero.
public class PositiveNegativeZeroMethod{
		
	//creating positiveNegativeZero method to number is what
	public int positiveNegativeZero(int number){
	//using if else to find number Status
		if(number>0){
			return 1;
		} 
		else if (number<0){
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static void main (String[]args){
		//create Scanner object
		Scanner sc=new Scanner(System.in);
		
		//creating variable number to take input from user
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		//initializing object of class PositiveNegativeZeroMethod 
		PositiveNegativeZeroMethod obj = new PositiveNegativeZeroMethod();
		
		//using object we call positiveNegativeZero method Print number status
		int ans = obj.positiveNegativeZero(number);
	
		System.out.println(ans);
	}	
}