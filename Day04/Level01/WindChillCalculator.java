import java.util.Scanner;
//Creating class WindChillCalculator to calculate wind chillness	
public class WindChillCalculator{
	//create method calculateWindChill to find wind chillness
	public double calculateWindChill(double temperature, double windSpeed){
	    //Calculation part
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
	    //return chill
		return windChill;
    }
	//main method
    public static void main(String[] args) {
        //Scanner object
		Scanner input = new Scanner(System.in);
        //Creating variable temperature and windSpeed to take user input
		System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
		System.out.print("Enter speed of wind: ");
        double windSpeed = input.nextDouble();
         
        // object creation of the class
         WindChillCalculator object = new WindChillCalculator();
		 
        // Call trigonometric calculator function
        double result = object.calculateWindChill(temperature, windSpeed); 

        // Display the results 
        System.out.print("The wind chill temperature is: "+ result);
    }
}