
public class Song{

     String title;
     String genre;
     String artist;

    public Song(String title, String artist, String genre){

        this.title =title;
        this.artist = artist;
        this.genre = genre;
    }  

    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public String getGenre(){return genre;}

    public String toString(){
        return title +" by "+ artist + " [" + genre  +"]";
    }


}