public class Principal {

    public static void main(String[] args) {
        System.out.println("Chamando principal");
        a(100);
    }

    public static void a(int i) {
        System.out.println("Chamando a() com " + i);
        try {
            b(i);
        } catch (Exception e) {
            System.out.println("exceção gerada: " + e.getMessage());
        }
    }

    public static void b(int i) throws Exception {
        System.out.println("Chamando b() com " + i);
        throw new Exception("deu ruim em b()");
    }

}
