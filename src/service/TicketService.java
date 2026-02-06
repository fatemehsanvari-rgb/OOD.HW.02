package service;

import assignment.*;
import factory.*;
import observer.LoggerListener;
import response.*;
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

        Ticket ticket = factory.createTicket(id, type);

        // Observer
        ticket.addListener(new LoggerListener());

        // Strategies
        if (type.equalsIgnoreCase("BUG")) {
            ticket.setAssignmentStrategy(new BugAssignmentStrategy());
            ticket.setResponseStrategy(new BugResponseStrategy());
        } else {
            ticket.setAssignmentStrategy(new GeneralAssignmentStrategy());
            ticket.setResponseStrategy(new GeneralResponseStrategy());
        }

        return ticket;
    }

    public void processTicket(Ticket ticket) {
        ticket.handleRequest();
    }
}
