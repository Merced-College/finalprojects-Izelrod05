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

        // Add some default songs
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

        




        

    }
}
