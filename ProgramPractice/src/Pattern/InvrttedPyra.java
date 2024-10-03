package Pattern;

public class InvrttedPyra {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n;i++){
           int number = n-i+1;
            for(int k=1; k<=n-i+1;k++){
                System.out.print(i+"");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
