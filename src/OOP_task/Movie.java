package OOP_task;

public class Movie {
    private String title;
    private int duration;
    private String genre;

    public Movie(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}
