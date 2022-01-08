public class RegistroDePontos {

    private CalculadoraDeBonus calculadoraDeBonus;

    public RegistroDePontos(CalculadoraDeBonus cb)
    {
        calculadoraDeBonus = cb;
    }

    public void fazerUmComentario(Usuario u)
    {
        u.pontos += (3 * calculadoraDeBonus.calcula(u));
    }

    public void criarUmTopico(Usuario u)
    {
        u.pontos += (5 * calculadoraDeBonus.calcula(u));
    }

    public void darUmLike(Usuario u)
    {
        u.pontos += (calculadoraDeBonus.calcula(u));
    }

}
