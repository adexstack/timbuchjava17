public class Account {
    private String accountNumber;
    private double accountBalance = 0.00;
    private String customerName;
    private String phoneNumber;
    private String email;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Not a valid amount - Negative value entered -"+amount);
            return;
        }
            System.out.println(amount + " is deposited");
            accountBalance += amount;
    }
    public void withdraw(double amount){
        if(amount > accountBalance){
            System.out.println("Not a vilid"+ amount+" is less than "+accountBalance);
            return;
        }
            System.out.println(amount + " is withdrawn");
            accountBalance -= amount;
    }
    public void printAccountDetails(){
        System.out.println("accountBalance = "+accountBalance+ " customerName = "+customerName
        +" accountNumber = "+accountNumber+" phoneNumber = "+phoneNumber+" email = "+email);
    }
}
