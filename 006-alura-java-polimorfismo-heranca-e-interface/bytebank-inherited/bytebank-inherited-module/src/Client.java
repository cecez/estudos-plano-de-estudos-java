public class Client implements Authenticable {

    private final PersonType personType;

    private final AuthenticableUtil authenticator;

    public Client() {
        this.personType = PersonType.FISICA;
        this.authenticator = new AuthenticableUtil();
    }

    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }
}
