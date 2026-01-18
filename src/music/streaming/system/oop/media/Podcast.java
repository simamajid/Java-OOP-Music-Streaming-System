package music.streaming.system.oop.media;

import music.streaming.system.oop.interfaces.Downloadable;
import music.streaming.system.oop.interfaces.Playable;

/**
 * Represents a podcast episode in the music streaming system.
 * A podcast extends the Media class and implements both Playable and Downloadable
 * interfaces, allowing it to be played and downloaded.
 * 
 * @author Lanya Kamal
 * 
 */
public class Podcast extends Media implements Playable, Downloadable {
    private String host;
    private int episodeNumber;

    /**
     * Constructs a new Podcast object with the specified properties.
     * 
     * @param id the unique identifier for the podcast episode
     * @param title the title of the podcast episode
     * @param duration the duration of the podcast episode in minutes
     * @param host the name of the podcast host
     * @param episodeNumber the episode number in the podcast series
     */
    public Podcast(int id, String title, double duration, String host, int episodeNumber) {
        super(id, title, duration);
        this.host = host;
        this.episodeNumber = episodeNumber;
    }

    /**
     * Plays the podcast episode and displays playback information to the console.
     * Outputs the podcast title and episode number.
     */
    @Override
    public void play() {
        System.out.println("Playing podcast: " + getTitle() + " - Episode " + episodeNumber);
    }

    /**
     * Downloads the podcast episode and displays download information to the console.
     * Outputs the podcast title being downloaded.
     */
    @Override
    public void download() {
        System.out.println("Downloading podcast: " + getTitle());
    }

    /**
     * Gets the host of the podcast.
     * 
     * @return the podcast host name
     */
    public String getHost() {
        return host;
    }

    /**
     * Gets the episode number of the podcast.
     * 
     * @return the episode number
     */
    public int getEpisodeNumber() {
        return episodeNumber;
    }
}
