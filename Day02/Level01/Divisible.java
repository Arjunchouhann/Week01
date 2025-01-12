import java.util.Scanner;
//Create Divisible Class for check numbers is divisible by 5 
public class Divisible {
	public static void main (String[]args){
		//Create Scanner object 
		Scanner sc= new Scanner (System.in);
		//Create variable number
		System.out.println("Enter number");
		int number =sc.nextInt();
		//Checking if numberis divisible by 5 and Print output either yes / No
		if(number%5==0){
			System.out.println("Is the number "+ number + " divisble by 5? Yes");
		}
		else{ 
			System.out.println("Is the number "+ number + " divisble by 5? No");
		}
	}
}