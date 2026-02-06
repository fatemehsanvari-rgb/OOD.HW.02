package state;

import ticket.Ticket;

public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        ticket.assign(); 
        System.out.println("Ticket assigned. Processing...");
        ticket.changeState(new InProgressState());
    }
}
