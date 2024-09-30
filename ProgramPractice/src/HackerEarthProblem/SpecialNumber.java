package HackerEarthProblem;

import java.util.Scanner;

public class SpecialNumber {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static boolean isSpecial(int n) {
        return sumOfDigits(n) % 4 == 0;
    }
    public static int findSpecialNo(int a) {
        while (!isSpecial(a)){
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T;i++){
            int n = sc.nextInt();
            int specialNo = findSpecialNo(n);
            System.out.println(specialNo);
        }

    }
}
