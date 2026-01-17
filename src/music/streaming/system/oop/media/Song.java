
package music.streaming.system.oop.media;

import music.streaming.system.oop.interfaces.Downloadable;
import music.streaming.system.oop.interfaces.Playable;


public class Song extends Media implements Playable, Downloadable {
    private String artist;
    private String genre;
    
    public Song(int id, String title, double duration, String artist, String genre) {
        super(id, title, duration);
        this.artist = artist;
        this.genre = genre;
    }
    
    @Override
    public void play() {
        System.out.println("Playing song: " + getTitle() + " by " + artist);
    }
    
    @Override
    public void download() {
        System.out.println("Downloading song: " + getTitle());
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getGenre() {
        return genre;
    }
}
