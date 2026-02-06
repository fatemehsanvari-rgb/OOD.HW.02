package assignment;

import ticket.Ticket;

public class GeneralAssignmentStrategy implements AssignmentStrategy {

    @Override
    public void assign(Ticket ticket) {
        System.out.println("Assigning ticket " + ticket.getId() + " to General support team.");
    }
}
