package LinkedList1;

public class Song {
    String title;
    String artist;
    Song next;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("------------");
    }
}
