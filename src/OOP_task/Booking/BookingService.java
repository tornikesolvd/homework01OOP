package OOP_task.Booking;

import OOP_task.Movie_MovieScreening.Screening;
import OOP_task.People.Customer;
import OOP_task.Products.Ticket;

public class BookingService {
    private static int bookingCounter;

    static {
        bookingCounter = 1000;
        System.out.println("BookingService initialized, starting ID: " + bookingCounter);
    }

    public Ticket bookTicket(Customer customer, Screening screening, int seatNumber) {
        if (!screening.isSeatAvailable()) {
            System.out.println("No seats left for " + screening.getMovie().getTitle());
            return null;
        }
        Ticket ticket = new Ticket(seatNumber, 12.5);
        ticket.setOccupied(true);
        screening.addTicket(ticket);
        bookingCounter++;

        System.out.println("Booked for " + customer.getName() + ", seat " + seatNumber);
        return ticket;
    }
}
