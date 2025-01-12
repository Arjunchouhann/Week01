import java.util.Scanner;
//Create IntOperation Class to understand Operator Precedence
public class IntOperation{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variables a ,b and c to take input from user
		System.out.println("Enter three Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//Create result1 , result2 ,result3 and result4 variable to calculate integer operations
		int result1 = a+b*c;
		int result2 = a*b+c;
		int result3 = c+a/b;
		int result4 = a%b+c;
		//Print Integer Operations
		System.out.println("The results of Int Operations are "+result1+" ,"+result2+" ,"+result3+" and " + result4);
		
	}
}