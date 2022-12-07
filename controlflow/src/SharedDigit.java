/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }
        int firstNumberFirstDigit = firstNumber / 10;
        int firstNumberSecondDigit = firstNumber % 10;
        int secondNumberFirstDigit = secondNumber / 10;
        int secondNumberSecondDigit = secondNumber % 10;
        return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberSecondDigit)
                || (firstNumberSecondDigit == secondNumberFirstDigit) || (firstNumberSecondDigit == secondNumberSecondDigit));
    }

}
