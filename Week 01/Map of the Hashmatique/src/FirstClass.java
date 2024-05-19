import java.util.HashMap;
import java.util.Map;

public class FirstClass {

    public static void main(String[] args) {
        // Step 1: Create a HashMap to store track titles and lyrics
        HashMap<String, String> trackList = new HashMap<>();

        // Step 2: Add at least 4 songs to the trackList
        trackList.put("Song 1", "These are the lyrics of song 1.");
        trackList.put("Song 2", "These are the lyrics of song 2.");
        trackList.put("Song 3", "These are the lyrics of song 3.");
        trackList.put("Song 4", "These are the lyrics of song 4.");

        // Step 3: Retrieve a song by its track title
        String songTitle = "Song 2";
        String lyrics = trackList.get(songTitle);
        System.out.println("Lyrics of " + songTitle + ": " + lyrics);

        // Step 4: Iterate over the HashMap to print all track names and lyrics
        System.out.println("\nAll Tracks and their Lyrics:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println("Track: " + entry.getKey() + " - Lyrics: " + entry.getValue());
        }
    }
}
