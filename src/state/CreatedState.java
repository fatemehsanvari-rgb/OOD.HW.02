package state;

import ticket.Ticket;

public class CreatedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket created. Assigning...");
        ticket.changeState(new AssignedState());
    }
}