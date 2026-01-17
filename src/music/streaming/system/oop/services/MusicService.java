
package music.streaming.system.oop.services;

import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.media.Media;
import music.streaming.system.oop.media.Podcast;
import music.streaming.system.oop.media.Song;

/**
 *
 * @author Fro
 */

    public class MusicService {
    private List<Media> mediaCollection;
    
    public MusicService() {
        this.mediaCollection = new ArrayList<>();
    }
    
    public void addMedia(Media media) {
        mediaCollection.add(media);
    }
    
    public List<Media> search(String keyword) {
        List<Media> results = new ArrayList<>();
        for (Media media : mediaCollection) {
            if (media.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(media);
            }
        }
        return results;
    }
    
    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();
        for (Media media : mediaCollection) {
            if (media instanceof Song) {
                songs.add((Song) media);
            }
        }
        return songs;
    }
    
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


    

