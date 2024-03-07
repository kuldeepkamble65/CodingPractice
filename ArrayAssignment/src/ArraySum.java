//In this code sumArray contains single loop
// the number of iterations in the loop is proportional to the input array
// therefore the time complexity is O(n)
//space complexity is O(1) because variables uses constant
// amount of memory That doesn't depend on size of the input
public class ArraySum {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
