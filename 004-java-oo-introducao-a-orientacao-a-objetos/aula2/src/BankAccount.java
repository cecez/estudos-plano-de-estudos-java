public class BankAccount {
    private double balance = 0;
    private int agency;
    private int number;
    private BankClient bankClient;
    private boolean active = true;
    private char code;

    public boolean getActive() {
        return this.active;
    }

    public double balance() {
        return this.balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        }
    }

    public boolean withdraw(double value) {
        if (value > this.balance) {
            return false;
        }

        this.balance -= value;
        return true;
    }

    public boolean transfer(double value, BankAccount destinationAccount) {
        if (this.withdraw(value)) {
            destinationAccount.deposit(value);
            return true;
        }

        return false;
    }
}
