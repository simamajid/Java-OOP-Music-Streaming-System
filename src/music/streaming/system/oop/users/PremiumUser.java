package music.streaming.system.oop.users;

import music.streaming.system.oop.interfaces.Downloadable;
import music.streaming.system.oop.media.Media;

/**
 * Represents a premium user in the music streaming system.
 * A premium user can play media without advertisements
 * and is allowed to download downloadable media.
 *
 * @author Sima Majid Rashid
 */
public class PremiumUser extends User {

    /**
     * Constructs a PremiumUser with a unique user ID and username.
     *
     * @param userId   unique identifier for the user
     * @param username the user's display name
     */
    public PremiumUser(int userId, String username) {
        super(userId, username);
    }

    /**
     * Plays the given media without ads.
     * This method demonstrates polymorphism because the actual
     * play() method executed depends on the runtime type of Media
     * (Song, Podcast, etc.).
     *
     * @param media the media object to be played
     */
    @Override
    public void playMedia(Media media) {
        media.play();
    }

    /**
     * Downloads the given media if it supports downloading.
     * instanceof is used to verify that the media object supports downloading before casting and calling the method, 
     * preventing runtime errors.
     *
     * @param media the media object to download
     */
    public void downloadMedia(Media media) {
        if (media instanceof Downloadable) {
            ((Downloadable) media).download();
        }
    }
}
