public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;
        double imposto = -1;
        double deducao = -1;

        /*
        — Regras de IR
        De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
        De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
        De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
         */

        if (salario >= 1900.0 && salario <= 2800.0) {
            imposto = 7.5;
            deducao = 142.0;
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            imposto = 15.0;
            deducao = 350.0;
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            imposto = 22.5;
            deducao = 636.0;
        }

        System.out.println("Imposto calculado: " + imposto);
        System.out.println("Dedução calculada: " + deducao);


    }

}
