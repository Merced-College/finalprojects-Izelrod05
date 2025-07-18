import java.util.*;
public class GenreRecommend{

    public static void recommend(List<Song> songs, String genre, int count){

        System.out.println("Recomendations for genre: " + genre);
        recommendRecursive(songs, genre, count, 0);
    }
    private static void recommendRecursive(List<Song> songs, String genre, int count, int index){
        if(count == 0 || index >= songs.size())return;
        Song current = songs.get(index);
        if (current.getGenre().equalsIgnoreCase(genre)) {
            System.out.println(current);
            recommendRecursive(songs, genre, count -1, index+1);
        }else{
            recommendRecursive(songs, genre, count, index+1);
        }
    }
}