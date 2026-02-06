package ticket;

import assignment.AssignmentStrategy;
import observer.TicketEventListener;
import response.ResponseStrategy;
import state.*;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private int id;
    private String type;

    private TicketState currentState;
    private AssignmentStrategy assignmentStrategy;
    private ResponseStrategy responseStrategy;

    private List<TicketEventListener> listeners = new ArrayList<>();

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
        this.currentState = new CreatedState();
    }

    // -------- Observer --------
    public void addListener(TicketEventListener listener) {
        listeners.add(listener);
    }

    public void notifyListeners(String message) {
        for (TicketEventListener listener : listeners) {
            listener.update(this, message);
        }
    }

    // -------- Assignment --------
    public void setAssignmentStrategy(AssignmentStrategy strategy) {
        this.assignmentStrategy = strategy;
    }

    public void assign() {
        if (assignmentStrategy != null) {
            assignmentStrategy.assign(this);
        }
    }

    // -------- Response --------
    public void setResponseStrategy(ResponseStrategy strategy) {
        this.responseStrategy = strategy;
    }

    public void respond() {
        if (responseStrategy != null) {
            responseStrategy.respond(this);
        }
    }

    // -------- State --------
    public void handleRequest() {
        currentState.handle(this);
    }

    public void changeState(TicketState newState) {
        this.currentState = newState;
        notifyListeners("State changed to " + newState.getClass().getSimpleName());
    }

    // -------- Getters --------
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
