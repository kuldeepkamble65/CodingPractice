public class SearchElement {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56, 78, 90};
        int target = 56;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " found in the array.");
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
