public class NumberToWords2 {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    // write your code here
    public static void numberToWords(int number) {
        if(number<0) {
            System.out.print("Invalid Value");
        }
        else {
            String numWords[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
            int reversed = reverse(number);
            for(int i=0; i<getDigitCount(number); i++) {
                int rem = reversed%10;
                System.out.print(numWords[rem]+" ");
                reversed = reversed/10;
            }
        }
    }

    public static int reverse(int number) {
        int rev = 0;
        while(number!=0) {
            int rem = number%10;
            number=number/10;
            rev = rev*10 + rem;
        }
        return rev;
    }

    public static int getDigitCount(int number) {
        if(number<0) {
            return -1;
        }
        int count = 1;
        while(number>9) {
            count++;
            number=number/10;
        }
        return count;
    }
}