public class WhileLoopChallenge {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int number = 4;
        while (number <= 20 && evenCount < 5) {
            number++;
            if(!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println("Even Number" +number);

        }
        System.out.println("Total Even Number Count is "+evenCount);
        System.out.println("Total Odd Number Count is "+oddCount);
    }

    private static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }

}
