import java.util.Scanner;
//Create AreaOfTriangle Class for Calculating Area of Triangle
public class AreaOfTriangle{
	public static void main(String[]args){
		//Create Scanner Object to take user input from Standard Input
		Scanner sc = new Scanner (System.in);
		//Create Variable base to take input from user
		System.out.print("Enter Base Value");
		double base = sc.nextDouble();
		//Create Variable height to take input from user
		System.out.print("Enter Height Value");
		double height = sc.nextDouble();
		//Create Variable areaOfTriangle to calculate Area of triangle
		double areaOfTriangle = (double)0.5*base*height;
		//Print Area Of Traingle
		System.out.println("The Area of Triangle is " + areaOfTriangle + " of base " + base +" and height "+ height);
	}
}
