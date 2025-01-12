import java.util.Scanner;
//Create Class NaturalNumWhile to find number is natural and also sum of natural number  
public class NaturalNumWhile{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable number to take input
	System.out.println("Enter Number");
	int number =sc.nextInt();
	int n=number;
	int sum;
	int sumWhile=0; //Creating Two Variables sum sumWhile
	//check if the number is natural or not and compare it
	while(n>0){
			sumWhile+=n;
			n--;
	}
	if(number>0){
		sum = number*(number+1)/2;
		if(sum==sumWhile){
			System.out.println("Compared answers is " +sum+" and "+sumWhile );
		}
	}
	else{
		System.out.println("The number "+number+" is not a natural number");
	}
	}
}