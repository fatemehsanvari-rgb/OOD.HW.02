package factory;

import ticket.Ticket;

public abstract class TicketFactory {

    public abstract Ticket createTicket(int id, String type);
}
