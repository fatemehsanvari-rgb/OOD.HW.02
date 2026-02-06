package ticket;

import state.*;

public class Ticket {

    private int id;
    private String type;
    private TicketState currentState;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
        this.currentState = new CreatedState(); // وضعیت اولیه
    }

    public void handleRequest() {
        currentState.handle(this);
    }

    public void changeState(TicketState newState) {
        this.currentState = newState;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}