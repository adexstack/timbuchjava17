public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit (int num) {
        if (num <0){
            return -1;
        }
        int lastDigit = num % 10;
        while (num >=10) {
            num /= 10;
        }
        return num + lastDigit;
    }
}

