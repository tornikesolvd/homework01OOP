import OOP_task.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Kino Rustaveli", "Tbilisi");

        Movie movie = new Movie("Goodfellas", 169, "Drama");
        TheaterHall hall = new TheaterHall(1, 3);
        Screening screening = new Screening(movie, hall, "19:00");

        Customer customer1 = new Customer("Giorgi", "giorgi@mail.com");
        Customer customer2 = new Customer("Vaja", "Vaja@mail.com");

        BookingService bookingService = new BookingService();
        bookingService.bookTicket(customer1, screening, 1);
        bookingService.bookTicket(customer2, screening, 2);

        System.out.println("\nTickets booked for this screening:");
        for (Ticket t : screening.getTickets()) {
            System.out.println("Seat " + t.getSeatNumber() + " | Price $" + t.getPrice() + " | Occupied: " + t.isOccupied());
        }

        Snack popcorn = new Snack("Popcorn", 5.0);
        Snack soda = new Snack("Soda", 3.0);

        SnackOrder order = new SnackOrder(customer1);
        order.addSnack(popcorn);
        order.addSnack(soda);

        System.out.println(customer1.getName() + " snack total: $" + order.calculateTotal());
        }
    }
