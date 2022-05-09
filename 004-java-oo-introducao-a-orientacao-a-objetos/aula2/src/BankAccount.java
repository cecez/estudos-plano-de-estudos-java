public class BankAccount {
    double balance = 0;
    int agency;
    int number;
    String holder;
    boolean active = true;
    char code;

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if (value > this.balance) {
            return false;
        }

        this.balance -= value;
        return true;
    }
}
