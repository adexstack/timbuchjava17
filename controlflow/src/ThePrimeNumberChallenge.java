public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        int[] num = {-3, 0, 1, 2, 3, 4, 5, 7, 18, 20, 97, 100};
        for (int i : num) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
        }

        // stop if 3 prime numbers are found in range
        int counter = 0;
        for(int i = 0; i <= 1000; i++){
            if(isPrime(i)){
                counter ++;
                System.out.println(i + " is prime and current counter is "+ counter);
                if(counter == 3){
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }

        // Optimized "stop if 3 prime numbers are found in range" This will not print when count is reached though
        System.out.println("Optimized count and isPrime in For loop");
        int count = 0;
        for(int i = 0; count < 3 && i <= 1000; i++){
            if(isPrime(i)){
                count ++;
                System.out.println(i + " is prime and current counter is "+ count);
            }
        }

//        for(int i = -1; i <= 20; i++){
//            System.out.println(i + " is " + selfCheck(i));
//        }
    }



    private static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        // for (int divisor = 2; divisor < wholeNumber ; divisor++) {
        // optimizing to the below to reduce iterations waste as 7/3 equiv 7/6
        for (int divisor = 2; divisor <= wholeNumber/2 ; divisor++) {
            if ((wholeNumber % divisor) == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean selfCheck(int wholeNumber) {
        // all numbers less and more than 5 return false
        if (wholeNumber <= 10) {
            return (wholeNumber == 5);
        }
        return true;
    }
}
