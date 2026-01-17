
package music.streaming.system.oop.users;

import music.streaming.system.oop.media.Media;

/**
 *
 * @author Sima
 */
public class FreeUser extends User {
    private int skipCount;
    private static final int MAX_SKIPS = 6;
    
    public FreeUser(int userId, String username) {
        super(userId, username);
        this.skipCount = 0;
    }
    
    @Override
    public void playMedia(Media media) {
        System.out.println("Playing with ads...");
        showAd();
        media.play();
    }
    
    public void showAd() {
        System.out.println("Advertisement playing...");
    }
    
    public int getSkipCount() {
        return skipCount;
    }
    
    public void incrementSkipCount() {
        if (skipCount < MAX_SKIPS) {
            skipCount++;
        }
    }
}


