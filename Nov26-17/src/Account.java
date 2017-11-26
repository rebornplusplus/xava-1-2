/*
    Bank Account
 */

public class Account {
    private String Name;
    private double balance;

    public Account(String Name, double balance) {
        this.Name = Name;
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return balance;
    }

    public void creditBalance(double b) {
        this.balance += b;
    }
}