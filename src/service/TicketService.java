package service;

import factory.*;
import ticket.Ticket;

public class TicketService {

    public Ticket createTicket(String channel, int id, String type) {
        TicketFactory factory;

        if (channel.equalsIgnoreCase("WEB")) {
            factory = new WebTicketFactory();
        } else if (channel.equalsIgnoreCase("EMAIL")) {
            factory = new EmailTicketFactory();
        } else {
            throw new IllegalArgumentException("Unknown channel");
        }

        return factory.createTicket(id, type);
    }
}
