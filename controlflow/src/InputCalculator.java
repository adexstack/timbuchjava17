import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int loopCount = 0;
        int sum = 0;
        double avg = 0;
        while (true) {
            System.out.println("Please enter a valid number");
            String userIn = scanner.nextLine();
            try {
                int validUserIn = Integer.parseInt(userIn);
                loopCount++;
                sum += validUserIn;
                avg = Math.round((double) sum / loopCount);
            } catch (NumberFormatException nfe) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }

        }
    }

    public static void inputThenPrintSumAndAverage2(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long average = 0;

        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                sum+=number;
                count++;
            } else{
                break;
            }
            scanner.nextLine();
        }
        average = Math.round((double)sum/count);
        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.close();
    }
}
