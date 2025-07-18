import java.util.*;

public class Player{
    private Stack<Song> history = new Stack<>();
    private Queue<Song> queue = new LinkedList<>();

    public void addToQueue(Song song){
        queue.add(song);
    }

    public void playNext(){
        if(!queue.isEmpty()){
            Song next =queue.poll();
            history.push(next);
            System.out.println("Playing: " + next);
        }else{
            System.out.println("Queue is empty.");

        }
    }
    public void showHistory() {
        System.out.println("History:");
        for (Song song : history) {
            System.out.println(song);
        }
    }

}