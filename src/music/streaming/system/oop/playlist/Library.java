package music.streaming.system.oop.playlist;

import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.interfaces.Searchable;
import music.streaming.system.oop.interfaces.Playable;
import music.streaming.system.oop.media.Media;

/**
 * Stores and manages media items with search capability.
 * 
 * @param <T> the type of media stored, must extend Media
 * @author Arya Ali - generic library
 */
public class Library<T extends Media> implements Searchable, Playable{
    
    /** List of saved media items */
    private List<T> savedItems = new ArrayList<>();
    
    
    /**
     * constructor: Creates an empty library.
     */
    public Library() {
        this.savedItems = new ArrayList<>();
    }
    
     
    /**
     * method add(): Adds a media item to the library.
     * 
     * @param item the media item to add
     */
    public void add(T item) {
        savedItems.add(item);
    }
    
    
    
    /**
     * method remove():Removes a media item from the library.
     * 
     * @param item the media item to remove
     */
    public void remove(T item) {
        savedItems.remove(item);
    }
    
    
    
     /**
     * Searches for media by title keyword.
     * 
     * @param keyword the search term
     * @return list of media items with matching titles
     */
    @Override
    public List<Media> search(String keyword) {
        List<Media> results = new ArrayList<>();
        for (T media : savedItems) {
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
        if (savedItems.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("Playing entire library...");
        for (T item : savedItems) {
            item.play();
        }
    }
    
    
       /**
     * method List<T> getSavedItems(): Gets all saved items in the library.
     * 
     * @return the list of all saved media items
     */
    public List<T> getSavedItems() {
        return savedItems;
    }
    
}