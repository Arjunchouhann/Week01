import java.util.Scanner;
//Create HandShakes Class to find the maximum number of handshakes among N number of students
public class HandShakes{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variable numberOfStudents to take input from user
		System.out.print("Enter Number Of Students = ");
		int numberOfStudents = sc.nextInt();
		//Create maxHandshakes variable to calculate maximum number of handshakes
		Double maxHandshakes = (((double)numberOfStudents)*((double)numberOfStudents-1))/2 ;
		//Print Maximum Number of handshakes
		System.out.println("The Total Maximum number of handshakes is "+ maxHandshakes);
	}
}