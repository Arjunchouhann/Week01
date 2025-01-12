import java.util.Scanner;
//Create Class SpringSeasonMethod to find season is spring
public class SpringSeasonMethod{
	
	//Create springSeason method to find spring season
	public boolean springSeason(int month,int date){
		//check whether season is spring or not
		if(month==3 && date>=20 ){
			return true ;
		}
		else if(month==6 && date<=20){
			return true ;	
		}
		else if(month==4 && date>=1){
			return true ;
		}
		else if(month==5 && date>=1 ){
			return true;
		}
		else{
			return false;
		}
	}


	public static void main(String[]args){
		
		//Create Scanner Object
		Scanner sc = new Scanner (System.in);
		
		//creating variables month and date to take input
		System.out.println("Enter month and Date");
		int month = sc.nextInt();
		int date = sc.nextInt();
		
		//creating object of class SpringSeasonMethod 
		SpringSeasonMethod obj = new SpringSeasonMethod();
		
		//using object we call springSeason method
		boolean ans = obj.springSeason(month,date);
		
		//Print ans
		System.out.println("This season is spring ? "+ans);
	
	}
}