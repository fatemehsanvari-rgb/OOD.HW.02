package state;

import ticket.Ticket;

public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        ticket.assign(); // Strategy Pattern
        System.out.println("Ticket assigned. Processing...");
        ticket.changeState(new InProgressState());
    }
}
