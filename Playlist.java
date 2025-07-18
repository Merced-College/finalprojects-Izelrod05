public class Playlist{
    private static class Node {
        Song song;
        Node next;

        Node(Song song){
            this.song = song;
        }
    }
    private Node head;

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
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }
    }
}