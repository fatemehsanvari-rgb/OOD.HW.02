package state;

import ticket.Ticket;

public class ClosedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket already closed.");
    }
}