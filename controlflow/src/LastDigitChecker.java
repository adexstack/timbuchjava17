public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

        System.out.println(hasSameLastDigit2 (41, 22, 71));
        System.out.println(hasSameLastDigit2 (23, 32, 42));
        System.out.println(hasSameLastDigit2 (9, 99, 999));
    }

    private static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if((num1 < 10) || (num1 > 1000) || (num2 < 10) || (num2 > 1000) || (num3 < 10) || (num3 > 1000)){
            return false;
        }
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        return((num1LastDigit == num2LastDigit)
                || (num2LastDigit == num3LastDigit)
                || (num1LastDigit == num3LastDigit));
    }

    public static boolean hasSameLastDigit2(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValid(firstNumber) || isValid(secondNumber) || isValid(thirdNumber)) {
            return false;
        }
        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;
        int thirdNumberLastDigit = thirdNumber % 10;
        return ((firstNumberLastDigit == secondNumberLastDigit) ||
                (firstNumberLastDigit == thirdNumberLastDigit) ||
                (secondNumberLastDigit == thirdNumberLastDigit));
    }
    public static boolean isValid (int number) {
        return (number < 10) || (number > 1000);
    }
}
