public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    private static int sumDigits(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 9) {
            // extract the least-significant digit
            sum += (number % 10);
            // drop the least-significant digit
            number = number / 10;   // same as number = number / 10;
        }
        return sum + number;
    }
}


