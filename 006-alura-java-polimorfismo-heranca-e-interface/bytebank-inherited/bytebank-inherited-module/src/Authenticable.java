public interface Authenticable {
    void setPassword(int password);
    boolean authenticate(int password);
}
