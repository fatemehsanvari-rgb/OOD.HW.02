package state;

import ticket.Ticket;

public class ResolvedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved. Closing...");
        ticket.changeState(new ClosedState());
    }
}