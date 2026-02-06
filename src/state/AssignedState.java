package state;

import ticket.Ticket;

public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket assigned. Processing...");
        ticket.changeState(new InProgressState());
    }
}