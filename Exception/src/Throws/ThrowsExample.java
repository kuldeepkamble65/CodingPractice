package Throws;

public class ThrowsExample {
    public static void main(String[] args) {
    ThrowsExample t1 = new ThrowsExample();
    t1.divide();
        System.out.println("Hello");
    }
    void divide(){
        int a=100, b=0, c;
        c = a/b;
        System.out.println(c);
    }
}
