import java.util.Scanner;
//Create Class SpringSeason to find season is spring
public class SpringSeason{
	public static void main(String[]args){
	//Create Scanner Object
	Scanner sc = new Scanner (System.in);
	//creating variables month and date to take input
	System.out.println("Enter month and Date");
	int month = sc.nextInt();
	int date = sc.nextInt();
	//check whether season is spring or not
	if(month==3 && date>=20 ){
		System.out.println("Its a Spring Season");
	}
	else if(month==6 && date<=20){
		System.out.println("Its a Spring Season");
	}
	else if(month==4 && date>=1){
		System.out.println("Its a Spring Season");
	}
	else if(month==5 && date>=1 ){
		System.out.println("Its a Spring Season");
	}
	else{
		System.out.println("Not a Spring Season");
	}
	}
}