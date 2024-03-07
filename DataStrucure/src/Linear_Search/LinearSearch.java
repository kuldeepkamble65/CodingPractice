package Linear_Search;

public class LinearSearch {
    public static int linearSearch(int[] Arr, int target) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
