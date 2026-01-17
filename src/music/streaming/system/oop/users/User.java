
package music.streaming.system.oop.users;

import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.media.Media;
import music.streaming.system.oop.playlist.Library;
import music.streaming.system.oop.playlist.Playlist;

/**
 *
 * @author Sima
 */
public abstract class User {
    private int userId;
    private String username;
    private Library<Media> library;
    private List<Playlist> playlists;
    
    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
        this.library = new Library<>();
        this.playlists = new ArrayList<>();
    }
    
    public abstract void playMedia(Media media);
    
    public void createPlaylist(String name) {
        Playlist playlist = new Playlist();
        playlists.add(playlist);
    }
    
    public void addToLibrary(Media media) {
        library.add(media);
    }
    
    public int getUserId() {
        return userId;
    }
    
    public String getUsername() {
        return username;
    }
    
    public Library<Media> getLibrary() {
        return library;
    }
    
    public List<Playlist> getPlaylists() {
        return playlists;
    }
}