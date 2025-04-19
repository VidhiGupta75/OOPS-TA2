import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input numbers from the user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Code in this block is always executed
            System.out.println("Execution completed. Closing the scanner.");
            scanner.close();
        }
    }
}
