public class FirstClass {
    public static void main(String[] args) {
        double doubleNum1 = 20.00d;
        double doubleNum2 = 80.00d;
        double res1 = (doubleNum1 + doubleNum2) * 100.00d;
        System.out.println("res1 is "+ res1);

        double remainder = res1 % 40.00d;
        System.out.println("remainder is "+remainder);

        boolean isZero = (remainder == 0.00)? true : false;
        System.out.println("isZero is "+isZero);

        if(!isZero){
            System.out.println("got some remainder");
        }

        int myNum = 20;
        myNum++;
        myNum -= 5;
        System.out.println(myNum);
        }

    }


