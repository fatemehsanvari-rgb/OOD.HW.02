package assignment;

import ticket.Ticket;

public class BugAssignmentStrategy implements AssignmentStrategy {

    @Override
    public void assign(Ticket ticket) {
        System.out.println("Assigning ticket " + ticket.getId() + " to BUG support team.");
    }
}
