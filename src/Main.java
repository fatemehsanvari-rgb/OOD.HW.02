import service.TicketService;
import ticket.Ticket;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        // -------- ایجاد Ticket از کانال WEB --------
        System.out.println("=== Creating BUG Ticket from WEB ===");

        Ticket bugTicket = ticketService.createTicket(
                "WEB",      // channel
                1,          // id
                "BUG"       // type
        );

        // -------- پردازش Ticket (State flow) --------
        ticketService.processTicket(bugTicket); // Created -> Assigned
        ticketService.processTicket(bugTicket); // Assigned -> InProgress
        ticketService.processTicket(bugTicket); // InProgress -> Resolved
        ticketService.processTicket(bugTicket); // Resolved -> Closed
        ticketService.processTicket(bugTicket); // Closed (no change)

        System.out.println("\n-----------------------------------\n");

        // -------- ایجاد Ticket عمومی از کانال EMAIL --------
        System.out.println("=== Creating GENERAL Ticket from EMAIL ===");

        Ticket generalTicket = ticketService.createTicket(
                "EMAIL",    // channel
                2,          // id
                "GENERAL"   // type
        );

        // -------- پردازش Ticket --------
        ticketService.processTicket(generalTicket);
        ticketService.processTicket(generalTicket);
        ticketService.processTicket(generalTicket);
        ticketService.processTicket(generalTicket);
        ticketService.processTicket(generalTicket);
    }
}