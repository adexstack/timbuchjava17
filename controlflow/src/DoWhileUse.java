public class DoWhileUse {
    public static void main(String[] args) {
    int j = 1;
    boolean isReady;
    do {
        if (j > 5){
            break;
        }
        System.out.println(j);
        j++;
        isReady = true;
    } while (isReady);
}
}
