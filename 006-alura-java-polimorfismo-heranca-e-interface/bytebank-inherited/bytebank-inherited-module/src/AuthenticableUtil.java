public class AuthenticableUtil {
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int password) {
        return this.password == password;
    }
}
