package music.streaming.system.oop.interfaces;

/**
 * Defines the ability for media to be downloaded.
 * 
 * WHY INTERFACE: Not all media should be downloadable (based on user type
 * or media type). Using an interface allows selective implementation
 * rather than forcing all Media classes to have download capability.
 * 
 * @author Fro Wrya M Salih
 */
public interface Downloadable {
    /**
     * Downloads the media content.
     * 
     * WHY: Separates download behavior from core Media functionality,
     * allowing control over which media types and which user types
     * can download (e.g., Premium users only).
     */
    void download();
}