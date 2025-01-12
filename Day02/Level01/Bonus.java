import java.util.Scanner;
//Create Class Bonus to find bonus Amount 
public class Bonus{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable salary and year to take input
	System.out.println("Enter Salary and Year");
	int salary =sc.nextInt();
	int year =sc.nextInt();
	int bonus; // creating bonus variable
	//check and print bonus amount whether employee has more than 5 year experience or nots
	if(year>5){
		bonus=salary*5/100;
		System.out.println(bonus);
		}
	else {
		System.out.println(salary);
	}
	}
}