public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        switchUseTraditional('o');
        switchUseEnhanced('o');
        switchUseTraditional('b');
        switchUseEnhanced('b');
    }

    public static void switchUseTraditional(char alpha){
        switch (alpha){
            case 'a':
                System.out.println("able");
                break;
            case 'b':
                System.out.println("bake");
                break;
            case 'c':
                System.out.println("cake");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            case 'e':
                System.out.println("egg");
                break;
            default:
                System.out.println(alpha + " Not a valid character");
                break;
        }
    }

    public static void switchUseEnhanced(char alpha){
        switch (alpha) {
            case 'a' -> System.out.println("able");
            case 'b' -> System.out.println("bake");
            case 'c' -> System.out.println("cake");
            case 'd' -> System.out.println("Dog");
            case 'e' -> System.out.println("egg");
            default -> System.out.println(alpha + " Not a valid character");
        }
    }
}
