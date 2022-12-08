package ReadingUserInput.src;
import java.util.Scanner;

public class ReadingUserInputChallenge {
    static Scanner scanner = new Scanner(System.in);
    static int validCount = 1;
    static int sum = 0;
    static double sumDouble = 0;

    public static void main(String[] args) {
        //useDoWhile();
        useWhile();
    }

    private static void useDoWhile() {
        do {
            System.out.println("Enter number #" + validCount);
            try {
                sum += Integer.parseInt(scanner.nextLine());
                validCount++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number. Please enter a valid number");
            }
        } while (validCount <= 5);
        System.out.println("sum is " + sum);
    }

    private static void useWhile() {
        while (validCount <= 5) {
            System.out.println("Enter number #" + validCount);
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                sumDouble += number;
                validCount++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number. Please enter a valid number");
            }
        }
        System.out.println("sum is " + sumDouble);
    }
}
