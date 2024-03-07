package Polymorphism;

public class MainMediaPlayer {
    public static void main(String[] args) {
        MediaPlayer media1 = new AudioPlayer();
        MediaPlayer media2 = new VideoPlayer();

        media1.play(); // Calls the play() method of the AudioPlayer class
        media2.play(); // Calls the play() method of the VideoPlayer class
    }
}
