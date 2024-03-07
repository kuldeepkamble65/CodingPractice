package Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {
    public Integer call() throws Exception
    {
        // Create random number generator
        Random generator = new Random();

        Integer randomNumber = generator.nextInt(5);

        // To simulate a heavy computation,
        // we delay the thread for some random time
        Thread.sleep(randomNumber * 1000);

        return randomNumber;
    }
    public static void main(String[] args) {
        CallableExample callable = new CallableExample();

        try {
            // Execute the Callable to get the result
            Integer result = (Integer) callable.call();

            System.out.println("Generated random number: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
