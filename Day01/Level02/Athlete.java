import java.util.*;
	public class Athlete{
		public static void main(String[]args){
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter side 1 ");
		double side1 = input.nextDouble();
		System.out.println("Enter side 2 ");
		double side2 = input.nextDouble();
		System.out.println("Enter side 3 ");
		double side3 = input.nextDouble();
	   
		//first calculate the perimeter of triangular park
	   
		double perimeterOfGround = side1 + side2 + side3;
	   
		// conversion of 5 km to meters
		double distanceMeter = 5000;
	   
		int round = (int)(distanceMeter / perimeterOfGround);
	   
		//check if remaining reminder then add another round 
		if(distanceMeter % perimeterOfGround != 0){
			round += 1;
	    }
		 
		System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km");
	}
}