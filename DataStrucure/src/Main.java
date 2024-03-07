// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int a[] ={10,3,6,7,3,9,5};

       for(int i=0;i<a.length; i++){
           System.out.print(a[i]+ " ");
        }
            System.out.println();
       // Reverse order

        for(int i=a.length-1;i>=0 ;i--){
           System.out.print(a[i]+ " ");
        }
        System.out.println();

       String[] s = {"Kuldeep","ram", "sham","kk"};

       String[] s1 = new String[s.length];

        for(int i=0; i<s.length;i++){
            s1[i] = s[i];
            System.out.print(s1[i]+ " ");

        }

    }
}