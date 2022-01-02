public class Principal2 {

    public static void main(String[] args) {
        Paciente joaoPedro = new Paciente(18, 1.20);
        Paciente cezar = new Paciente(69, 1.74);
        Paciente anaPaula = new Paciente(72, 1.70);

        System.out.println("Diagnóstico do paciente João Pedro: " + joaoPedro.diagnostico());
        System.out.println("Diagnóstico do paciente Cezar: " + cezar.diagnostico());
        System.out.println("Diagnóstico da paciente Ana Paula: " + anaPaula.diagnostico());
    }

}
