package music.streaming.system.oop.media;

/**
 * Abstract base class representing generic media content in a streaming system.
 * This class provides common properties and behaviors shared by all media types
 * such as songs, podcasts, and videos.
 * 
 * @author Lanya Kamal
 * 
 */
public abstract class Media {
    private int id;
    private String title;
    private double duration;

    /**
     * Constructs a new Media object with the specified properties.
     * 
     * @param id the unique identifier for the media
     * @param title the title of the media content
     * @param duration the duration of the media in minutes
     */
    public Media(int id, String title, double duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    /**
     * Plays the media content.
     * This method must be implemented by subclasses to define
     * specific playback behavior.
     */
    public abstract void play();

    /**
     * Gets the unique identifier of the media.
     * 
     * @return the media ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the title of the media content.
     * 
     * @return the media title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the duration of the media content.
     * 
     * @return the duration in minutes
     */
    public double getDuration() {
        return duration;
    }
}
