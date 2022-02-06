public class Autenticador {

    public Usuario autentica(String login, String senha) throws LoginException {

        if (login.equals("admin") && senha.equals("admin")) {
            return new Usuario(login);
        }

        throw new LoginException("deu ruim no login", login);
    }
}
