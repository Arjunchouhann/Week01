import java.util.Scanner;
public class UniversityFeeCalculator{
	public static void main (String[]args){
	    //Create Scanner Object to take user input from Standard Input 
		Scanner sc = new Scanner(System.in);
		//Create a variable fee to take input as university fee
		System.out.println("Enter University fee");
		int fee = sc.nextInt();
		//Create a variable discountPercent to indicate university discount percentage
		System.out.println("Enter Discount percentage");
		int discountPercent = sc.nextInt();
		//Create a variable discount to find discount over  fee
		int discount = (fee * discountPercent)/100;
		//Create a variable discountedfee to calculate discounted fee
		int discountedfee = fee - discount ;
		//Print discounted amount and discounted price the student will pay for the course
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedfee);
	}
}