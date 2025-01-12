import java.util.Scanner;
//Create Price Class to calculate the total price
public class Price{
	public static void main(String [] args){
		//Create Scanner Object to take user input from Standard Input
		Scanner sc = new Scanner (System.in);
		//Create variable unitPrice to take input from user
		double unitPrice = sc.nextDouble();
		//Create variable quantity to take input from user
		double quantity = sc.nextDouble();
		//Create variable totalPrice to calculate total price
		double totalPrice = unitPrice*quantity;
		//Print Total price 
		System.out.println("The total purchase price is INR "+ totalPrice +" if the quantity "+ quantity +" and unit price is INR "+ unitPrice);
	}
}
	
		