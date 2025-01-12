import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// create number to Get input for the base number and the power
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
		System.out.print("Enter the power : ");
        int power = scanner.nextInt();
		// Initialize the result variable
		int result = 1;
		// Calculate the power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply the result by the number
        }
		// Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
	}
}