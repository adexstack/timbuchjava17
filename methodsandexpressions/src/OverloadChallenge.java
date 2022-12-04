//ret number for total height in cm
// call the methods and print out result
// 1 inch = 2.54 cm
// 1 ft = 12 inch
public class OverloadChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        double totalInches = (feet * 12) + inches;
        return convertToCentimeters((int) totalInches);
    }
}
