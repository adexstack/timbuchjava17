public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.printf("Added %s for an extra %.2f%n", name, price);
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.printf("Added %s for an extra %.2f%n", name, price);
    }

    @Override
    public double itemizeHamburger() {
        if(healthyExtra1Name != null){
            System.out.printf("Added %s for an extra %f%n", healthyExtra1Name, healthyExtra1Price);
        }
        if(healthyExtra2Name != null){
            System.out.printf("Added %s for an extra %f%n", healthyExtra2Name, healthyExtra2Price);
        }

        return healthyExtra1Price + healthyExtra2Price + super.itemizeHamburger();
    }

}
