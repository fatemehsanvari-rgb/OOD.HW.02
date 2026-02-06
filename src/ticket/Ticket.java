package ticket;

public class Ticket {
    private int id;
    private String type;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
