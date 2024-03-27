import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (enter -1 to finish): ");
            int number = scanner.nextInt();

            if (number == -1) {
                continueInput = false;
            } else {
                // Update largest and smallest
                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);
                
                // Update sum and count for average calculation
                sum += number;
                count++;
            }
        }

        double average = (double) sum / count;

        if (count > 0) {
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
