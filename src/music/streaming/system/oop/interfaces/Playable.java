package music.streaming.system.oop.interfaces;

/**
 * Interface for media content that can be played.
 * Classes implementing this interface must provide functionality
 * to play media content.
 * 
 * @author Lanya Kamal
 * 
 */
public interface Playable {
    /**
     * Plays the media content.
     * Implementing classes should define the specific playback behavior.
     */
    void play();
}