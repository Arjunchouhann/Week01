import java.util.Scanner;
//Create HeightConvertor Class to convert  height in centimeters into feet and inches
public class HeightConvertor{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input
		Scanner sc = new Scanner(System.in);
		//Create variable heightInCm to take input height in centimeters
		double heightInCm = sc.nextDouble();
		//Create variable heightInInch to convert height in inches
		double heightInInch = (double)2.54 * heightInCm;
		//Create variable heightInFoot to convert height in foot
		double heightInFoot = 12 * heightInInch;
		//Print all Converted details of height
		System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFoot + " and inches is " + heightInInch);
	}
}	