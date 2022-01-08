package Escola;

public class Principal
{

    public static void main(String[] args)
    {
        // Forma estática, procedural
        Aluno cezar = new Aluno();
        cezar.bimestre1 = 60;
        cezar.bimestre2 = 80;
        cezar.bimestre3 = 50;
        cezar.bimestre4 = 90;

        System.out.println(VerificadoraDeNotas.mediaDo(cezar));
        System.out.println(VerificadoraDeNotas.passouDeAno(cezar));

        // Forma orientada a objetos
        AlunoOO cezar2 = new AlunoOO();
        cezar2.bimestre1 = 90;
        cezar2.bimestre2 = 90;
        cezar2.bimestre3 = 90;
        cezar2.bimestre4 = 90;

        System.out.println(cezar2.media());
        System.out.println(cezar2.passouDeAno());

    }

}
