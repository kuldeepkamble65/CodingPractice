import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");

        int[] myArray = new int[5];
        for(int i=0;i<myArray.length;i++){

            myArray[i] = sc.nextInt();
        }
        int arraySum = ArraySum.sumArray(myArray);
        System.out.println("Sum of the array: " + arraySum);
    }

}

