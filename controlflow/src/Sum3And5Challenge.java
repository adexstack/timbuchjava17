public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; count < 5 && i <= 1000; i++){
            if(i % 15 == 0){
                count ++;
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum is "+ sum);
    }
}
