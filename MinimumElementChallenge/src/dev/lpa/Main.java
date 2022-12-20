package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;
// Excellent Implementation of more complicated scenario, Tim's also good implementation
public class Main {
    public static void main(String[] args) {
        int[] userIns = readIntegers();
        System.out.println(Arrays.toString(userIns));
        System.out.println("The minimum value in the array is " + findMin(userIns));
    }
    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number or Q to exit :");

        StringBuilder numIn = new StringBuilder();
        while(true){
            String userIn = scanner.nextLine();
            if("Qq".contains(userIn)){
                break;
            }
            numIn.append(userIn).append(" ");
        }
        String numsString = String.valueOf(numIn);
        String[] numsArray = numsString.split(" ");
        int[] intArray = new int [numsArray.length];
        for(int i = 0; i < numsArray.length; i++){
            intArray[i] = Integer.parseInt(numsArray[i]);
        }
        return intArray;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int num:
             array) {
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
