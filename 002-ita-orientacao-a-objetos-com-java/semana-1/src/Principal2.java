public class Principal2 {

    public static void main(String[] args) {
        Paciente joaoPedro = new Paciente(18, 1.20);
        Paciente cezar = new Paciente(69, 1.74);
        Paciente anaPaula = new Paciente(78, 1.70);

        System.out.println("Paciente João Pedro\n IMC: " + joaoPedro.calcularIMC() + "\n Diagnóstico: " + joaoPedro.diagnostico());
        System.out.println("\n");
        System.out.println("Paciente Cezar\n IMC: " + cezar.calcularIMC() + "\n Diagnóstico: " + cezar.diagnostico());
        System.out.println("\n");
        System.out.println("Paciente Ana Paula\n IMC: " + anaPaula.calcularIMC() + "\n Diagnóstico: " + anaPaula.diagnostico());
    }

}
