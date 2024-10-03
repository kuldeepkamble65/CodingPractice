package Pattern;

public class HollowButerfly {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int k = 1; k <= i; k++) {
                if (i % 2 == 0 && i != 4) {
                    System.out.print("*");  // For even rows except row 4, print consecutive stars
                } else if (i == 4) {
                    System.out.print(k % 2 == 0 ? " " : "*");  // For row 4, alternate stars and spaces
                } else {
                    System.out.print(k == 1 || k == i ? "*" : " ");  // For odd rows, only print stars at edges
                }
            }
            // Space between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int k = 1; k <= i; k++) {
                if (i % 2 == 0 && i != 4) {
                    System.out.print("*");
                } else if (i == 4) {
                    System.out.print(k % 2 == 0 ? " " : "*");
                } else {
                    System.out.print(k == 1 || k == i ? "*" : " ");
                }
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n - 1; i >= 1; i--) {
            // Left wing
            for (int k = 1; k <= i; k++) {
                if (i % 2 == 0 && i != 4) {
                    System.out.print("*");
                } else if (i == 4) {
                    System.out.print(k % 2 == 0 ? " " : "*");
                } else {
                    System.out.print(k == 1 || k == i ? "*" : " ");
                }
            }
            // Space between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int k = 1; k <= i; k++) {
                if (i % 2 == 0 && i != 4) {
                    System.out.print("*");
                } else if (i == 4) {
                    System.out.print(k % 2 == 0 ? " " : "*");
                } else {
                    System.out.print(k == 1 || k == i ? "*" : " ");
                }
            }
            System.out.println();
        }
    }

}
