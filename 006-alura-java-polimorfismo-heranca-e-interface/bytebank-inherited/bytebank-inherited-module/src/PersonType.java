public enum PersonType {
    FISICA(1), JURIDICA(2);

    private final int id;

    PersonType(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
