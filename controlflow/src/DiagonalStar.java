public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number){
        if (number<5)
        {System.out.println("Invalid Value");
            return;
        }

        for (int row=1;row<=number;row++){
            for (int column=1;column<=number;column++){
                System.out.print((row == 1|| row == column || column == 1 || column == number || column + row == (number + 1) || row == number) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
