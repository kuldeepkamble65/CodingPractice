package Methods;

public class StringMethods {

    public static void main(String[] args) {
        String originalString = "Hello World";

        // length of the string
        int length = originalString.length();
        System.out.println("Length of the String "+length);

        //charAt to find index
        char charIndex = originalString.charAt(4);
        System.out.println("Character at index 4  "+charIndex);

        // substring
        String subString = originalString.substring(2,8);
        System.out.println("Substring from index 2 to 8: " + subString);

        // concat method
        String concatString = originalString.concat(" How are you?");
        System.out.println("Concatenated string: " + concatString);

        //idEqual
        boolean isEqual = originalString.equals("Hello, World!");
        System.out.println("Is it equal to 'Hello, World!': " + isEqual);

        boolean isEqualIgnoreCase = originalString.equalsIgnoreCase("hello, world!");
        System.out.println("Is it equal to 'hello, world!': " + isEqualIgnoreCase);

        int indexOfWorld = originalString.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        String replacedString = originalString.replace("Hello", "Hi");
        System.out.println("Replaced string: " + replacedString);

        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercased string: " + lowercaseString);


        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercased string: " + uppercaseString);

        String stringWithWhitespace = "   Hello, World!   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // split method
        String text = "apple,banana,cherry,grape";

        // Split the string by comma (`,`) delimiter
        String[] fruits = text.split(",");

        // Print each element in the resulting array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}
