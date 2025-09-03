package OOP_task;

public class TheaterHall {
    private int hallNumber;
    private int capacity;

    public TheaterHall(int hallNumber, int capacity) {
        this.hallNumber = hallNumber;
        this.capacity = capacity;
    }

    public int getHallNumber() { return hallNumber; }
    public void setHallNumber(int hallNumber) { this.hallNumber = hallNumber; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
