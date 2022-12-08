public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1){
            return false;
        }
       int divisorSum = 0;
        for(int divisor = number/2; divisor > 0; divisor--){
            if(number % divisor == 0){
                divisorSum += divisor;
            }
        }
        return(divisorSum == number);
    }
}
