
package music.streaming.system.oop.interfaces;

import java.util.List;
import music.streaming.system.oop.media.Media;

/**
 *
 * @author Fro
 */
public interface Searchable {
    List<Media> search(String keyword);
}
