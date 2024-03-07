package Wait_Notify;

public class PzzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(30);
        Friends friends = new Friends(pizza);

        Cafe cafe = new Cafe(pizza);

        friends.start();
        cafe.start();
    }
}
