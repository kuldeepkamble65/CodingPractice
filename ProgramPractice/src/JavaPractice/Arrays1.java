package JavaPractice;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n[] = new int[size];
        int x = 4;
        System.out.println("Enter the Numbers : ");

        for(int i=0; i<size; i++){
            n[i] = sc.nextInt();
            if(n[i] == x){
                System.out.println(i);
            }
        }

    }
}
