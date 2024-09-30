package HackerEarthProblem;

import java.util.Scanner;

public class DivisibiltyProblem {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int []data = new int[size];
        for(int i=0;i<size;i++) {
            data[i] = s.nextInt();
        }
            String check = checkDivisibleNumber(data);
            System.out.println(check);
        }
        public static int lastDigit(int data[]){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<data.length;i++){
                int num = data[i]%10;
                sb.append(num);
            }
            return Integer.parseInt(sb.toString());
        }
        public static String checkDivisibleNumber(int arr[]){
            int number = lastDigit(arr);
            if(number%10==0){
                return "YES";
            }else{
                return "No";
            }
        }

    }

