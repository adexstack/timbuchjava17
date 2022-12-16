public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // Though setting health to 200 in the constructor, it would be reset in EnhancedPlayer class to 100
        // no direct access to set fields, variables changes doesn't affect the codes using them
        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200,
                "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
        tim.loseHealth(50);
        tim.restoreHealth(20);
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
