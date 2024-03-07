package LinkedList1;

public class Playlist {
    Song head;

    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void displayPlaylist() {
        Song current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    public void removeSong(String title) {
        if (head != null && head.title.equals(title)) {
            head = head.next;
            return;
        }

        Song current = head;
        Song previous = null;
        while (current != null) {
            if (current.title.equals(title)) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}
