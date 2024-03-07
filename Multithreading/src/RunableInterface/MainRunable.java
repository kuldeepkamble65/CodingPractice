package RunableInterface;

public class MainRunable {
    public static void main(String[] args) {
        RunaableThread runable = new RunaableThread();
        Thread thread = new Thread(runable);
        thread.start();
    }
}
