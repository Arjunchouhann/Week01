import java.util.Scanner;
//Create Class CountDownFor to countdown for a Rocket Launch
public class CountDownFor{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable Counter for the user input
	System.out.println("Enter Number");
	int counter = sc.nextInt();	
	//Run While loop to print every counter number
	for(int i = counter; i>0 ; i--){
		System.out.println(i);
	}
	}
}