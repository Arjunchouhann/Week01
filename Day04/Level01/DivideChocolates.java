import java.util.Scanner;
//Creating class DivideChocolates to divide chocolates between childrens
public class DivideChocolates{
	//create method divideChocolate to divide chocolates
	public static int[] divideChocolate(int numberOfchocolates, int numberOfChildren){
	    // dividing chocolates in children equally
	    int chocolatesPerhead = (numberOfchocolates/numberOfChildren);
		
	    // count the remaining chocolates that are not distributed
		int remainingChocolates = numberOfchocolates % numberOfChildren;     
	     
		return new int[]{chocolatesPerhead, remainingChocolates};
	}
	public static void main(String[]args){
		//Creating Scanner object
		Scanner input = new Scanner(System.in); 
		//Creating variables numberOfChildren numberOfchocolates to take user input
		System.out.println("Enter number of chocolates ");
		int numberOfchocolates = input.nextInt();
		System.out.println("Enter number of children ");
		int numberOfChildren = input.nextInt();
	   
		//method call 
		int[] result = divideChocolate(numberOfchocolates, numberOfChildren);
		// print the result array 
		System.out.println("The number of chocolates each child gets is " + result[0] + " and the number of remaining chocolates are " + result[1]);
	}
	 
}