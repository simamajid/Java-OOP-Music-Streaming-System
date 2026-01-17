
package music.streaming.system.oop.media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class Album {
    private String title;
    private Artist artist;
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
    
    public void addSong(Song song) {
        songs.add(song);
    }
}


