package state;

import ticket.Ticket;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket in progress...");
        ticket.respond();  
        ticket.changeState(new ResolvedState());
    }
}
