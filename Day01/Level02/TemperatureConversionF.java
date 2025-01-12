import java.util.Scanner;
//Create TemperatureConversionF Class to convert Fahrenheit into Celsius
public class TemperatureConversionF{
	public static void main (String[]args){
		//Create Scanner Object to take user input from Standard Input 
		Scanner sc= new Scanner (System.in);
		//Create variable fahrenheit to take user input 
		System.out.println("Enter Temperature in fahrenheit");
		double fahrenheit = sc.nextDouble();
		//Create variable celsiusResult to convert fahrenheit into fahrenheit 
		double celsiusResult = (fahrenheit-32)*5/9;
		//Print both fahrenheit and celcius value
		System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
		
	}
}