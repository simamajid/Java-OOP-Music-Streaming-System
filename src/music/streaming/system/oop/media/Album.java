package music.streaming.system.oop.media;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an album that groups related songs together.
 * 
 * WHY THIS CLASS: Models real-world music structure where albums contain
 * multiple songs. Provides meaningful organization and navigation for users.
 * 
 * @author Fro Wrya M Salih
 */
public class Album {
    private String title;
    
    /**
     * WHY OBJECT REFERENCE: Stores Artist object (not just name String)
     * to maintain true relationship and ensure data consistency.
     */
    private Artist artist;
    
    /**
     * WHY COMPOSITION: Album "has" songs - this models the real-world
     * relationship where songs belong to albums.
     */
    private List<Song> songs;
    
    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    
    public String getTitle() {
        return title;
    }
    
    public Artist getArtist() {
        return artist;
    }
    
    public List<Song> getSongs() {
        return songs;
    }
    
    /**
     * WHY: Allows dynamic building of albums and maintains encapsulation
     * by letting Album manage its own song collection.
     */
    public void addSong(Song song) {
        songs.add(song);
    }
}

