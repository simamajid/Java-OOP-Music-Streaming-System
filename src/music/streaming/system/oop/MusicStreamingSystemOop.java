package music.streaming.system.oop;

import java.util.List;
import music.streaming.system.oop.media.Media;
import music.streaming.system.oop.media.Podcast;
import music.streaming.system.oop.media.Song;
import music.streaming.system.oop.playlist.Playlist;
import music.streaming.system.oop.services.MusicService;
import music.streaming.system.oop.users.FreeUser;
import music.streaming.system.oop.users.PremiumUser;
import music.streaming.system.oop.users.User;

public class MusicStreamingSystemOop {

    public static void main(String[] args) {

        // Create media
        Song song1 = new Song(1, "Believer", 3.2, "Imagine Dragons", "Rock");
        Podcast podcast1 = new Podcast(2, "Tech Talk", 45.0, "Alex", 12);

        // Create service
        MusicService service = new MusicService();
        service.addMedia(song1);
        service.addMedia(podcast1);

        // Create users
        User freeUser = new FreeUser(101, "free_user");
        User premiumUser = new PremiumUser(102, "premium_user");

        // Test playing
        freeUser.playMedia(song1);
        premiumUser.playMedia(podcast1);

        // Test download (premium only)
        ((PremiumUser) premiumUser).downloadMedia(song1);
        ((PremiumUser) premiumUser).downloadMedia(podcast1);

        // Test playlists
        Playlist<Media> playlist = new Playlist<>();
        playlist.add(song1);
        playlist.add(podcast1);
        playlist.play();

        // Test library
        premiumUser.addToLibrary(song1);
        premiumUser.addToLibrary(podcast1);

        List<Media> results = premiumUser.getLibrary().search("Tech");
        System.out.println("Search results:");
        for (Media m : results) {
            System.out.println(m.getTitle());
        }
//        ----------------------------------------------------------------------------------

        Playlist<Media> empty = new Playlist<>();
        empty.play(); // should NOT crash
//------------------------------------------------------------------------------------------


    }
}
