package response;

import ticket.Ticket;

public class GeneralResponseStrategy implements ResponseStrategy {

    @Override
    public void respond(Ticket ticket) {
        System.out.println(
            "Sending general response for ticket " + ticket.getId()
        );
    }
}
