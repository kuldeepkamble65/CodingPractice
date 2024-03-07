import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

// Create an object of the non-generic ArrayList.
            ArrayList<String> al = new ArrayList<>(); // list 1 with default capacity 10.
            al.add("A");
            al.add("B");
            al.add("20");
            al.add("A");
            al.add(null);
            System.out.println(al);

// Create an object of another non-generic ArrayList.
            ArrayList al1 = new ArrayList(); // list 2.
            al1.add("a");
            al1.add("b");
            al1.add("c");

        }
    }
