
package music.streaming.system.oop.media;

import music.streaming.system.oop.interfaces.Downloadable;
import music.streaming.system.oop.interfaces.Playable;

/**
 * Represents a song in the music streaming system.
 * A song extends the Media class and implements both Playable and Downloadable
 * interfaces, allowing it to be played and downloaded.
 * 
 * @author Lanya Kamal
 */
public class Song extends Media implements Playable, Downloadable {
    private String artist;
    private String genre;
    
    /**
     * Constructs a new Song object with the specified properties.
     * 
     * @param id the unique identifier for the song
     * @param title the title of the song
     * @param duration the duration of the song in minutes
     * @param artist the name of the artist who performed the song
     * @param genre the musical genre of the song
     */
    public Song(int id, String title, double duration, String artist, String genre) {
        super(id, title, duration);
        this.artist = artist;
        this.genre = genre;
    }
    
    /**
     * Plays the song and displays playback information to the console.
     * Outputs the song title and artist name.
     */
    @Override
    public void play() {
        System.out.println("Playing song: " + getTitle() + " by " + artist);
    }
    
    /**
     * Downloads the song and displays download information to the console.
     * Outputs the song title being downloaded.
     */
    @Override
    public void download() {
        System.out.println("Downloading song: " + getTitle());
    }
    
    /**
     * Gets the artist of the song.
     * 
     * @return the artist name
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * Gets the genre of the song.
     * 
     * @return the musical genre
     */
    public String getGenre() {
        return genre;
    }
}
