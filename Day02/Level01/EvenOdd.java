import java.util.Scanner;
//Create Class EvenOdd to find number is even or odd  
public class EvenOdd{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable number to take input
	System.out.println("Enter Number");
	int number =sc.nextInt();
	//check and print Odd and Even number
	for (int i=1 ; i<=number ; i++){
		if(i%2==0){
			System.out.println(i+" is Even");
		}
		else {
			System.out.println(i+" is Odd");
		}
	}
	
	}
}