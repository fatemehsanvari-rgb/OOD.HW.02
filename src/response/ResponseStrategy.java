package response;

import ticket.Ticket;

public interface ResponseStrategy {
    void respond(Ticket ticket);
}
