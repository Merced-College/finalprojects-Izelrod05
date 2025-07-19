/*Izel Rodriguez Diaz
*07/18/2025
*This is my final prject for CPSC-39 it is a music library that allows the user 
*to add new songs view prevous songs played play new songs
*get recomendations etc, This project is a continuation
*of my first ever project which i did in my junior year of 
*highschool which was a simple song recomender the song file 
*and genre recomender are edited and improved version of the older version along with main 
*the other files though are completley new
*/

import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Playlist playlist = new Playlist();
        Player player = new Player();
        List<Song> allSongs = new ArrayList<>();

        //  some default songs
        Song s1 = new Song("Lose Yourself", "Eminem", "Hip-Hop");
        Song s2 = new Song("Bohemian Rhapsody", "Queen", "Rock");
        Song s3 = new Song("Yesterday", "The Beatles", "Pop");
        Song s4 = new Song("HUMBLE.", "Kendrick Lamar", "Hip-Hop");
        Song s5 = new Song("Come Together", "The Beatles", "Pop");

        for(Song s:List.of(s1,s2,s3,s4,s5)){
            library.addSong(s);
            playlist.addSong(s);
            player.addToQueue(s);
            allSongs.add(s);
        }

         // Interactive Menu
        while (true) {
            System.out.println("\n==== TerminalTune Menu ====");
            System.out.println("1. Add a new song");
            System.out.println("2. View all songs");
            System.out.println("3. Add song to playlist");
            System.out.println("4. Show playlist");
            System.out.println("5. Play next song");
            System.out.println("6. Show playback history");
            System.out.println("7. Recommend songs by genre");
            System.out.println("8. Exit");
            System.out.print("Choose an option (1–8): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1 -> {
                    try{
                     System.out.print("Enter song title: ");
                     String title = scanner.nextLine();
                     System.out.print("Enter artist: ");
                     String artist = scanner.nextLine();
                     System.out.print("Enter genre: ");
                     String genre = scanner.nextLine();

                     Song newSong = new Song(title, artist, genre);
                     library.addSong(newSong);
                     allSongs.add(newSong);
                     System.out.println("Song added to library.");
                   }catch (IllegalArgumentException e) {
                     System.out.println("Error: " + e.getMessage());
                  }
                }
                
                case 2 -> {
                    System.out.println("--- All Songs in Library ---");
                    library.showAllSongs();
                }
                case 3 -> {
                    System.out.print("Enter title of song to add to playlist: ");
                    String title = scanner.nextLine();
                    Optional<Song> song = allSongs.stream()
                            .filter(s -> s.getTitle().equalsIgnoreCase(title))
                            .findFirst();
                    if (song.isPresent()) {
                        playlist.addSong(song.get());
                        player.addToQueue(song.get());
                        System.out.println("Song added to playlist and queue.");
                    } else {
                        System.out.println("Song not found.");
                    }
                }
                case 4 -> {
                    System.out.println("--- Playlist ---");
                    playlist.display();
                }
                case 5 -> {
                    player.playNext();
                }
                case 6 -> {
                    player.showHistory();
                }
                case 7 -> {
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("How many recommendations? ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    GenreRecommend.recommend(allSongs, genre, count);
                }
                case 8 -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again."); 
            }
        }
    }
}
