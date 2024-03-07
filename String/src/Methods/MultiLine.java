package Methods;

public class MultiLine {

    public static void main(String[] args) {

        //To check if a string is empty you can use the isEmpty()
        String str = "Hello, World!";
        boolean isEmpty = str.isEmpty(); // false
        System.out.println(isEmpty);

        String emptyStr = "";
        boolean isEmptyEmpty = emptyStr.isEmpty();
        System.out.println(isEmptyEmpty); // true

        //A string is considered blank if it contains only whitespace characters or is empty.
        String str1 = "  \t   \n";
        boolean isBlank1 = str1.isBlank(); // true
        System.out.println(isBlank1);

        //trim() method to remove leading and trailing whitespace from a string and then check if the resulting string is empty.
        String str2 = "  Some Text  ";
        str = str2.trim(); // Removes leading and trailing spaces
        System.out.println(str);
        boolean isEmpty1 = str.isEmpty();
        System.out.println(isEmpty1);

    }
}
