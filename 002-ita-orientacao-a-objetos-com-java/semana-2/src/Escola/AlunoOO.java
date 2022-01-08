package Escola;

public class AlunoOO {

    public int bimestre1;
    public int bimestre2;
    public int bimestre3;
    public int bimestre4;

    public int media()
    {
        int total = 0;

        total += bimestre1;
        total += bimestre2;
        total += bimestre3;
        total += bimestre4;

        return total / 4;
    }

    public boolean passouDeAno()
    {
        return media() >= 60;
    }
}
