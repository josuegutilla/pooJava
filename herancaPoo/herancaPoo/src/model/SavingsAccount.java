package model;

public final class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int number, String holder, double balance) {
        super(number, holder, balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // fazendo uma sobreposicao

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
