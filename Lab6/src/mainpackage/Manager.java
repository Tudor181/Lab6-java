package mainpackage;

public class Manager {
    private CititorTastatura cititor;

    private String cool_message;

    public Manager(CititorTastatura cititor) {
        this.cititor = cititor;
    }

    public String afiseazaMesaj() {
        return cool_message;
    }

    public String citesteMesaj() {
        cititor.citesteTastatura();
        return cititor.getMessage();
    }

}
