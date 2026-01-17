package music.streaming.system.oop.interfaces;
import java.util.List;
import music.streaming.system.oop.media.Media;

/**
 * Defines a contract for any class that can perform search operations.
 * 
 * WHY INTERFACE: Guarantees that any searchable class (MusicService, Library)
 * provides a search() method, even if they search different collections.
 * This enforces consistent behavior across the system.
 * 
 * @author Fro Wrya M Salih
 */
public interface Searchable {
    /**
     * Searches for media by keyword.
     * 
     * WHY: Different implementations can search different data sources
     * (MusicService searches all system media, Library searches user's
     * personal collection) while maintaining the same contract.
     */
    List<Media> search(String keyword);
}