package music.streaming.system.oop.playlist;

import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.interfaces.Playable;
import music.streaming.system.oop.interfaces.Searchable;
import music.streaming.system.oop.media.Media;
/**
 * Manages a collection of media items for sequential playback.
 * 
 * @param <T> the type of media stored, must extend Media
 * @author Arya Ali - generic playlist 
 */

public class Playlist<T extends Media> implements Searchable, Playable {
    
     /** List of media items in the playlist */
    private List<T> items = new ArrayList<>();

    
     /**
     * method add():Adds a media item to the end of the playlist.
     * 
     * @param item the media item to be added to the playlist,should not null.
     *            
     */
    public void add(T item) {
        items.add(item);
    }

    
 /**
     * method remove(): Removes a media item from the playlist.
     * 
     * @param item the media item to remove
     */
    public void remove(T item) {
        items.remove(item);
    }

      @Override
   public List<Media> search(String keyword) {
        List<Media> results = new ArrayList<>();
        for (T media : items) {
            if (media.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(media);
            }
        }
        return results;
    }
   
   
  /**
     * Plays all media items in the library sequentially.
     * Displays a message if the library is empty.
     */
    @Override
    public void play() {
        if (items.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("Playing entire library...");
        for (T item : items) {
            item.play();
        }
    }
    
    
    
    
    

/**
     * method List<T> getItems(): Returns the list of all media items in the playlist.
     * @return the list of all media items in the playlist.
     *     
     */
    public List<T> getItems() {
        return items;
    }

 
}