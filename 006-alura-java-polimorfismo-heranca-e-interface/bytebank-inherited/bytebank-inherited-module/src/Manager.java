public class Manager extends Employee implements Authenticable {

    private final AuthenticableUtil authenticator;

    public Manager() {
        this.authenticator = new AuthenticableUtil();
    }

    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }

    public double getBonus() {
        return super.getSalary();
    }
}
