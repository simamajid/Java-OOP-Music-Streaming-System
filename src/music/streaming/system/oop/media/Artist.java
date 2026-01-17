package music.streaming.system.oop.media;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a music artist and their created content.
 * 
 * WHY THIS CLASS: Instead of storing artist as String in songs, we create
 * an Artist object to model real-world relationships and enable rich
 * behavior (get all songs by artist, manage discography, etc.).
 * 
 * @author Fro Wrya M Salih
 */
public class Artist {
    private String name;
    
    /**
     * WHY MAINTAIN THESE COLLECTIONS: Represents real-world relationships
     * where artists create albums and songs. Allows easy navigation
     * (Artist → Albums → Songs) and efficient queries.
     */
    private List<Album> albums;
    private List<Song> songs;
    
    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public List<Album> getAlbums() {
        return albums;
    }
    
    public List<Song> getSongs() {
        return songs;
    }
    
    /**
     * WHY: Maintains bidirectional relationship between Artist and Album,
     * enabling navigation in both directions and ensuring data integrity.
     */
    public void addAlbum(Album album) {
        albums.add(album);
    }
    
    /**
     * WHY: Allows direct access to all songs by an artist without
     * having to iterate through albums first.
     */
    public void addSong(Song song) {
        songs.add(song);
    }
}