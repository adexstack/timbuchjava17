public class OverLoading {
    public static void main(String[] args) {
        //System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("Default score is "+ calculateScore(1000));

    }
    public static int calculateScore(String player, int score){
        System.out.println(player + " scored "+ score);
        return score;
    }

    public static int calculateScore(int score){
        return calculateScore("defaultPlayer", score);
    }
}
