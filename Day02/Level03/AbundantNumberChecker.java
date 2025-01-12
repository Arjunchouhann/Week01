import java.util.Scanner;
//create class AbundantNumberChecker to find  number is abundant or not
public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sumOfDivisors = 0;
		// Loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sumOfDivisors += i; // Add the divisor to the sum
            }
        }
		// Check if the sum of divisors is greater than the number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}