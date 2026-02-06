package factory;

import ticket.Ticket;

public class EmailTicketFactory extends TicketFactory {

    @Override
    public Ticket createTicket(int id, String type) {
        // تنظیمات مخصوص EMAIL اگر لازم باشد
        return new Ticket(id, type);
    }
}
