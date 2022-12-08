public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if(num1 < 10 || num2 < 10){
            return -1;
        }
        // only looping from half the num to save memory and reducing by 1 and comparing
        for(int i = num1 / 2; i >=1; i-- ){
            if(num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }
        return -1;
    }
}
