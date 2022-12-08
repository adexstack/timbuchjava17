import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        findMinMax();
    }

    private static void findMinMax() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int loopCount = 0;
        while(true){
            System.out.println("Please enter a valid number or any character to quit");
            String userIn = scanner.nextLine();
            try{
                int validNumber = Integer.parseInt(userIn);
                if(loopCount == 0 || validNumber < min){
                    min = validNumber;
                }
                if(loopCount == 0 || validNumber > max){
                    max = validNumber;
                }
                loopCount++;
            }catch (NumberFormatException nfe){
                System.out.println("That was not a valid number");
                break;
            }
        }
        if(loopCount > 0){
            System.out.println("min is "+min + " max is "+max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
