import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to check if it is a prime number: ");
        int number = scanner.nextInt();

        // Variable to store if the number is prime
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                // If the number is divisible by any number other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit the loop
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
	}
}