package Thread_Seanario;

public class Print {
    int i=0;
    public Print(int i) {
        this.i=i;
    }

    public Print() {
    }

    public void print(int i){

        int sum = i+2;
        System.out.println("sum is "+sum);
    }
    public void print(){

        int sum = i+2;
        System.out.println("sum is "+sum);
    }
}
