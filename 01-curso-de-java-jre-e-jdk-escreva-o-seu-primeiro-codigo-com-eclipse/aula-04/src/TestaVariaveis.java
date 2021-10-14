public class TestaVariaveis {
    public static void main(String[] args) {
        System.out.println("Imprimindo idades do tipo int");

        int idade;
        int anoDeNascimento;
        int anoFuturo;

        idade = 35;

        System.out.println("Cezar tem " + idade + " anos em 2021.");

        anoDeNascimento = 1986;
        anoFuturo = 2060;

        idade = anoFuturo - anoDeNascimento;

        System.out.println("Cezar terá " + idade + " anos em " + anoFuturo + ".");
    }
}
