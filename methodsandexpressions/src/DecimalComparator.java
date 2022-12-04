/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

EXAMPLES OF INPUT/OUTPUT:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */
public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        String pr = num1 + "00000";
        int decimalindex = pr.indexOf(".");
        String prToUse1 = pr.substring(0, (decimalindex + 4));

        pr = num2 + "00000";
        decimalindex = pr.indexOf(".");
        String prToUse2 = pr.substring(0, (decimalindex + 4));
        return prToUse1.equals(prToUse2);
    }

    // More optimised
    public static boolean areEqualByThreeDecimalPlaces2(double num1, double num2) {
        // casting to int will discard the decimal places
        return ((int) (num1 * 1000) == (int) (num2 * 1000));
    }
}
