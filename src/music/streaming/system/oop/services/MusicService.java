package music.streaming.system.oop.services;
import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.interfaces.Searchable;
import music.streaming.system.oop.media.Media;
import music.streaming.system.oop.media.Podcast;
import music.streaming.system.oop.media.Song;

/**
 * MusicService acts as the central controller/manager for the entire system.
 * 
 * WHY: Serves as the data access layer - one place to manage all media,
 * making it easier to search, retrieve, and organize content.
 * 
 * @author Fro Wrya M Salih
 */
public class MusicService implements Searchable{
    /**
     * Stores all media (Songs, Podcasts) in one collection.
     * 
     * WHY: Uses polymorphism to treat different media types uniformly,
     * simplifying management and making it easy to add new media types.
     */
    private List<Media> mediaCollection;
    
    public MusicService() {
        this.mediaCollection = new ArrayList<>();
    }
    
    /**
     * Adds any type of media to the collection.
     * 
     * WHY: Polymorphism allows us to accept any Media subtype with one method.
     */
    public void addMedia(Media media) {
        mediaCollection.add(media);
    }
    
    /**
     * Searches through all system media by keyword.
     * 
     * WHY: Centralized search functionality - users don't need to know
     * how search works internally (abstraction).
     */
    @Override
    public List<Media> search(String keyword) {
        List<Media> results = new ArrayList<>();
        for (Media media : mediaCollection) {
            if (media.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(media);
            }
        }
        return results;
    }
    
    /**
     * Retrieves only songs from the collection.
     * 
     * WHY: Uses instanceof to filter specific types at runtime while
     * maintaining polymorphic storage benefits.
     */
    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();
        for (Media media : mediaCollection) {
            if (media instanceof Song) {
                songs.add((Song) media);
            }
        }
        return songs;
    }
    
    /**
     * Retrieves only podcasts from the collection.
     * 
     * WHY: Allows type-specific views (e.g., "Songs Only" page) while
     * keeping all media in one polymorphic collection.
     */
    public List<Podcast> getAllPodcasts() {
        List<Podcast> podcasts = new ArrayList<>();
        for (Media media : mediaCollection) {
            if (media instanceof Podcast) {
                podcasts.add((Podcast) media);
            }
        }
        return podcasts;
    }
}