package HackerEarthProblem;

import java.util.*;

public class HackerEartthPractice1 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            Map<Integer, Integer> singerCount = new HashMap<>();
            int maxCount = 0;

            for (int i = 0; i < n; i++) {
                int singer = arr[i];
                int count = singerCount.getOrDefault(singer, 0) + 1;
                singerCount.put(singer, count);

                if (count > maxCount) {
                    maxCount = count;
                }
            }
            int numFavoriteSingers = 0;
            for (int i = 0; i < n; i++) {
                int singer = arr[i];
                int count = singerCount.get(singer);
                if (count == maxCount) {
                    numFavoriteSingers++;
                    singerCount.put(singer, 0);
                }
            }
            System.out.println(numFavoriteSingers);

            sc.close();
        }
    }
