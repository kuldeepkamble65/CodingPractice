package Generics_Method;


public class GenericMethodExample {

    // Generic method to print the content of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // String array
        String[] strArray = {"apple", "banana", "orange"};
        System.out.print("String Array: ");
        printArray(strArray);

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Double Array: ");
        printArray(doubleArray);
    }
}

