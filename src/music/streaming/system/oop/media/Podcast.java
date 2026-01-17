
package music.streaming.system.oop.media;

import music.streaming.system.oop.interfaces.Downloadable;
import music.streaming.system.oop.interfaces.Playable;


public class Podcast extends Media implements Playable, Downloadable {
    private String host;
    private int episodeNumber;
    
    public Podcast(int id, String title, double duration, String host, int episodeNumber) {
        super(id, title, duration);
        this.host = host;
        this.episodeNumber = episodeNumber;
    }
    
    @Override
    public void play() {
        System.out.println("Playing podcast: " + getTitle() + " - Episode " + episodeNumber);
    }
    
    @Override
    public void download() {
        System.out.println("Downloading podcast: " + getTitle());
    }
    
    public String getHost() {
        return host;
    }
    
    public int getEpisodeNumber() {
        return episodeNumber;
    }
}
