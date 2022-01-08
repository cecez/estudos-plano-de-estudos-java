package Escola;

public class VerificadoraDeNotas {

    public static int mediaDo(Aluno aluno)
    {
        int total = 0;

        total += aluno.bimestre1;
        total += aluno.bimestre2;
        total += aluno.bimestre3;
        total += aluno.bimestre4;

        return total / 4;
    }

    public static boolean passouDeAno(Aluno aluno)
    {
        return mediaDo(aluno) >= 60;
    }

}
