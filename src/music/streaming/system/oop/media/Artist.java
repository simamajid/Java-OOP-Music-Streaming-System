
package music.streaming.system.oop.media;

import java.util.ArrayList;
import java.util.List;


public class Artist {
    private String name;
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
    
    public void addAlbum(Album album) {
        albums.add(album);
    }
    
    public void addSong(Song song) {
        songs.add(song);
    }
}


