import java.util.*;

public class Player{
    private Stack<Song> history = new Stack<>(); //tracks songs that have been played
    private Queue<Song> queue = new LinkedList<>(); //holds songs to be played next

    public void addToQueue(Song song){
        queue.add(song);
    }

    public void playNext(){
        if(!queue.isEmpty()){
            Song next =queue.poll();        //gets next song
            history.push(next);
            System.out.println("Playing: " + next);
        }else{
            System.out.println("Queue is empty.");

        }
    }
    //shows all previous songs played
    public void showHistory() {
        System.out.println("History:");
        for (Song song : history) {
            System.out.println(song);
        }
    }

}