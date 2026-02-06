package observer;

import ticket.Ticket;

public class LoggerListener implements TicketEventListener {

    @Override
    public void update(Ticket ticket, String message) {
        System.out.println(
            "[LOG] Ticket " + ticket.getId() + ": " + message
        );
    }
}
