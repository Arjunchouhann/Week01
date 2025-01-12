import java.util.Scanner;
//Create Class Multiply to calculate multiplication table 
public class Multiply{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable number take input
	System.out.println("Enter number");
	int number =sc.nextInt();
	//By loop printing according to question from 6 to 9
	for(int i=6;i<=9;i++){
		System.out.println(number+" * "+ i +" = "+ (number * i));
	}
	}
}