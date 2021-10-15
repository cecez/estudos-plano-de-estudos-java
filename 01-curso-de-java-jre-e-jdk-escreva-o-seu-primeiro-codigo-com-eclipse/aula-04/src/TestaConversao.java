public class TestaConversao {
    public static void main(String[] args) {
        double salario = 6403.10;
        int salarioInteiro = (int) salario;
        System.out.println(salarioInteiro);

        // long = 64bits
        // int = 32bits = +- 2bilhões
        // short = 16bits
        // byte = 8bits = 1byte
        long numeroGrande = 4523123123L;
        byte bitezinho = 127;

        // double = 64bits
        // float = 32bits
        float numeroPi = 3.14f;
        System.out.println(numeroPi);

        double operandoUm = 0.2;
        double operandoDois = 0.1;
        double total = operandoUm + operandoDois;
        System.out.println(total);
    }
}
