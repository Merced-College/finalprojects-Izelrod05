import java.util.*;

public class Library{
    private Map<String, List<Song>> genreMap = new HashMap<>();

    public void addSong(Song song){
        genreMap.computeIfAbsent(song.getGenre(), k -> new ArrayList<>()).add(song);
    }

    public List<Song> getSongsByGenre(String genre){
        return genreMap.getOrDefault(genre, new ArrayList<>());
    }

    public void showAllSongs() {
        for (String genre : genreMap.keySet()) {
            System.out.println("Genre: " + genre);
            for (Song s : genreMap.get(genre)) {
                System.out.println("  " + s);
            }
        }
    }
}