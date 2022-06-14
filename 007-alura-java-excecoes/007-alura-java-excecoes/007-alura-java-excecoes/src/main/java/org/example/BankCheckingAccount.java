package org.example;

public class BankCheckingAccount extends BankAccount implements Taxable {
    public BankCheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void withdraw(double value) {
        double withdrawTax = 0.2;
        double totalCostWithdraw = value + withdrawTax;
        super.withdraw(totalCostWithdraw);
    }

    @Override
    public double calculateTaxValue() {
        double tax = 0.10;
        return this.balance() * tax;
    }
}
