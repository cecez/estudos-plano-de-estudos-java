public class CalculadoraDeBonus {

    public int bonusDoDia = 1;

    public int calcula(Usuario u)
    {
        int multiplicador = bonusDoDia;
        if (u.vip) {
            multiplicador = 5;
        }

        return multiplicador;
    }
}
