public class MethodChallenge {
    public static void main(String[] args){

        String[] players = {"Tim", "Steve", "Dan", "Ken", "Fed"};
        int[] values = {1500, 1000, 500, 100, 25};
        for(int i = 0; i < values.length; i++) {
            int highScorePosition = calculateHighScorePosition(values[i]);
            displayHighScorePosition(players[i], highScorePosition);
        }
    }
    public static void displayHighScorePosition(String player, int position){
        System.out.println(player +" managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if(score >= 1000 ){
            result = 1;
        } else if (score >= 500) {
            result = 2;
        } else if (score >= 100) {
            result = 3;
        }
        return result;
    }
}
