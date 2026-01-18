package music.streaming.system.oop.users;

import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.media.Media;
import music.streaming.system.oop.playlist.Library;
import music.streaming.system.oop.playlist.Playlist;

/**
 * Represents a generic user in the music streaming system.
 * 
 * This abstract class defines common attributes and behaviors
 * shared by all user types (e.g., FreeUser, PremiumUser).
 * Specific playback behavior is delegated to subclasses.
 * 
 *
 * @author Sima Majid Rashid
 */
public abstract class User {

    /** Unique identifier for the user */
    private int userId;

    /** Username chosen by the user */
    private String username;

    /**
     * Personal media library owned by the user.
     * Uses Library<Media> to store different types of media
     * while ensuring type safety and polymorphic behavior.
     */
    private Library<Media> library;

    /**
     * Collection of playlists created by the user.
     * A List is used to allow dynamic resizing.
     */
    private List<Playlist> playlists;

    /**
     * Constructs a User with an ID and username.
     * 
     * Initializes the user's library and playlist list to ensure
     * the object is ready for use immediately after creation.
     *
     * @param userId   unique identifier for the user
     * @param username display name of the user
     */
    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
        this.library = new Library<>();
        this.playlists = new ArrayList<>();
    }

    /**
     * Plays a media item.
     * 
     * This method is abstract because playback behavior
     * differs between user types (e.g., ads for free users,
     * no ads for premium users).
     *
     * @param media the media object to be played
     */
    public abstract void playMedia(Media media);

    /**
     * Creates a new playlist and adds it to the user's playlists.
     *
     * @param name the name of the playlist
     */
    public void createPlaylist(String name) {
        Playlist playlist = new Playlist();
        playlists.add(playlist);
    }

    /**
     * Adds a media item to the user's library.
     *
     * @param media the media item to be added
     */
    public void addToLibrary(Media media) {
        library.add(media);
    }

    /**
     * Returns the user's unique ID.
     *
     * @return user ID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Returns the username.
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the user's media library.
     *
     * @return library of media items
     */
    public Library<Media> getLibrary() {
        return library;
    }

    /**
     * Returns the list of playlists created by the user.
     *
     * @return list of playlists
     */
    public List<Playlist> getPlaylists() {
        return playlists;
    }
}
