
package music.streaming.system.oop.playlist;

import java.util.ArrayList;
import java.util.List;
import music.streaming.system.oop.interfaces.Playable;
import music.streaming.system.oop.media.Media;


public class Playlist<T extends Media> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

   public void play() {
    if (items.isEmpty()) {
        System.out.println("Playlist is empty.");
        return;
    }

    System.out.println("Playing playlist...");
    for (T item : items) {
        item.play();
    }
}


    public List<T> getItems() {
        return items;
    }
}


