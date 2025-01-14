import java.util.Scanner;  

// Creating a class SubstringCheck to define the method for substring Making
class SubstringCheck {

    // Creating substringChecker method to create substring without using built-in function
    public static String substringChecker(String string1, int start, int end) {
        StringBuilder subString = new StringBuilder();  // Using StringBuilder for efficient string manipulation
        // Looping from start index to end index
        for (int i = start; i < end; i++) {
            subString.append(string1.charAt(i));  // Appending each character to StringBuilder
        }
        return subString.toString();  // Converting StringBuilder to string and returning
    }

    // Main method to drive the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object to take input from user
        
        // Asking the user to enter the main string
        System.out.println("Enter the String ");
        String string1 = input.nextLine();  // Reading the input string
        
        // Asking the user for the start index for substring extraction
        System.out.println("Enter the Start index for Substring ");
        int start = input.nextInt();  // Reading the start index
        
        // Asking the user for the end index for substring extraction
        System.out.println("Enter the End Index for Substring ");
        int end = input.nextInt();  // Reading the end index
        
        // Using the custom substringChecker method to extract substring without using the built-in method
        String subString1 = SubstringCheck.substringChecker(string1, start, end);
        
        // Using the built-in substring() method to extract the substring for comparison
        String subString2 = string1.substring(start, end);
        
        // Comparing the two substrings to check if they are equal
        boolean isEqual = subString1.equals(subString2);
        
        // Output whether the substrings are equal or not
        if (isEqual) {
            System.out.println("The substring "+ subString1 + " and " + subString2 +" is equal");
        } else {
            System.out.println("The substring  "+ subString1 + " and " + subString2 +" is not equal");
        }
        
    }
}
