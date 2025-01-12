import java.util.Scanner;
//Create TemperatureConversion Class to convert Celsius into Fahrenheit
public class TemperatureConversion{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variable celsius to take user input 
		System.out.println("Enter Temperature in celcius");
		double celcius = sc.nextDouble();
		//Create variable fahrenheitResult to convert celcius into fahrenheit 
		double fahrenheitResult = (celcius*9/5)+32;
		//Print both fahrenheitand celcius value
		System.out.println("The "+celcius+" celsius is "+fahrenheitResult+" fahrenheit");
		
	}
}