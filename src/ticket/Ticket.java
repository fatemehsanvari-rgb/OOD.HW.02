package ticket;

import assignment.AssignmentStrategy;
import state.*;

public class Ticket {

    private int id;
    private String type;
    private TicketState currentState;
    private AssignmentStrategy assignmentStrategy;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
        this.currentState = new CreatedState();
    }

    public void setAssignmentStrategy(AssignmentStrategy strategy) {
        this.assignmentStrategy = strategy;
    }

    public void assign() {
        if (assignmentStrategy != null) {
            assignmentStrategy.assign(this);
        }
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
