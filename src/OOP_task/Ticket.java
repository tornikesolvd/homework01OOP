package OOP_task;

public class Ticket extends Product{
    private int seatNumber;
    private boolean occupied;

    public Ticket(int seatNumber, double price) {
        super("Movie Ticket", price);
        this.seatNumber = seatNumber;
        this.occupied = false;
    }

    public int getSeatNumber() { return seatNumber; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }

    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
}
