import java.util.*;

//Creating Class AthleteMethod for finding how many rounds Athelete have to run
public class AthleteMethod{
		
	//creating numberOfRounds method to count number of round
	public double numberOfRounds(double p){
		return (5000/(p)) ;
	}
	
	public static void main (String[]args){
		//create Scanner object
		Scanner sc=new Scanner(System.in);
		
		//creating variable firstSide, secondSide, thirdSide to take input from user
		System.out.println("Enter First side of triangle");
		double firstSide=sc.nextDouble();
		
		System.out.println("Enter Second side of triangle");
		double secondSide=sc.nextDouble();
		
		System.out.println("Enter third side of triangle");
		double thirdSide=sc.nextDouble();
		
		//creating perimeter variable to calculate perimeter
		double perimeter = firstSide + secondSide + thirdSide ;
		
		//initializing object of class AthleteMethod 
		AthleteMethod obj = new AthleteMethod();
		
		//using object we call numberOfRounds method
		double totalRounds = obj.numberOfRounds(perimeter);
		 
		//Print number of rounds
		System.out.println("Total rounds must the athlete complete is "+ totalRounds);
	}	
}