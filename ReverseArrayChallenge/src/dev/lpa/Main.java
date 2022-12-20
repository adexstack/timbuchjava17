package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        System.out.println(Arrays.toString(reverseArray(returnedArray)));


    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int[] reverseArray(int[] array) {
        Arrays.sort(array);
        int[] reverseArray= new int[array.length];

        for(int i = 0; i < reverseArray.length; i++){
            if(i == 0){
                reverseArray[i] = array[reverseArray.length - 1];
            } else {
                reverseArray[i] = array[reverseArray.length - i - 1];
            }
        }

        return reverseArray;
    }
}
