
package music.streaming.system.oop.playlist;

import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.interfaces.Searchable;
import music.streaming.system.oop.media.Media;


public class Library<T extends Media> implements Searchable {
    private List<T> savedItems = new ArrayList<>();
    
    public Library() {
        this.savedItems = new ArrayList<>();
    }
    
    public void add(T item) {
        savedItems.add(item);
    }
    
    public void remove(T item) {
        savedItems.remove(item);
    }
    
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
    
    public List<T> getSavedItems() {
        return savedItems;
    }
}

