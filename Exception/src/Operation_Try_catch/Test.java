package Operation_Try_catch;

public class Test {
    public static void main(String[] args) {
        // without catch error
//        try{
//            System.out.println("Try block");
//        }

        try{


        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        // not write same exception class
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        // cannot write child exception after parent exception
//        catch (ArithmeticException a){
//            System.out.println(a.getMessage());
//        }

        finally {
            System.out.println("I am in finally block");
            try{

            }catch (Exception e){
                
            }
        }
        // after finlly we cannot write catch
       // catch (ArithmeticException e){

   //     }

        // we can write try catch after finally

        try{

        }catch (Exception e1){

        }


    }
}
