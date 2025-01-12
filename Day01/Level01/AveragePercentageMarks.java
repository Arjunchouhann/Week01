import java.util.Scanner;
//Create AveragePercentageMark Class to compute the Average percentage mark of sam
public class AveragePercentageMarks{
	public static void main(String[] args){
		//Create a variable mathMarks to indicate the sam's math mark
		int mathMarks = 94;
		//Create a variable physicsMarks to indicate the sam's physics mark
		int physicsMarks = 95;
		//Create a variable chemistryMarks to indicate the sam's chemistry mark
		int chemistryMarks = 96;
		//Create a variable averageMarkPercentage to indicate the sam's average percentage mark
		int averageMarkPercentage = (mathMarks + physicsMarks + chemistryMarks) / 3;
		//Print Sam's percentage
		System.out.print("Sam's average percentage mark in PCM is " + averageMarkPercentage);
		
	}
}