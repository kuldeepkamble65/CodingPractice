package LinkedList1;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSong("Song 1", "Artist A");
        playlist.addSong("Song 2", "Artist B");
        playlist.addSong("Song 3", "Artist A");

        // Displaying the playlist
        System.out.println("Current Playlist:");
        playlist.displayPlaylist();

        // Removing a song from the playlist
        playlist.removeSong("Song 2");
        System.out.println("\nUpdated Playlist after removing 'Song 2':");
        playlist.displayPlaylist();
    }
}
