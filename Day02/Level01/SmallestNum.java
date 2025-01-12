import java.util.Scanner;
//Create Class SmallestNum to find smallest number 
public class SmallestNum{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Three Numbers");
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
	//Checking for finding smallest number and print it using conditional operators
	if((number1 < number2)&&(number1 < number3)){
		System.out.println("Is the first number the smallest? Yes");
	}
	else if((number2 < number1)&&(number2 < number3)){
		System.out.println("Is the Second number the smallest? Yes");
		
	}
	else{
		System.out.println("Is the third number the smallest? Yes");
	}
	}
}
		