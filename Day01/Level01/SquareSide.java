import java.util.Scanner;
//Create SquareSide Class to find the side of the square
public class SquareSide {
	public static void main (String [] args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc = new Scanner (System.in) ;
		//Create variable perimeter to take input from user
		System.out.println("Enter Perimeter of Square");
		double perimeter = sc.nextDouble();
		//Create variable side to calculate side of square
		double side = perimeter/4 ;
		//Print perimeter and side of Square 
		System.out.println("The length of the side is "+ side + " The length of the side is " + perimeter);
	}
}	