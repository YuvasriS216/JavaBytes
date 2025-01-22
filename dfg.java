import java.util.Scanner;

class GFG {
    // main function
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int sum = 0;
        System.out.println("Finding Sum of " + N + " numbers using for loop");

        // Loop to calculate the sum of the first N natural numbers
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + N + " Natural Number = " + sum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
