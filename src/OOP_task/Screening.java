package OOP_task;

import java.util.ArrayList;
import java.util.List;

public class Screening { private Movie movie;
    private TheaterHall hall;
    private String time;
    private List<Ticket> tickets = new ArrayList<>();

    public Screening(Movie movie, TheaterHall hall, String time) {
        this.movie = movie;
        this.hall = hall;
        this.time = time;
    }

    public Movie getMovie() { return movie; }
    public TheaterHall getHall() { return hall; }
    public String getTime() { return time; }
    public List<Ticket> getTickets() { return tickets; }

    public boolean isSeatAvailable() {
        return tickets.size() < hall.getCapacity();
    }

    public void addTicket(Ticket ticket) {
        if (isSeatAvailable()) {
            tickets.add(ticket);
        } else {
            System.out.println("No seats available.");
        }
    }
}
