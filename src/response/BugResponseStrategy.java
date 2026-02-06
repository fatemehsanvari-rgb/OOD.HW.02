package response;

import ticket.Ticket;

public class BugResponseStrategy implements ResponseStrategy {

    @Override
    public void respond(Ticket ticket) {
        System.out.println(
            "Sending technical response for BUG ticket " + ticket.getId()
        );
    }
}
