import java.util.Scanner;
//Create ProfitCalculator Class to calculate profit and loss in number and percentage 
public class ProfitCalculator{
	public static void main (String[]args) {
		//create a variable costPrice to indicate cost price
		int costPrice = 129 ;
		//create a variable sellingPrice to indicate selling price price
		int sellingPrice = 191 ;
		//create a variable profit to calculate profit 
		int profit = sellingPrice - costPrice ;
		//create a variable profitPercentage to calculate profit percentage
		double profitPercentage = (double)profit/ (double)costPrice*100;
		//print profit and loss in number and percentage
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
		
	}
}