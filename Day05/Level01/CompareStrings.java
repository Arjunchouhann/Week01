import java.util.*;
//Creating class CompareStrings to compare string 
public class CompareStrings{
	//Creating method comparingCharAt to checking equality of string by charAt
	public static boolean comparingCharAt(String one , String two ){
		for (int i=0; i<one.length() ; i++){
			if(one.charAt(i)!=two.charAt(i)){
				return false;
			}
		}
		return true;		
	}
	
	
	//Creating Method comparingBuiltIn to check ing equality of string by built in
	public static boolean comparingBuiltIn(String one , String two){
		if(one.equals(two)){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//Main class 
	public static void main (String [] args){
		//Creating Scanner object
		Scanner sc = new Scanner (System.in);
		//Creating 	variable one and two to take user input
		String one = sc.nextLine().trim();
		String two = sc.nextLine().trim();
		//Calling methods
		boolean ans = comparingBuiltIn(one,two);
		boolean isTrue = comparingCharAt(one,two);
		//print
		if(ans && isTrue){
			System.out.println("Strings are equal with both methods");
		}
		else {
			System.out.println("Strings are not equal with both methods");
		}
			
	}
}
		