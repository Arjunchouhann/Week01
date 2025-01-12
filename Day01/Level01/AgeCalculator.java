import java.util.Scanner;
//Creating a class of name AgeCalculator for calculating age.
public class AgeCalculator{
	public static void main (String[]args) {
		//Create a variable birthYear to indicate the harry's birth year
		int birthYear = 2000;
		//Create a variable cuurentYear to indicate the current year
		int currentYear = 2024;
		//Create a variable age to indicate the harry's age
		int age = currentYear-birthYear;
		//Print the age of harry
		System.out.print("Harry's age in " + currentYear + " is " + age );
		
	}
}