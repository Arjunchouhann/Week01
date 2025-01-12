import java.util.Scanner;
//Create Class LeapYear to to find whether the year is Leap Year or not a Leap Year. 
public class LeapYear{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variable year to take input
	System.out.println("Enter Year");
	int year =sc.nextInt();
	//check whether the year is Leap Year or not a Leap Year 
	if(year>=1582){
		if(year%100==0){
			if(year%400==0){
				System.out.println(year +" is a Leap year");
			}
			else {
				System.out.println(year +" is not a Leap year");
			}
		}
		else if(year%4==0){
			System.out.println(year +" is a Leap year");
		}
		else {
			System.out.println(year +" is not a Leap year");
		}
		}
	else {
		System.out.println(year +" is not a Leap year");
	}
	}
}