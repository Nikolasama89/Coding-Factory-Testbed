package gr.aueb.cf.ch13.bankapp.model;

public class OverDraftAccount {
    private double balance;

    public OverDraftAccount() {}

    public OverDraftAccount(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }
}
