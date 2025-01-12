// importing the Scanner class for read user input 
import java.util.Scanner;

//Create class HandShakesMethod for calculation of number of handshakes 

public class HandShakesMethod {
	
	//Function for calculating the Number of handshakes
		public int handShakes(int number){
			return (number * ( number - 1)) / 2 ;
		}
	
		public static void main(String args[]){
			// Create a Scanner object to take user input
			Scanner input = new Scanner(System.in);

			// creating variable numberOfStudent for taking input from user
			System.out.println("Enter Number of Students: ");
			int numberOfStudent = input.nextInt();
		
			//Initiating Obj of Class HandShakesMethod 
			HandShakesMethod obj = new HandShakesMethod();
		
			//Using obj we call the function handShakes
		
			int	numberOfHandshakes = obj.handShakes(numberOfStudent);
		
			// Print the results
			System.out.println("Total Number of Hand Shakes in " + numberOfStudent + " number of students is " + numberOfHandshakes);
		}
}