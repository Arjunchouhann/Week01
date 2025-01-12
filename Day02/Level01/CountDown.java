import java.util.Scanner;
//Create Class CountDown to countdown for a Rocket Launch
public class CountDown{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable Counter for the user input
	System.out.println("Enter Number");
	int counter = sc.nextInt();	
	//Run While loop to print every counter number
	while(counter!=0){
		System.out.println(counter);
		counter--;
	}
	}
}