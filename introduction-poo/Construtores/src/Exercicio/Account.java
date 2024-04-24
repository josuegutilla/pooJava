package Exercicio;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double tax;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        balance = 0;
        tax = 5.0;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
        tax = 5.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + this.tax;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return this.number
                + ", Holder: "
                + this.holder
                + ", Balance: $ "
                + String.format("%.2f", this.balance);
    }
}
