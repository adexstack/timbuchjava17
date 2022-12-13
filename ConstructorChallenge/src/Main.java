public class Main {
    public static void main(String[] args) {
        Customer defaultcustomer = new Customer("Tim", 100.25, "tim@yahoo.com");
        System.out.println(defaultcustomer.getName());
        System.out.println(defaultcustomer.getCreditLimit());
        System.out.println(defaultcustomer.getEmailAddress());

        Customer nobody = new Customer();
        System.out.println(nobody.getName());
        System.out.println(nobody.getCreditLimit());
        System.out.println(nobody.getEmailAddress());

        Customer seyi = new Customer("Seyi", "seyi@yahoo.com");
        System.out.println(seyi.getName());
        System.out.println(seyi.getCreditLimit());
        System.out.println(seyi.getEmailAddress());

        // creating reference to seyi object
        Customer femi = seyi;
        System.out.println(femi.getName());




    }
}
