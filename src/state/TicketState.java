package state;

import ticket.Ticket;

public interface TicketState {
    void handle(Ticket ticket);
}
