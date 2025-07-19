
public class Song{

     String title;
     String genre;
     String artist;

    public Song(String title, String artist, String genre){
        if (isInvalid(title) || isInvalid(artist) || isInvalid(genre)) {
            throw new IllegalArgumentException("Title, artist, and genre must not be blank or contain numbers.");
        }

        this.title =title;
        this.artist = artist;
        this.genre = genre;
    }  
    private boolean isInvalid(String str){
        return str == null ||str.trim().isEmpty() || containsNumber(str);
    }
     private boolean containsNumber(String str) {
        return str.matches(".*\\d.*"); // returns true if any digit exists
    }
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public String getGenre(){return genre;}

    public String toString(){
        return title +" by "+ artist + " [" + genre  +"]";
    }


}