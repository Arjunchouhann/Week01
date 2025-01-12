import java.util.Scanner;
//Create Class Vote to find person can vote or not
public class Vote{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable age to take input as person's Age
	System.out.println("Enter Age of person");
	int age =sc.nextInt();
	//check whether person can vote or not
	if(age>=18){
		System.out.println("The person's age is "+age+" and can vote.");
	}
	else{
		System.out.println("The person's age is "+age+" and cannot vote.");
	}
	}
}