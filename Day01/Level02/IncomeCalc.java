import java.util.Scanner;
//Create IncomeCalc class to find the total income of a person 
public class IncomeCalc{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variable salary and bonus to take user input 
		System.out.println("Enter both salary and bonus of a person");
		int salary = sc.nextInt();
		int bonus = sc.nextInt();
		//Create Variable income for calculate income of person
		int income = salary+bonus;
		//Print income
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
		
	}
}