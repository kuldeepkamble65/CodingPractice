package Unchecked;

public class Demo {
    public static void main(String[] args) {

//        int a=100, b=0, c;
//        c=a/b;
//        System.out.println(c);

        try{
            int a=100, b=2, c;
            c=a/b;
            System.out.println(c);
        }//catch (ArithmeticException e){
        //  e.printStackTrace();
        //   System.out.println(e);
          //    System.out.println(e.getMessage());



      //      System.out.println("hello");
       // }
        finally {
            System.out.println("i am in finally");
        }


    }
}
