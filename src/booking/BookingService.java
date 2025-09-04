package booking;

import movie_moviescreening.Screening;
import people.Customer;
import products.Ticket;

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
