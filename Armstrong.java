import java.util.Scanner; // Import the Scanner class

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize the Scanner
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read the integer input from the user

        int originalNumber, remainder, result = 0;
        originalNumber = num;

        // Logic to check if the number is an Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // Cube the remainder and add to result
            originalNumber /= 10; // Remove the last digit
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        scanner.close(); // Close the scanner
    }
}

