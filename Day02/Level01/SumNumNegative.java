import java.util.Scanner;
//Create Class SumNumNegative to calculate Sum of numbers 
public class SumNumNegative{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable total and assign value 0.0
	double total = 0.0;
	System.out.println("Enter the Number (enter 0 or negative value to stop )");
	double number = sc.nextDouble(); // Creating variable number
	//Run While until pressing 0
	while(number>0){ 
		number=sc.nextDouble();
		total+=number;
		}
	System.out.println(total);
	}
}