package ThreadClass;

public class ThreadNamePriorityMain {
    public static void main(String[] args) {
        ThreadNamePriority thread = new ThreadNamePriority();
        thread.setName("Thread1");
        System.out.println(thread.getName());

        thread.setPriority(1);
        thread.start();

        ThreadNamePriority thread1 = new ThreadNamePriority();
        thread1.setName("Thread2");
        System.out.println(thread1.getName());

        thread1.setPriority(10);
        thread1.start();


    }
}
