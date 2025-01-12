import java.util.Scanner;
//Create DoubleOpt Class to understand Operator Precedence
public class DoubleOpt{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variables a ,b and c to take input from user
		System.out.println("Enter three Numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		//Create result1 , result2 ,result3 and result4 variable to calculate integer operations
		double result1 = a+b*c;
		double result2 = a*b+c;
		double result3 = c+a/b;
		double result4 = a%b+c;
		//Print Double Operations
		System.out.println("The results of Double Operations are "+result1+" ,"+result2+" ,"+result3+" and " + result4);
		
	}
}