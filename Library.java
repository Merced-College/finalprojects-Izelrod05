import java.util.*;
//uses hashmap to organize songs by genre
public class Library{
    private Map<String, List<Song>> genreMap = new HashMap<>();
    //adds song to corresponding genre list
    public void addSong(Song song){
        genreMap.computeIfAbsent(song.getGenre(), k -> new ArrayList<>()).add(song);
    }
    //song retriver based on genre
    public List<Song> getSongsByGenre(String genre){
        return genreMap.getOrDefault(genre, new ArrayList<>());
    }
    //prints song by genre
    public void showAllSongs() {
        for (String genre : genreMap.keySet()) {
            System.out.println("Genre: " + genre);
            for (Song s : genreMap.get(genre)) {
                System.out.println("  " + s);
            }
        }
    }
}