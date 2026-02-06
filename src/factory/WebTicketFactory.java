package factory;

import ticket.Ticket;

public class WebTicketFactory extends TicketFactory {

    @Override
    public Ticket createTicket(int id, String type) {
        return new Ticket(id, type);
    }
}
