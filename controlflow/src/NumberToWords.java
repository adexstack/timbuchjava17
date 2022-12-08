public class NumberToWords {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
       // reverse("321");

    }

    public static void reverse(String word) {
        for(int i = word.length()-1; i >= 0; i--){
            char currentDigit = (word.charAt(i));
            switch (currentDigit){
                case '0' -> System.out.println("zero");
                case '1' -> System.out.println("one");
                case '2' -> System.out.println("two");
                case '3' -> System.out.println("three");
                case '4' -> System.out.println("four");
                case '5' -> System.out.println("five");
                case '6' -> System.out.println("six");
                case '7' -> System.out.println("seven");
                case '8' -> System.out.println("eight");
                case '9' -> System.out.println("nine");
                default -> System.out.println("");
            }
        }
    }

    public static void numberToWords(int number) {
        String numString = "";
        if(number < 1){
            System.out.println("Invalid Value");
        }
        while(number > 0){
            int lastDigit = number % 10;
            number /= 10;
            numString += lastDigit;
        }
        reverse(numString);
    }
}
