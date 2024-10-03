package Pattern;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int number =1;
            for(int k=1; k<=i;k++){
                System.out.print(number+" ");
                number = number * (i - k) / k;
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
