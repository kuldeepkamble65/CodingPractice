package HackerEarthProblem;

import java.util.*;

public class SortedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int k=0;k<t;k++) {
            String str = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

            }

        List<Character> charList = new ArrayList<>(map.keySet());


        Collections.sort(charList, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int countCompare = map.get(a).compareTo(map.get(b));
                if (countCompare == 0) {
                    return a.compareTo(b);
                } else {
                    return countCompare;
                }
            }
        });
        StringBuilder sortedString = new StringBuilder();
        for (char ch : charList) {
            int count = map.get(ch);
            for (int j = 0; j < count; j++) {
                sortedString.append(ch);
            }
        }
        System.out.println(sortedString);
    }

        }
}
