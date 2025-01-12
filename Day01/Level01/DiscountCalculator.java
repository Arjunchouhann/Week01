//Create DiscountCalculator Class for finding the discounted amount 
//and discounted price the student will pay for the course
public class DiscountCalculator{
	public static void main (String[]args){
		//Create a variable fee to indicate university fee
		int fee = 125000;
		//Create a variable discountPercent to indicate university discount percentage
		int discountPercent = 10;
		//Create a variable discount to find discount over fee
		int discount = (fee * discountPercent)/100;
		//Create a variable discountedfee to calculate discounted fee
		int discountedfee = fee - discount ;
		//Print discounted amount and discounted price the student will pay for the course
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedfee);
	}
}