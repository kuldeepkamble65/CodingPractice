package Generics_Method;

public class GenricsMethod {
    public <E> void printArray(E s[]){
        for(int i=0; i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        GenricsMethod g1 = new GenricsMethod();
        String[] countries = {"India", "USA", "japan"};
        g1.printArray(countries);
        Integer[] number = {10,30,20};
        g1.printArray(number);
    }
}
