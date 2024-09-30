package HackerEarthProblem;

import java.util.Scanner;

public class LaregeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k= sc.nextInt();
        System.out.println(largestNumber(n,k));

    }
    public static long largestNumber(long n, long k){
        for(long j=0; j<k; j++){
            long ans =0; long i=1;
            while (n/i>0){
                long temp = (n/(i*10)) * i + (n%i);
                i = i*10;
                ans = Math.max(ans, temp);
            }
            n = ans;
        }
        return n;
    }
}
