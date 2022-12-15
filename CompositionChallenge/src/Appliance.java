public class Appliance {
    private boolean hasWorkToDo;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
    public void doKitchenWork(){

    }
}
class Refrigerator extends Appliance{
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void orderFood(){
        System.out.println(isHasWorkToDo() ? "Food is made" : "");
    }
}

class DishWasher extends Appliance{

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void doDishes(){
        System.out.println(isHasWorkToDo() ? "Dishes is done" : "");
    }
}

class CoffeeMaker extends Appliance{

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void brewCoffee(){
        System.out.println(isHasWorkToDo() ? "Coffee is brewed" : "");
    }
}
