public class SmartKitchen {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }
    private void addWater(){
        coffeeMaker.brewCoffee();
    }
    private void pourMilk(){
        refrigerator.orderFood();
    }
    private void loadDishwasher(){
        dishWasher.doDishes();
    }
    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishwasher();
    }
}
