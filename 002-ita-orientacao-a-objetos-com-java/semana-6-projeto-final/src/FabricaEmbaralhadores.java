public class FabricaEmbaralhadores {
    public static Embaralhador create() {
        return new EmbaralhadorSimples();
    }
}
