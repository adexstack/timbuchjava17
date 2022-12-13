public class Main {
    public static void main(String[] args) {
        Account accBen = new Account();
        accBen.printAccountDetails();
        accBen.setAccountBalance(100);
        accBen.setCustomerName("Ben");
        accBen.setAccountNumber("44244355");
        accBen.setEmail("ben@yahoo.com");
        accBen.setPhoneNumber("075564433");
        accBen.deposit(400);
        accBen.withdraw(300);
        accBen.printAccountDetails();
        accBen.withdraw(500);
        accBen.printAccountDetails();
        accBen.deposit(-400);
        accBen.printAccountDetails();

    }
}
