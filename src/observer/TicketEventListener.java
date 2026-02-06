package observer;

import ticket.Ticket;

public interface TicketEventListener {
    void update(Ticket ticket, String message);
}
