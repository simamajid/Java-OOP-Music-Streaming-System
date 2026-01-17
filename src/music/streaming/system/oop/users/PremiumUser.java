
package music.streaming.system.oop.users;

import java.util.List;
import music.streaming.system.oop.interfaces.Downloadable;
import music.streaming.system.oop.media.Media;

/**
 *
 * @author Sima
 */
public class PremiumUser extends User {
    
    public PremiumUser(int userId, String username) {
        super(userId, username);
    }
    
    @Override
    public void playMedia(Media media) {
        media.play();
    }
    
    public void downloadMedia(Media media) {
        if (media instanceof Downloadable) {
            ((Downloadable) media).download();
        }
    }
    
    public void downloadAllMedia(List<Media> mediaList) {
        for (Media media : mediaList) {
            if (media instanceof Downloadable) {
                ((Downloadable) media).download();
            }
        }
    }
}
