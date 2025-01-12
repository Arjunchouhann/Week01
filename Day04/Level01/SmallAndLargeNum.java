import java.util.*;
//Creating class SmallAndLargeNum to find the smallest and the largest of the 3 numbers.
public class SmallAndLargeNum{
	//create method findSmallestAndLargest to calculate sun of natural number
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int smallestNumber , largestNumber;
		 // checking for smallest number
		if(number1 < number2 && number1 < number3){
			smallestNumber = number1;
		} 
		else if(number2 < number3){
			smallestNumber = number2;
		} 
		else {
			smallestNumber = number3; 	 
		}
		 
		// checking for largest number
		if(number1 > number2 && number1 > number3){
			largestNumber = number1;
		} 
		else if(number2 > number3){
			largestNumber = number2;
		} 
		else {
			largestNumber = number3; 	 
		}
		return new int[]{smallestNumber,largestNumber};
	}
		
	public static void main (String[]args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Creating variables number1, number2, number3 to take  input from user
		System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number3: ");
        int number3 = input.nextInt();
	
		/* method calling without creating object because
		static method and storing in result array */
		int[] result = findSmallestAndLargest(number1, number2, number3);
		
		System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);


	}
}