public class Manager extends Employee {
    private int password;

    public boolean authenticate(int password) {
        return this.password == password;
    }

    public double getBonus() {
        return this.salary;
    }
}
