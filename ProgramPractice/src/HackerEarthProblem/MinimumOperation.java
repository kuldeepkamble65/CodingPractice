package HackerEarthProblem;

import java.util.Scanner;

public class MinimumOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextLong();
        }
        int count=1;
        for(int i=1;i<n;i++) {
            if (a[i] == a[i - 1]){
                continue;
        } else{
            count++;
        }
        }

        System.out.println(count);
    }
}
