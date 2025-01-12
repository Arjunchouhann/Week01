import java.util.Scanner;
//Create Class NaturalNumFor to find number is natural and also sum of natural number  
public class NaturalNumFor{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable number to take input
	System.out.println("Enter Number");
	int number =sc.nextInt();
	int sum;
	int sumFor=0; //Creating Two Variables sum sumFor
	//check if the number is natural or not and compare it
	for(int n=number; n>0 ;n--){
			sumFor+=n;
			
	}
	if(number>0){
		sum = number*(number+1)/2;
		if(sum==sumFor){
			System.out.println("Compared answers is " +sum+" and "+sumFor );
		}
	}
	else{
		System.out.println("The number "+number+" is not a natural number");
	}
	}
}