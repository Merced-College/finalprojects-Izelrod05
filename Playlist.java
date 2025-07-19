//creates simple linked list
public class Playlist{
    private static class Node {
        Song song;
        Node next;

        Node(Song song){
            this.song = song;
        }
    }
    private Node head;// start of playlist

    //adds song to end of playlist
    public void addSong(Song song){

        Node newNode = new Node(song);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next =newNode;
        }
    }
    //shows all playlist songs
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }
    }
}