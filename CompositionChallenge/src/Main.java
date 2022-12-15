public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator(true);
        DishWasher dishWasher = new DishWasher(true);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        SmartKitchen smartKitchen = new SmartKitchen(refrigerator, dishWasher, coffeeMaker);
        smartKitchen.doKitchenWork();
    }
}
