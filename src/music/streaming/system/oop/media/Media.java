package music.streaming.system.oop.media;

public abstract class Media {

    private int id;
    private String title;
    private double duration;

    public Media(int id, String title, double duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public abstract void play();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
}
