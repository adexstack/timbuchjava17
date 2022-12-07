public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSumOpt(252));
        System.out.println(getEvenDigitSumOpt(123456789));
    }

    private static int getEvenDigitSum(int number) {
        if(number < 0){
            return -1;
        }
        int evenSum = 0;
        while(number > 0){
            // extract the least-significant digit
            int lastDigit = number % 10;
            // drop the least-significant digit
            number = number / 10;
            // only add even digits
            if(lastDigit % 2 != 0){
                continue;
            }
            evenSum += lastDigit;
        }
        return evenSum;
    }

    public static int getEvenDigitSumOpt(int number){
        if(number<0){
            return -1;
        }

        int lastDigit,evenSum=0;

        while(number>0){
            lastDigit = number%10;
            if(lastDigit%2==0){
                evenSum+=lastDigit;
            }
            number/=10;
        }
        return evenSum;
    }
}
