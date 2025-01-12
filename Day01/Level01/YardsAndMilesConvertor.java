import java.util.Scanner;
public class YardsAndMilesConvertor{
	public static void main(String [] args){
		//Create Scanner Object to take user input from Standard Input
		Scanner sc= new Scanner (System.in) ;
		//Create Variable feets to take input from user
		System.out.println("Enter Feets = ");
		double feets = sc.nextDouble();
		//Create variable yards to converts feet into yards
		double yards = 3*feets;
		//Create variable miles to converts miles from yards
		double miles = 1760*yards;
		//Print the distance in feets ,yards and miles
		System.out.println("The Distance in feet is " + feets + " while in yards "+ yards + " and miles is " + miles);
	}
}	
	