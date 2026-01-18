package music.streaming.system.oop.users;

import music.streaming.system.oop.media.Media;

/**
 * Represents a free user in the music streaming system.
 * 
 * A FreeUser can play media but is required to listen to advertisements
 * before playback. Free users also have a limited number of skips.
 * 
 *
 * This class extends the User base class and overrides the play behavior
 * to include advertisements.
 *
 * @author Sima Majid Rashid
 */
public class FreeUser extends User {

    /** 
     * Tracks how many times the user has skipped media.
     * Each FreeUser instance maintains its own skip count.
     */
    private int skipCount;

    /**
     * The maximum number of skips allowed for all free users.
     * 
     * This field is declared as {@code static} because the skip limit
     * is shared across all FreeUser objects, and as {@code final}
     * because this value represents a constant business rule that
     * must not change at runtime.
     * 
     */
    private static final int MAX_SKIPS = 6;

    /**
     * Constructs a FreeUser with the given user ID and username.
     * 
     * The skip count is explicitly initialized to zero to ensure
     * that each new free user starts with no skips used.
     * 
     *
     * @param userId   unique identifier for the user
     * @param username display name of the user
     */
    public FreeUser(int userId, String username) {
        super(userId, username);
        this.skipCount = 0;
    }

    /**
     * Plays the given media with advertisements.
     * <p>
     * This method overrides the base User behavior by displaying ads
     * before playing the media content.
     * </p>
     *
     * @param media the media object to be played
     */
    @Override
    public void playMedia(Media media) {
        System.out.println("Playing with ads...");
        showAd();
        media.play();
    }

    /**
     * Displays an advertisement to the user.
     * This method simulates the advertisement experience for free users.
     */
    public void showAd() {
        System.out.println("Advertisement playing...");
    }

    /**
     * Returns the current number of skips used by the user.
     *
     * @return the number of skips already used
     */
    public int getSkipCount() {
        return skipCount;
    }

    /**
     * Increments the skip count if the maximum limit
     * has not yet been reached.
     * 
     * This ensures that free users cannot exceed the allowed
     * number of skips.
     */
    public void incrementSkipCount() {
        if (skipCount < MAX_SKIPS) {
            skipCount++;
        }
    }
}
