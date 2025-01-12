import java.util.Scanner;
//create KilometersToMiles Class to convert kilometers into miles with user input
public class KilometersToMiles{
	public static void main (String[]args) {
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc = new Scanner(System.in);
		//Create a variable km to take input of kilometers
		System.out.println("Enter distance in kilometers");
		double km = sc.nextDouble();
		//Create a variable to calculate miles by kilometers
		double miles = km / 1.6 ;
		//Print total miles and kilometers
		System.out.println("The total miles is " + miles + " mile for the given " + km + "km");
	}
}	
		